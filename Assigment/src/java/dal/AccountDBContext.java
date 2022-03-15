/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author tuann
 */
public class AccountDBContext extends DBContext{
    public Account getAccount(String username, String password){
        try {
            String sql = "SELECT Uid,username,password,displayname FROM Account\n" +
"                    WHERE username = ? AND password = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                Account account = new Account();
                account.setId(rs.getInt("Uid"));
                account.setName(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setDisplayname(rs.getString("displayname"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Account checkAccount(String username){
        try {
            String sql = "SELECT Uid,username,password,displayname FROM Account\n" +
"                    WHERE username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                Account account = new Account();
                account.setId(rs.getInt("Uid"));
                account.setName(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setDisplayname(rs.getString("displayname"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void addAccount(Account a)
    {
        String sql = "INSERT INTO [Account]\n" +
                        "           ([username]\n" +
                        "           ,[password]\n" +
                        "           ,[displayname])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, a.getName());
            stm.setString(2, a.getPassword());
            stm.setString(3, a.getDisplayname());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(stm != null)
            {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection !=null)
            {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void updateAccount(Account a)
    {
        String sql = "UPDATE [Account]\n" +
                    "SET [password] = ?\n" +
                    ",[displayname] = ?\n" +
                    " WHERE [username] = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(3, a.getName());
            stm.setString(1, a.getPassword());
            stm.setString(2, a.getDisplayname());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(stm != null)
            {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection !=null)
            {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void main(String[] args){
        AccountDBContext a = new AccountDBContext();
        Account b = new Account();
        b = a.checkAccount("mrb");
        System.out.println(b);
    }
}

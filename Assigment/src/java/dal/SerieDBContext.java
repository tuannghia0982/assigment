/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Category;
import model.Chapter;
import model.Country;
import model.Serie;

/**
 *
 * @author tuann
 */
public class SerieDBContext extends DBContext{
    public ArrayList<Serie> getSeriesNew()
    {
        ArrayList<Serie> series = new ArrayList<>();
        
        try {
            
            String sql1 ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.author, co.coname, ca.caname\n" +
"                        from Serie s inner join Category ca\n" +
"                        on s.caid = ca.caid\n" +
"                        inner join Country co\n" +
"                        on s.coid = co.coid\n"+
"                        order by sid asc";
            String sql2="select chapid, chapname, sid from Chapter\n" +
                        "where sid=?";
            PreparedStatement stm1 = connection.prepareStatement(sql1);
            ResultSet rs1 = stm1.executeQuery();
            
            
            while(rs1.next()){
                Serie s = new Serie();
                s.setId(rs1.getInt("sid"));
                int sid = s.getId();
                s.setName(rs1.getString("sname"));
                s.setImage(rs1.getString("image"));
                Category ca = new Category();
                ca.setId(rs1.getInt("caid"));
                ca.setName(rs1.getString("caname"));
                s.setCategory(ca);
                Country co = new Country();
                co.setId(rs1.getInt("coid"));
                co.setName(rs1.getString("coname"));
                s.setCountry(co);
                s.setDescription(rs1.getString("description"));
                
                PreparedStatement stm2 = connection.prepareStatement(sql2);
                stm2.setInt(1, sid);
                ResultSet rs2 = stm2.executeQuery();
                while(rs2.next()){
                    ArrayList<Chapter> chapters = new ArrayList<>();
                    Chapter c = new Chapter();
                    c.setId(rs2.getInt("chapid"));
                    c.setName(rs2.getString("chapname"));
                    c.setSid(rs2.getInt("sid"));
                    chapters.add(c);
                    s.setChapters(chapters);
                }
                series.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return series;
    }
    public ArrayList<Serie> getSeriesFav(int uid)
    {
        ArrayList<Serie> series = new ArrayList<>();
        
        try {
            
            String sql1 ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.author, co.coname, ca.caname \n" +
                        "from Serie s inner join Category ca\n" +
                        "on s.caid = ca.caid\n" +
                        "inner join Country co\n" +
                        "on s.coid = co.coid\n" +
                        "inner join favourite f\n" +
                        "on f.sid = s.sid\n" +
                        "inner join Account a\n" +
                        "on a.Uid = f.Uid\n" +
                        "where a.Uid = ?\n" +
                        "order by s.sid desc";
            String sql2="select chapid, chapname, sid from Chapter\n" +
                        "where sid=?";
            PreparedStatement stm1 = connection.prepareStatement(sql1);
            stm1.setInt(1, uid);
            ResultSet rs1 = stm1.executeQuery();
            
            
            while(rs1.next()){
                Serie s = new Serie();
                s.setId(rs1.getInt("sid"));
                int sid = s.getId();
                s.setName(rs1.getString("sname"));
                s.setImage(rs1.getString("image"));
                Category ca = new Category();
                ca.setId(rs1.getInt("caid"));
                ca.setName(rs1.getString("caname"));
                s.setCategory(ca);
                Country co = new Country();
                co.setId(rs1.getInt("coid"));
                co.setName(rs1.getString("coname"));
                s.setCountry(co);
                s.setDescription(rs1.getString("description"));
                PreparedStatement stm2 = connection.prepareStatement(sql2);
                stm2.setInt(1, sid);
                ResultSet rs2 = stm2.executeQuery();
                while(rs2.next()){
                    ArrayList<Chapter> chapters = new ArrayList<>();
                    Chapter c = new Chapter();
                    c.setId(rs2.getInt("chapid"));
                    c.setName(rs2.getString("chapname"));
                    c.setSid(rs2.getInt("sid"));
                    chapters.add(c);
                    s.setChapters(chapters);
                }
                series.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return series;
    }
    public Serie getSerie(String sid)
    {
        Serie s = new Serie();
        try {
            
            String sql ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.author, co.coname, ca.caname, s.quantity\n" +
"                        from Serie s inner join Category ca\n" +
"                        on s.caid = ca.caid\n" +
"                        inner join Country co\n" +
"                        on s.coid = co.coid\n" +
"                        where s.sid=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, sid);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                s.setId(rs.getInt("sid"));
                s.setName(rs.getString("sname"));
                s.setImage(rs.getString("image"));
                Category ca = new Category();
                ca.setId(rs.getInt("caid"));
                ca.setName(rs.getString("caname"));
                s.setCategory(ca);
                Country co = new Country();
                co.setId(rs.getInt("coid"));
                co.setName(rs.getString("coname"));
                s.setCountry(co);
                s.setDescription(rs.getString("description"));
                s.setAuthor(rs.getString("author"));
                s.setQuantity(rs.getInt("quantity"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    public ArrayList<Serie> getSeriesBy(int caid, int coid)
    {
        ArrayList<Serie> series = new ArrayList<>();
        try {
            
            String sql ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.author, co.coname, ca.caname\n" +
"                        from Serie s inner join Category ca\n" +
"                        on s.caid = ca.caid\n" +
"                        inner join Country co\n" +
"                        on s.coid = co.coid\n";
            if(caid>-1&& coid>-1){
                sql+="where ca.caid=? and co.coid=?\n"+
                        "order by s.sid desc";
            
            }if(caid>-1&&coid<0){
                sql+="where ca.caid=?\n"+
                        "order by s.sid desc";
            }
            if(coid>-1&&caid<0){
                sql+="where co.coid=?\n"+
                        "order by s.sid desc";
            }if(coid<0&&caid<0){
                sql+="order by s.sid desc";
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            if(caid>-1&& coid>-1){
                stm.setInt(1, caid);
                stm.setInt(2, coid);
            }if(caid>-1&&coid<0){
                stm.setInt(1, caid);
            }if(coid>-1&&caid<0){
                stm.setInt(1, coid);
            }

            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Serie s = new Serie();
                s.setId(rs.getInt("sid"));
                s.setName(rs.getString("sname"));
                s.setImage(rs.getString("image"));
                Category ca = new Category();
                ca.setId(rs.getInt("caid"));
                ca.setName(rs.getString("caname"));
                s.setCategory(ca);
                Country co = new Country();
                co.setId(rs.getInt("coid"));
                co.setName(rs.getString("coname"));
                s.setCountry(co);
                s.setDescription(rs.getString("description"));
                series.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return series;
    }
    public void addSerie(Serie s)
    {
        String sql = "INSERT INTO [Serie]\n" +
                    "           ([sname]\n" +
                    "           ,[image]\n" +
                    "           ,[caid]\n" +
                    "           ,[coid]\n" +
                    "           ,[description]\n" +
                    "           ,[author]\n" +
                    "           ,[quantity])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, s.getName());
            stm.setString(2, s.getImage());
            stm.setInt(3, s.getCategory().getId());
            stm.setInt(4, s.getCountry().getId());
            stm.setString(5, s.getDescription());
            stm.setString(6, s.getAuthor());
            stm.setInt(7, 0);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ArrayList<Serie> getSeriesBySearch(String sname)
    {
        ArrayList<Serie> series = new ArrayList<>();
        try {
            
            String sql ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.author, co.coname, ca.caname\n" +
"                        from Serie s inner join Category ca\n" +
"                        on s.caid = ca.caid\n" +
"                        inner join Country co\n" +
"                        on s.coid = co.coid\n" + 
                        "where sname like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%"+ sname +"%");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Serie s = new Serie();
                s.setId(rs.getInt("sid"));
                s.setName(rs.getString("sname"));
                s.setImage(rs.getString("image"));
                Category ca = new Category();
                ca.setId(rs.getInt("caid"));
                ca.setName(rs.getString("caname"));
                s.setCategory(ca);
                Country co = new Country();
                co.setId(rs.getInt("coid"));
                co.setName(rs.getString("coname"));
                s.setCountry(co);
                s.setDescription(rs.getString("description"));
                series.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return series;
    }
    
    public void addFav(int uid, int sid)
    {
        String sql = "INSERT INTO [Favourite]\n" +
                    "           ([Uid]\n" +
                    "           ,[sid])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, uid);
            stm.setInt(2, sid);
           
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(stm != null)
            {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection !=null)
            {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void delFav(int uid, int sid)
    {
        String sql = "DELETE FROM [Favourite]\n" +
                     "WHERE Uid=? and sid=?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, uid);
            stm.setInt(2, sid);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(stm != null)
            {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection !=null)
            {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public Serie checkFav(int uid, int sid){
        try {
            String sql = "select s.sid from serie s\n" +
                        "inner join favourite f \n" +
                        "on f.sid= s.sid\n" +
                        "where uid =? and s.sid=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, uid);
            stm.setInt(2, sid);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                Serie s = new Serie();
                s.setId(rs.getInt("sid"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public int getSid()
    {
        int sid;
        try {
            
            String sql ="select top 1 sid from Serie\n" +
                        "order by sid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                sid = rs.getInt("sid");
                return sid;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public static void main(String[] args){
        SerieDBContext a = new SerieDBContext();
        Serie b = a.getSerie("1");
//        int s = a.getSid();
        System.out.println(b);
    }
}

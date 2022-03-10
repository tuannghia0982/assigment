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
            
            String sql ="select sid, sname, image, caid, coid, description, quantity \n" +
                        "from Serie a \n" +
                        "order by sid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Serie s = new Serie();
                s.setId(rs.getInt("sid"));
                s.setName(rs.getString("sname"));
                s.setImage(rs.getString("image"));
                s.setCaid(rs.getInt("caid"));
                s.setCoid(rs.getInt("coid"));
                s.setDescription(rs.getString("description"));
                s.setQuantity(rs.getInt("quantity"));
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
            
            String sql ="select sid, sname, image, caid, coid, description, quantity, author \n" +
                        "from Serie a \n" +
                        "where sid=?\n" +
                        "order by sid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, sid);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                s.setId(rs.getInt("sid"));
                s.setName(rs.getString("sname"));
                s.setImage(rs.getString("image"));
                s.setCaid(rs.getInt("caid"));
                s.setCoid(rs.getInt("coid"));
                s.setDescription(rs.getString("description"));
                s.setAuthor(rs.getString("author"));
                s.setQuantity(rs.getInt("quantity"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    public ArrayList<Serie> getSeriesByCaid(String caid)
    {
        ArrayList<Serie> series = new ArrayList<>();
        try {
            
            String sql ="select sid, sname, image, caid, coid, description, quantity\n" +
                        "from Serie a\n" +
                        "where caid=?\n" +
                        "order by sid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, caid);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Serie s = new Serie();
                s.setId(rs.getInt("sid"));
                s.setName(rs.getString("sname"));
                s.setImage(rs.getString("image"));
                s.setCaid(rs.getInt("caid"));
                s.setCoid(rs.getInt("coid"));
                s.setDescription(rs.getString("description"));
                s.setQuantity(rs.getInt("quantity"));
                series.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return series;
    }
    public static void main(String[] args){
        SerieDBContext a = new SerieDBContext();
        ArrayList<Serie> list = a.getSeriesByCaid("1");
        for(Serie b : list){
            System.out.println(b);
        }
    }
}

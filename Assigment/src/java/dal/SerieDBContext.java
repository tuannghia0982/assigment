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
import model.Category;
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
            
            String sql ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.quantity, s.author, co.coname, ca.caname\n" +
"                        from Serie s inner join Category ca\n" +
"                        on s.caid = ca.caid\n" +
"                        inner join Country co\n" +
"                        on s.coid = co.coid\n" +
"                        order by sid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
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
            
            String sql ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.quantity, s.author, co.coname, ca.caname\n" +
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
                s.setQuantity(rs.getInt("quantity"));
                s.setAuthor(rs.getString("author"));
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
            
            String sql ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.quantity, s.author, co.coname, ca.caname\n" +
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
                s.setQuantity(rs.getInt("quantity"));
                series.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SerieDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return series;
    }
    public ArrayList<Serie> getSeriesBySearch(String sname)
    {
        ArrayList<Serie> series = new ArrayList<>();
        try {
            
            String sql ="select s.sid, s.sname, s.image, s.caid, s.coid, s.description, s.quantity, s.author, co.coname, ca.caname\n" +
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
        ArrayList<Serie> list = a.getSeriesBySearch("gia đình");
        for(Serie b : list){
            System.out.println(b);
        }
    }
}

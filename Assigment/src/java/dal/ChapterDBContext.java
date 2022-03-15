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
import model.Chapter;
import model.Serie;

/**
 *
 * @author tuann
 */
public class ChapterDBContext extends DBContext{
    public ArrayList<Chapter> getChapters(String sid)
    {
        ArrayList<Chapter> chapters = new ArrayList<>();
        try {
            
            String sql ="select chapid, chapname, sid \n" +
"				from Chapter\n" +
"				where sid = ?\n" +
"				order by chapid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, sid);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Chapter c = new Chapter();
                c.setId(rs.getInt("chapid"));
                c.setName(rs.getString("chapname"));
                c.setSid(rs.getInt("sid"));
                chapters.add(c);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChapterDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chapters;
    }
    public Chapter getChapter(String sid)
    {
        try {
            
            String sql ="select top 1 chapid, chapname, sid \n" +
"				from Chapter\n" +
"				where sid = ?\n" +
"				order by chapid desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, sid);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                Chapter c = new Chapter();
                c.setId(rs.getInt("chapid"));
                c.setName(rs.getString("chapname"));
                c.setSid(rs.getInt("sid"));
                return c;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChapterDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args){
        ChapterDBContext a = new ChapterDBContext();
        Chapter b = a.getChapter("1");
            System.out.println(b);
    }
}

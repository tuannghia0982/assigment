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
import model.Image;

/**
 *
 * @author tuann
 */
public class ImageDBContext extends DBContext{
    public ArrayList<Image> getImages(String chapid)
    {
        ArrayList<Image> images = new ArrayList<>();
        try {
            
            String sql ="select iid, chapid, info from image \n" +
                        "where chapid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, chapid);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Image i = new Image();
                i.setId(rs.getInt("iid"));
                i.setInfo(rs.getString("info"));
                i.setChapid(rs.getInt("chapid"));
                images.add(i);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImageDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return images;
    }
    public void addImage(Image i)
    {
        String sql = "INSERT INTO [image]\n" +
                    "           ([chapid]\n" +
                    "           ,[info])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, i.getChapid());
            stm.setString(2, i.getInfo());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void deleteImage(Image i)
    {
        String sql = "DELETE Image\n" +
                    " WHERE [iid]=?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, i.getId());

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(stm != null)
            {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImageDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection !=null)
            {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImageDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void main(String[] args){
        ImageDBContext a = new ImageDBContext();
        ArrayList<Image> b = a.getImages("5");
        for(Image i: b){
            System.out.println(i);
        }
    }
    
}

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

/**
 *
 * @author tuann
 */
public class CategoryDBContext extends DBContext{
    public ArrayList<Category> getCategories()
    {
        ArrayList<Category> categories = new ArrayList<>();
        try {
            
            String sql ="select caid, caname \n" +
                        "from Category";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Category c = new Category();
                c.setId(rs.getInt("caid"));
                c.setName(rs.getString("caname"));
                categories.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    public Category getCategory(String caid)
    {
        Category c = new Category();
        try {
            
            String sql ="select caid, caname \n" +
                        "from Category\n"+
                        "where caid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, caid);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                c.setId(rs.getInt("caid"));
                c.setName(rs.getString("caname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public static void main(String[] args){
        CategoryDBContext a = new CategoryDBContext();
        ArrayList<Category> list = a.getCategories();
        for(Category b : list){
            System.out.println(b);
        }
    }
}

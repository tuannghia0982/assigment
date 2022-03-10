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
import model.Country;

/**
 *
 * @author tuann
 */
public class CountryDBContext extends DBContext{
    public ArrayList<Country> getCountries()
    {
        ArrayList<Country> countries = new ArrayList<>();
        try {
            
            String sql ="select coid, coname \n" +
                        "from Country\n"+
                        "order by coname";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Country c = new Country();
                c.setId(rs.getInt("coid"));
                c.setName(rs.getString("coname"));
                countries.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CountryDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return countries;
    }
    public static void main(String[] args){
        CountryDBContext a = new CountryDBContext();
        ArrayList<Country> list = a.getCountries();
        for(Country b : list){
            System.out.println(b);
        }
    }
}

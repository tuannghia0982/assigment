/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profilecontroller;

import dal.CategoryDBContext;
import dal.CountryDBContext;
import dal.SerieDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Category;
import model.Country;
import model.Serie;

/**
 *
 * @author tuann
 */
@MultipartConfig(
        fileSizeThreshold   = 1024 * 1024 * 1,  
        maxFileSize         = 1024 * 1024 * 10,
        maxRequestSize      = 1024 * 1024 * 50,
        location = "C:\\prj301\\Assigment\\web\\img"
)
public class insertserie extends HttpServlet {

    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDBContext dbCategory = new CategoryDBContext();
        ArrayList<Category> categories = dbCategory.getCategories();
        request.setAttribute("categories", categories);
        
        CountryDBContext dbCountry = new CountryDBContext();
        ArrayList<Country> countries = dbCountry.getCountries();
        request.setAttribute("countries", countries);
        request.getRequestDispatcher("/info/insertserie.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Collection<Part> parts = request.getParts();
        String seriename = request.getParameter("seriename");
        String author = request.getParameter("author");
        int coid = Integer.parseInt(request.getParameter("country"));
        int caid = Integer.parseInt(request.getParameter("category"));
        String describle = request.getParameter("describle");
        String warning = "Yêu cầu điền đầy đủ thông tin";
        if(seriename==null||author==null||seriename==null||author==null||describle==null){
            request.setAttribute("warning", warning);
            request.getRequestDispatcher("/info/insertserie.jsp").forward(request, response);
        }
        
        else{
//            for (Part part : parts) {
//                if(part.getSubmittedFileName()!=null){
//                  String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
//                  part.write(filename); 
//                  response.getWriter().println(filename);
////    abv              ProductImages pi = new ProductImages();
////                  pi.setImage("uploads/"+filename);
////                  listImages.add(pi);
//                }
//            }
//            for(int i=0; i<3; i++){
//                
//
                Part part = request.getPart("image");
                String fileName = part.getSubmittedFileName(); 
                part.write(fileName);
////                response.getWriter().println(fileName);
////            }    
//            
            SerieDBContext db = new SerieDBContext();
            Serie s = new Serie();
            s.setName(seriename);
            s.setAuthor(author);
            s.setDescription(describle);
            s.setImage(fileName);
            Category ca = new Category();
            Country co = new Country();
            ca.setId(caid);
            co.setId(coid);
            s.setCategory(ca);
            s.setCountry(co);
            db.addSerie(s);
            int id = db.getSid();
            response.sendRedirect("../serie?sid="+id);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

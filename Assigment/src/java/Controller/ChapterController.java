/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dal.CategoryDBContext;
import dal.ChapterDBContext;
import dal.CountryDBContext;
import dal.ImageDBContext;
import dal.SerieDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Chapter;
import model.Country;
import model.Image;
import model.Serie;

/**
 *
 * @author tuann
 */
public class ChapterController extends HttpServlet {

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
        String chapid = request.getParameter("chapid");
        CategoryDBContext dbCategory = new CategoryDBContext();
        ArrayList<Category> categories = dbCategory.getCategories();
        request.setAttribute("categories", categories);
        
        
        CountryDBContext dbCountry = new CountryDBContext();
        ArrayList<Country> countries = dbCountry.getCountries();
        request.setAttribute("countries", countries);
        
        ImageDBContext imgdb = new ImageDBContext();
        ArrayList<Image> images = imgdb.getImages(chapid);
        request.setAttribute("images", images);
//        for(Image i : images){
//            response.getWriter().println(i);
//        }
            
        ChapterDBContext chapdb = new ChapterDBContext();
        Chapter chapter = chapdb.getChapterbyid(chapid);
        int sidint = chapter.getSid();
        String sid = String.valueOf(sidint);
        ArrayList<Chapter> chapters = chapdb.getChapters(sid);
        request.setAttribute("chapters", chapters);
        request.setAttribute("chapter", chapter);
        
        SerieDBContext seriedb = new SerieDBContext();
        Serie serie = seriedb.getSerie(sid);
        request.setAttribute("serie", serie);
        
        request.getRequestDispatcher("pageinside.jsp").forward(request, response);
         
        
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
        processRequest(request, response);
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
        processRequest(request, response);
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

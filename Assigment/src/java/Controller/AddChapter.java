/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dal.ChapterDBContext;
import dal.ImageDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Chapter;
import model.Image;

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
public class AddChapter extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddChapter</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddChapter at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String chapname = (String)request.getAttribute("chapname");
        
        String sid = request.getParameter("sid");
        request.setAttribute("sid", sid);
//        response.getWriter().println(chapname);
        request.getRequestDispatcher("addchapter.jsp").forward(request, response);
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
        String chapname = request.getParameter("chapname");
        String raw_sid = request.getParameter("sid");
        int sid = Integer.parseInt(request.getParameter("sid"));
        
        //tạo và thêm chapter 
        Chapter chapter = new Chapter();
        chapter.setName(chapname);
        chapter.setSid(sid);
        
        ChapterDBContext chapdb = new ChapterDBContext();
        chapdb.addChapter(chapter);
        
        //lấy dữ liệu từ chap mới thêm
        Chapter newchap = chapdb.getChapter(raw_sid);
        int chapid = newchap.getId();
        
        ImageDBContext imagedb = new ImageDBContext();
        
        
//        response.getWriter().println(sid);
        Collection<Part> parts = request.getParts();
        for (Part part : parts) {
                if(part.getSubmittedFileName()!=null){
                    String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
                    part.write(filename); 
                    Image image = new Image();
                    image.setChapid(chapid);
                    image.setInfo(filename);
                    imagedb.addImage(image);
                    
                  
//    abv              ProductImages pi = new ProductImages();
//                  pi.setImage("uploads/"+filename);
//                  listImages.add(pi);
                }
            }
        response.sendRedirect("serie?sid="+sid);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dal.AccountDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author tuann
 */
public class SignupController extends HttpServlet {

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
        request.getRequestDispatcher("signup.jsp").forward(request, response);
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String displayname = request.getParameter("displayname");
        String confirm_password = request.getParameter("confirm_password");
        String confirm ="Đăng ký thành công, bây giờ hãy đăng nhập lại";
        String wpass = "password nhập lại không đúng";
        String wacount = "Tên đăng nhập không được để trống hoặc trùng với tên đã sử dụng";
        if(!password.equals(confirm_password)){
            request.setAttribute("mess", wpass);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
        
        else{
            AccountDBContext db = new AccountDBContext();
            Account account = db.checkAccount(username);
            if(account == null){
                Account a = new Account();
                a.setName(username);
                a.setPassword(password);
                a.setDisplayname(displayname);
                db.addAccount(a);
                request.setAttribute("confirm", confirm);
                request.getRequestDispatcher("login.jsp").forward(request, response);
                
            }
            else{
                request.setAttribute("mess", wacount);
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }
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

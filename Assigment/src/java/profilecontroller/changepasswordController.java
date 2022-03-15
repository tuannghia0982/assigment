/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profilecontroller;

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
public class changepasswordController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("/info/changepassword.jsp").forward(request, response);
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
        
        String oldpass = request.getParameter("oldpass");
        String pass = request.getParameter("newpass");
        String repass = request.getParameter("renewpass");
        String woldpass = "Mật khẩu không chính xác";
        String wnewpass = "Mật khẩu không khớp";
        String confirm = "Mật khẩu chính xác";
        Account a = (Account)request.getSession().getAttribute("account");
        request.setAttribute(confirm, "confirm");
        if (!oldpass.equals(a.getPassword())){
            request.setAttribute(woldpass, "warning");
        }
        else if(!pass.equals(repass)){
            request.setAttribute(wnewpass, "warning");
        }
        else{
            request.setAttribute(confirm, "confirm");
            a.setPassword(pass);
            AccountDBContext db = new AccountDBContext();
            db.updateAccount(a);
        }
//        response.getWriter().println(oldpass);
//        response.getWriter().println(pass);
//        response.getWriter().println(repass);
        request.getRequestDispatcher("changepassword.jsp").forward(request, response);
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


package com;

import Service.Service;
import bean.account_details;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateAccountServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    HttpSession session=request.getSession();
   String username=(String) session.getAttribute("username");
   account_details details=new account_details();
   details.setName(request.getParameter("name"));
        System.out.println("name is :"+request.getParameter("name"));
        details.setDOB(request.getParameter("dob"));
        details.setEmailID(request.getParameter("email"));
        details.setAddress(request.getParameter("address"));
        details.setTypeOfAccount(request.getParameter("value"));
        System.out.println("type of account is :"+request.getParameter("value"));
        details.setUserName(username);
        System.out.println(username);
        Service service=new Service();
       int j= service.insertaccount_details(details);
        if(j>0){
            System.out.println("inside the if in servlet");
            String message="Account created successfully!!!";
            response.sendRedirect("MainMenu.jsp?message2="+message);
            
        }else{
            System.out.println("inside the else in servlet");
            String message="User Account is not created!!!";
            response.sendRedirect("MainMenu.jsp?message3="+message);
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

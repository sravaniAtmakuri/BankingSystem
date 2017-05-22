
package com;

import Service.Service;
import connectDB.connectDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        session.setAttribute("username", username);
        Service service=new Service();
        boolean value=service.login(username, password);
        if(value==true){
            session.setAttribute("username", username);
             System.out.println("inside if");
              response.sendRedirect("MainMenu.jsp");
               }else{
              System.out.println("inside else in LoginServlet");
              String message="Invalid UserName or Password!!!";
               response.sendRedirect("LoginPage.jsp?message1="+message);
          }   
        
   
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

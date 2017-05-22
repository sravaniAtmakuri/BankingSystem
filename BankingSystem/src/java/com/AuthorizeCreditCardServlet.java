
package com;

import Service.Service;
import bean.AuthorizeCreditCardBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizeCreditCardServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int cardcvv=Integer.parseInt(request.getParameter("cvv"));
        double amount=Double.parseDouble(request.getParameter("amount"));
        
       AuthorizeCreditCardBean card=new AuthorizeCreditCardBean();
       card.setName(request.getParameter("name"));
       card.setCardNumber(request.getParameter("cardnumber"));
       card.setCvv(cardcvv);
       card.setAmount(amount);
       
       Service service =new Service();
       int i=service.authorizecreditcard(card);
       
       if(i>0){
           String message="Credit Card Transaction Approved!!!";
           response.sendRedirect("AuthorizeCreditCard.jsp?message8="+message);
       }else{
           String message="Credit Card Transaction Rejected!!!";
           response.sendRedirect("AuthorizeCreditCard.jsp?message9="+message);
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

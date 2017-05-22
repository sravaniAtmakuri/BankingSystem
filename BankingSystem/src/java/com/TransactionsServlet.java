
package com;

import Service.Service;
import bean.account_transactions;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TransactionsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int j=0;
        int l=0;
        String accountNumber;
        HttpSession session=request.getSession();
        account_transactions actdebit=new account_transactions();
         account_transactions actcredit=new account_transactions();
         Service service=new Service();
         
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String currentdate=(dtf.format(localDate)).toString();
        System.out.println("current date is: "+currentdate);
        String username=(String)session.getAttribute("username");
        double amount=Double.parseDouble(request.getParameter("amount"));
                
        
        
        
        String submitvalue=request.getParameter("submit");
        System.out.println("button value is: "+submitvalue);
        if(submitvalue.equalsIgnoreCase("Debit From")){
            actdebit.setWithdrawaccountNo(request.getParameter("accountno"));
            actdebit.setDate(currentdate);
            actdebit.setWithdraw(amount);
            actdebit.setDescription("Withdraw");
            
            actcredit.setDescription("Deposit");
            actcredit.setDate(currentdate);
            actcredit.setDeposit(amount);
            accountNumber= service.getAccountNumberfromUserName(username);
            actcredit.setDepositaccountNo(accountNumber);
            System.out.println("credit account number is: "+actcredit.getDepositaccountNo());
             j=service.depositFromandCreditTo(actdebit, actcredit);
             
             if(j>0){
                 System.out.println("inserted into the account transactions table");
                  String message="Deposit Transaction is successfull!!!";
               response.sendRedirect("TransactionsPage.jsp?message4="+message);
             }else{
                 System.out.println("not inserted into account transactions table");
                  String message="Deposit Transaction is not successfull!!!";
               response.sendRedirect("TransactionsPage.jsp?message5="+message);
             }
        }if(submitvalue.equalsIgnoreCase("Credit To")){
            actcredit.setDepositaccountNo(request.getParameter("accountno"));
            actcredit.setDescription("Deposit");
            actcredit.setDate(currentdate);
            actcredit.setDeposit(amount);
            
            accountNumber= service.getAccountNumberfromUserName(username);
            actdebit.setWithdrawaccountNo(accountNumber);
            actdebit.setDate(currentdate);
            actdebit.setWithdraw(amount);
            actdebit.setDescription("Withdraw");
            l=service.depositFromandCreditTo(actdebit, actcredit);
            
             if(l>0){
                 System.out.println("inserted into the account transactions table credit to method");
                  String message="Credit Transaction is successfull!!!";
               response.sendRedirect("TransactionsPage.jsp?message6="+message);
             }else{
                 System.out.println("not inserted into account transactions table credit to method");
                  String message="Credit Transaction is not successfull!!!";
               response.sendRedirect("TransactionsPage.jsp?message7="+message);
             }
            
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

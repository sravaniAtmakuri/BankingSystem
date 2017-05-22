<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.account_transactions"%>
<%@page import="Service.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  session=request.getSession();
String username=(String) session.getAttribute("username");
System.out.println("userame is :"+username);
Service service=new Service();
List<account_transactions> list;
String fromdate=request.getParameter("fromdate");
String todate=request.getParameter("todate");
System.out.println("fromdate and to date are: "+fromdate +"and "+todate);
list=service.displayStatement(username,fromdate,todate);



%>
<!DOCTYPE html>
<html>
    <head>
         <style>
            
            
            h1 {
                align-content: center;
                text-align:center;
    background-color: palegreen;
}
body {
                align-content: center;
                
    background-color: palegreen;
}table, th, td {
    border: 1px solid black;
}tr{
    text-align: center;
}

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Statement final</title>
    </head>
    <body>
        <form action="DisplayStetementfinal.jsp" method="post" id="loginPage" onsubmit="">
        <h1>Display Statement</h1>
        Date Range:<br><br>
        From<input type="text" name="fromdate" id="fromdate">&nbsp;&nbsp;&nbsp;
        To <input type="text" name="todate" id="todate">&nbsp;&nbsp;&nbsp;
        <input type="submit" name="submit" id="submit" value="Display"><br><br><br><br>
        <table style="width:60%">
  <tr>
    <th>SI No</th>
    <th>Date</th> 
    <th>Description</th>
    <th>Cheque No</th>
    <th>Withdraw</th>
    <th>Deposit</th>
    <th>Available Balance</th>
  </tr>
  
      <% for (int i=0;i<list.size();i++){ %>
      <tr>         
      <td>
          <%= list.get(i).getSINo()%>
         
      </td>
      <td>
          <%= list.get(i).getDate() %>
         
      </td>
      <td>
          <%= list.get(i).getDescription() %>
         
      </td>
      <td>
          <%= list.get(i).getChequeNo() %>
         
      </td>
      <td>
          <%= list.get(i).getWithdraw() %>
         
      </td>
      <td>
          <%= list.get(i).getDeposit() %>
         
      </td>
      <td>
          <%= list.get(i).getAvailablebalance() %>
         
      </td>
      
   
      
  </tr>
     <% } %>
  
        </table>
     <br>
     <br><br>
     <a href="MainMenu.jsp">Main Menu</a>
        
        </form>
    </body>
</html>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
}

        </style>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta charset="UTF-8">
        <title>Transactions Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
         <h3 style="color: red">
                                    <%
                                        String message1=request.getParameter("message5");
                                        if(message1!=null)
                                        {%>
                                   <% out.println(request.getParameter("message5")); %>
                                     <% }
                                    %>
                                </h3>
                                <h3 style="color: green">
                                    <%
                                        String message2=request.getParameter("message4");
                                        if(message2!=null)
                                        {%>
                                        <%=message2%>
                                     <% }
                                    %>
                                </h3>
                                 <h3 style="color: red">
                                    <%
                                        String message3=request.getParameter("message7");
                                        if(message3!=null)
                                        {%>
                                   <% out.println(request.getParameter("message7")); %>
                                     <% }
                                    %>
                                </h3>
                                <h3 style="color: green">
                                    <%
                                        String message4=request.getParameter("message6");
                                        if(message4!=null)
                                        {%>
                                        <%=message4%>
                                     <% }
                                    %>
                                </h3>
        <h1>Perform Debit or Credit operation</h1>
     <form action="TransactionsServlet" method="post" id="loginPage" onsubmit="">
        
  Account Number:
  <input type="text" name="accountno" id="accountno">
  <br><br>
  Amount:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" name="amount" id="amount"><br><br>
  <input type="submit" name="submit" id="submit" value="Debit From">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <input type="submit" name="submit" id="submit" value="Credit To">
   <br><br><br>
   <a href="MainMenu.jsp">Main Menu</a>
     </form>
    </body>
</html>


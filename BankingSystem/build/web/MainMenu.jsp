
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
body{
    background-color: palegreen;
}

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Menu</title>
    </head>
    <body>
         <h3 style="color: red">
                                    <%
                                        String message1=request.getParameter("message3");
                                        if(message1!=null)
                                        {%>
                                   <% out.println(request.getParameter("message3")); %>
                                     <% }
                                    %>
                                </h3>
                                <h3 style="color: green">
                                    <%
                                        String message2=request.getParameter("message2");
                                        if(message2!=null)
                                        {%>
                                        <%=message2%>
                                     <% }
                                    %>
                                </h3>
        <h1 text-align="center">Banking System</h1>
        <a href="CreateAccount.jsp">Create Account</a><br><br>
        <a href="TransactionsPage.jsp">Transactions</a><br><br>
        <a href="DisplayStatement.jsp">Display Bank Statement</a><br><br>
        <a href="AuthorizeCreditCard.jsp">Authorize credit card amount</a><br><br>
    </body>
</html>

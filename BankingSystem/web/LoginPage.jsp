

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            
            
            body {
                align-content: center;
                text-align:center;
    background-color: palegreen;
}

        </style>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta charset="UTF-8">
        <title>Login Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Banking System</h1>
     <form action="LoginServlet" method="post" id="loginPage" onsubmit="">
         <p style="color: red">
                                    <%
                                        String message1=request.getParameter("message1");
                                        if(message1!=null)
                                        {%>
                                   <% out.println(request.getParameter("message1")); %>
                                     <% }
                                    %>
                                </p>
                                <p style="color: green">
                                    <%
                                        String message2=request.getParameter("message2");
                                        if(message2!=null)
                                        {%>
                                        <%=message2%>
                                     <% }
                                    %>
                                </p>
  UserName:
  <input type="text" name="username" id="username">
  <br>
  Password:&nbsp;
  <input type="password" name="password" id="password"><br>
  <input type="submit" name="submit" id="submit" value="Submit">
     </form>
    </body>
</html>



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
              text-align:left;
    background-color: palegreen;
}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authorize Credit Card</title>
    </head>
    <body>
        <h1> Authorize Credit Card Transaction</h1>
        <form action="AuthorizeCreditCardServlet" method="post" id="" onsubmit="">
           <h3 style="color: red">
               <% String message1=request.getParameter("message9");
                  if(message1!=null){
                     %>
                      <%= message1 %>
                      <%
                  }
               %>
           </h3>
           <h3 style="color:green">
               <% String message2=request.getParameter("message8");
               if(message2!=null){
                   %>
                   <%=message2%>
                   <%
               }
               %>
           </h3>
              
         
            Name: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="name" id="name">  <br><br>
            Card Number:&nbsp; <input type="text" name="cardnumber" id="cardnumber"><br><br>
            CVV2/CVC2&nbsp;&nbsp; <textarea rows="4" cols="50" name="cvv" id="cvv"></textarea><br><br>
            Amount: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="amount" id="amount"><br><br>
          <br><br>
  
 
 &nbsp;&nbsp;&nbsp; <input type="submit" name="submit" id="submit" value="Authorize">
  <br><br><br><br>
 &nbsp;&nbsp;&nbsp; <a href="MainMenu.jsp">Main Menu</a>
  
  
     </form>
    </body>
</html>

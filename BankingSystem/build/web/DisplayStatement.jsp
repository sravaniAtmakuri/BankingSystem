<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.account_transactions"%>
<%@page import="Service.Service"%>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Statement</title>
    </head>
    
    

    <body>
        <form action="DisplayStetementfinal.jsp" method="post" id="loginPage" onsubmit="">
        <h1>Display Statement</h1>
        Date Range:<br><br>
        From<input type="text" name="fromdate" id="fromdate">&nbsp;&nbsp;&nbsp;
        To <input type="text" name="todate" id="todate">&nbsp;&nbsp;&nbsp;
        <input type="submit" name="submit" id="submit" value="Display">
  
  
        
        
        </form>
    </body>
</html>

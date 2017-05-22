
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
        <title>Create Account</title>
    </head>
    <body>
        <h1> Account creation Screen</h1>
        <form action="CreateAccountServlet" method="post" id="loginPage" onsubmit="">
         
            Name: &nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="name" id="name">  <br><br>
            DOB:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="dob" id="dob"><br><br>
            Address:&nbsp; <textarea rows="4" cols="50" name="address" id="address"></textarea><br><br>
            Email ID:  <input type="email" name="email" id="email"><br><br>
            Type Of account:&nbsp;<select id="value" name="value">
  <option value="Checking">Checking</option>
  <option value="Savings">Savings</option>
 
            </select><br><br>
  
</ol>  
  <input type="submit" name="submit" id="submit" value="Create Account">
     </form>
    </body>
</html>

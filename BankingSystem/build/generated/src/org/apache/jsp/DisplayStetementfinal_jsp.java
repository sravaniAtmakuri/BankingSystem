package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import bean.account_transactions;
import Service.Service;

public final class DisplayStetementfinal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
  session=request.getSession();
String username=(String) session.getAttribute("username");
System.out.println("userame is :"+username);
Service service=new Service();
List<account_transactions> list;
String fromdate=request.getParameter("fromdate");
String todate=request.getParameter("todate");
System.out.println("fromdate and to date are: "+fromdate +"and "+todate);
list=service.displayStatement(username,fromdate,todate);




      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            h1 {\n");
      out.write("                align-content: center;\n");
      out.write("                text-align:center;\n");
      out.write("    background-color: palegreen;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("                align-content: center;\n");
      out.write("                \n");
      out.write("    background-color: palegreen;\n");
      out.write("}table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("}tr{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Display Statement final</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"DisplayStetementfinal.jsp\" method=\"post\" id=\"loginPage\" onsubmit=\"\">\n");
      out.write("        <h1>Display Statement</h1>\n");
      out.write("        Date Range:<br><br>\n");
      out.write("        From<input type=\"text\" name=\"fromdate\" id=\"fromdate\">&nbsp;&nbsp;&nbsp;\n");
      out.write("        To <input type=\"text\" name=\"todate\" id=\"todate\">&nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Display\"><br><br><br><br>\n");
      out.write("        <table style=\"width:60%\">\n");
      out.write("  <tr>\n");
      out.write("    <th>SI No</th>\n");
      out.write("    <th>Date</th> \n");
      out.write("    <th>Description</th>\n");
      out.write("    <th>Cheque No</th>\n");
      out.write("    <th>Withdraw</th>\n");
      out.write("    <th>Deposit</th>\n");
      out.write("    <th>Available Balance</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("      ");
 for (int i=0;i<list.size();i++){ 
      out.write("\n");
      out.write("      <tr>         \n");
      out.write("      <td>\n");
      out.write("          ");
      out.print( list.get(i).getSINo());
      out.write("\n");
      out.write("         \n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          ");
      out.print( list.get(i).getDate() );
      out.write("\n");
      out.write("         \n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          ");
      out.print( list.get(i).getDescription() );
      out.write("\n");
      out.write("         \n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          ");
      out.print( list.get(i).getChequeNo() );
      out.write("\n");
      out.write("         \n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          ");
      out.print( list.get(i).getWithdraw() );
      out.write("\n");
      out.write("         \n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          ");
      out.print( list.get(i).getDeposit() );
      out.write("\n");
      out.write("         \n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          ");
      out.print( list.get(i).getAvailablebalance() );
      out.write("\n");
      out.write("         \n");
      out.write("      </td>\n");
      out.write("      \n");
      out.write("   \n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write("     ");
 } 
      out.write("\n");
      out.write("  \n");
      out.write("        </table>\n");
      out.write("     <br>\n");
      out.write("     <br><br>\n");
      out.write("     <a href=\"MainMenu.jsp\">Main Menu</a>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

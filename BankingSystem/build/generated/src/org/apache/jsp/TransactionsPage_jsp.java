package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TransactionsPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
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
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Transactions Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h3 style=\"color: red\">\n");
      out.write("                                    ");

                                        String message1=request.getParameter("message5");
                                        if(message1!=null)
                                        {
      out.write("\n");
      out.write("                                   ");
 out.println(request.getParameter("message5")); 
      out.write("\n");
      out.write("                                     ");
 }
                                    
      out.write("\n");
      out.write("                                </h3>\n");
      out.write("                                <h3 style=\"color: green\">\n");
      out.write("                                    ");

                                        String message2=request.getParameter("message4");
                                        if(message2!=null)
                                        {
      out.write("\n");
      out.write("                                        ");
      out.print(message2);
      out.write("\n");
      out.write("                                     ");
 }
                                    
      out.write("\n");
      out.write("                                </h3>\n");
      out.write("                                 <h3 style=\"color: red\">\n");
      out.write("                                    ");

                                        String message3=request.getParameter("message7");
                                        if(message3!=null)
                                        {
      out.write("\n");
      out.write("                                   ");
 out.println(request.getParameter("message7")); 
      out.write("\n");
      out.write("                                     ");
 }
                                    
      out.write("\n");
      out.write("                                </h3>\n");
      out.write("                                <h3 style=\"color: green\">\n");
      out.write("                                    ");

                                        String message4=request.getParameter("message6");
                                        if(message4!=null)
                                        {
      out.write("\n");
      out.write("                                        ");
      out.print(message4);
      out.write("\n");
      out.write("                                     ");
 }
                                    
      out.write("\n");
      out.write("                                </h3>\n");
      out.write("        <h1>Perform Debit or Credit operation</h1>\n");
      out.write("     <form action=\"TransactionsServlet\" method=\"post\" id=\"loginPage\" onsubmit=\"\">\n");
      out.write("        \n");
      out.write("  Account Number:\n");
      out.write("  <input type=\"text\" name=\"accountno\" id=\"accountno\">\n");
      out.write("  <br><br>\n");
      out.write("  Amount:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  <input type=\"text\" name=\"amount\" id=\"amount\"><br><br>\n");
      out.write("  <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Debit From\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("   <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Credit To\">\n");
      out.write("   <br><br><br>\n");
      out.write("   <a href=\"MainMenu.jsp\">Main Menu</a>\n");
      out.write("     </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

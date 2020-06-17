package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>University Management System</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("              background-image: url(imgs/homepg.jpg);\n");
      out.write("              background-repeat: no-repeat;\n");
      out.write("              background-attachment: fixed;\n");
      out.write("              background-size: cover;\n");
      out.write("            }\n");
      out.write("            .container { \n");
      out.write("              height: 200px;\n");
      out.write("              position: relative;\n");
      out.write("              border: 3px solid green; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .vertical-center {\n");
      out.write("              margin: 0;\n");
      out.write("              position: absolute;\n");
      out.write("              top: 30%;\n");
      out.write("              left: 30%;\n");
      out.write("              -ms-transform: translateY(-50%);\n");
      out.write("              transform: translateY(-50%);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    ");


      
        if(!(session.isNew()))
        {
            if(session.getAttribute("uname") != null)
            {
                    String s = (String)session.getAttribute("uname");
            
     
      out.write("\n");
      out.write("    <body>\n");
      out.write("         <h1><center><font color=\"black\">University Management System</font></center></h1>\n");
      out.write("          <h1><center><font color=\"black\">WELCOME ");
      out.print(s);
      out.write("</font></center></h1>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <li><a href=\"#\">first</li>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("     ");

            } }else{
               
               request.getRequestDispatcher("index.html").forward(request, response);
                
                ////rd.forward(request,response);
            }
    
      out.write("\n");
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

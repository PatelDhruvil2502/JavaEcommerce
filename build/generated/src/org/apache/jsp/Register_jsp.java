package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>ShopSmart-Register</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <!--<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\"/>-->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/newcss.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("-->\n");
      out.write("        \n");
      out.write("<!--        <div class=\"register-body\">\n");
      out.write("            <div class='container p-5'>\n");
      out.write("                <form class='form-signup' method=\"post\" action=\"RegisterServlet\">\n");
      out.write("                    <div class=\"shadow p-3 mb-5 bg-body rounded\">\n");
      out.write("                        <h2 class='text-center'>Sign-Up</h2>\n");
      out.write("                        <p class='text-center'>Register to ShopSmart</p>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <div class='form-group mt-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <label for=\"uname\" >User Name</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='form-group m-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <input type=\"text\" id=\"uname\" class='form-control' name=\"name\" placeholder='NAME' />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class='form-group mt-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <label for=\"uemail\" >User Email</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='form-group m-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <input type=\"email\" id=\"uemail\" class='form-control' name=\"email\" placeholder='E-MAIL' />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class='form-group mt-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <label for=\"upassword\" >User Password</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='form-group m-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <input type=\"password\" id=\"upassword\" class='form-control' name=\"password\" placeholder='PASSWORD' />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class='form-group mt-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <label for=\"ucontactno\" >User Contact No</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='form-group m-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <input type=\"number\" id=\"ucontactno\" class='form-control' name=\"phone\" placeholder='CONTACT NO' />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class='form-group mt-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <label for=\"uaddress\" >User Address</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='form-group m-2'>\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <input type=\"text\"  id=\"uaddress\" class='form-control' name=\"address\" placeholder='ADDRESS' />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group m-2\">\n");
      out.write("\n");
      out.write("                            <div class='row'>\n");
      out.write("                                <input  style=\"background-color: #fc8019;\"class=\"btn btn-success btn-block\"type=\"submit\" value=\"Register\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
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

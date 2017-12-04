package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enquiry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/masterpages/link.jsp");
    _jspx_dependants.add("/masterpages/header.jsp");
    _jspx_dependants.add("/masterpages/slider.jsp");
    _jspx_dependants.add("/masterpages/menu.jsp");
    _jspx_dependants.add("/masterpages/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write(" <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script src=\"js/jquery-2.1.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid outer\">\n");
      out.write("            ");
      out.write("<!--header div open-->\n");
      out.write("            <div class=\"row header\">\n");
      out.write("                <div class=\"col-sm-3 logo\">\n");
      out.write("                    <img src=\"images/elogo.png\" height=\"100px\" />\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"col-sm-9 title text-center\">\n");
      out.write("                    <span id=\"spt\"><span style=\"color: tomato;\">E</span>-StudyZone</span>   \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("            <!--header div close-->");
      out.write("\n");
      out.write("            ");
      out.write("<!--slider div open-->\n");
      out.write("            <div class=\"row slider\">\n");
      out.write("              <div class=\"col-sm-12\" style=\"margin: 0px;padding: 0px;\">\n");
      out.write("                <!--Open for Slider div-->\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <!-- Indicators -->\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <!-- Wrapper for slides -->\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                        <div class=\"item active\">\n");
      out.write("                            <img src=\"sliderimages/1.jpg\" alt=\"Chania\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img  src=\"sliderimages/2.jpg\" alt=\"Chania\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"sliderimages/3.jpg\" alt=\"Flower\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"sliderimages/4.jpg\" alt=\"Flower\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"sliderimages/5.jpg\" alt=\"Flower\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"sliderimages/6.jpg\" alt=\"Flower\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"sliderimages/7.jpg\" alt=\"Flower\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Left and right controls -->\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <!--Close for Slider div-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--slider div close-->");
      out.write("\n");
      out.write("            ");
      out.write("<!--menu div open-->\n");
      out.write("            <div class=\"row\"  >\n");
      out.write("                <nav class=\"navbar navbar-default\" >\n");
      out.write("                    <div class=\"container-fluid\" style=\"background-color: black;\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                              <a href=\"#\" class=\"navbar-brand\" style=\"color: white;font-weight:bold; \">Menu</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav \">\n");
      out.write("                                <li class=\"active\" ><a href=\"index.jsp\" style=\"color: white;font-weight:bold; \">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                                <li><a href=\"aboutus.jsp\" style=\"color: white;font-weight:bold; \">About us</a></li>\n");
      out.write("<!--                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">Action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                        <li><a href=\"#\">View Record</a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>-->\n");
      out.write("<li><a href=\"enquiry.jsp\" style=\"color: white;font-weight:bold; \">Enquiry</a></li>\n");
      out.write("<li><a href=\"registration.jsp\" style=\"color: white;font-weight:bold; \">Registration</a></li>\n");
      out.write("<li><a href=\"login.jsp\" style=\"color: white;font-weight:bold; \">Login</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div><!-- /.navbar-collapse -->\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <!--menu div close-->");
      out.write("\n");
      out.write("            <!--main div open-->\n");
      out.write("            <div class=\"row main text-center\" style=\"margin: -20px;\">\n");
      out.write("                <div class=\"col-sm-12 h1 text-center\">Enquiry Here....</div>\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("                <div class=\"col-sm-5\">Enter User Name :</div>\n");
      out.write("                <div class=\"col-sm-5\"><input required=\"\" type=\"text\" name=\"username\" class=\"form-control\"    /></div>\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!--main div close-->\n");
      out.write("\n");
      out.write("            ");
      out.write(" <!--footer div open-->\n");
      out.write("            <div class=\"row footer text-center\" style=\"padding-top: 3%;\">\n");
      out.write("                <span style=\"color: white;font-size: 18pt;\">Developed by : Rahul Sharma ,#Mobile No. 7275823164, Email-Id :prog@gmail.com</span>\n");
      out.write("            </div>\n");
      out.write("            <!--footer div close-->");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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

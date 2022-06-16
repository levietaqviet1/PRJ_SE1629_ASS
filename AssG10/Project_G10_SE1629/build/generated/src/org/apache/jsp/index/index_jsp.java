package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"backGroup\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"fo\">\n");
      out.write("            <button onclick=\"document.getElementById('id01').style.display = 'block'\"\n");
      out.write("                    style=\"display: block;width: auto;\">Login</button>\n");
      out.write("            <button onclick=\"document.getElementById('id02').style.display = 'block'\"\n");
      out.write("                    style=\"display: block;width: auto;\">Register</button>\n");
      out.write("            <div id=\"id01\" class=\"modal\">\n");
      out.write("                <form class=\"modal-content animate\" action=\"/action_page.php\" method=\"post\">\n");
      out.write("                    <div class=\"imgcontainer\">\n");
      out.write("                        <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"close\"\n");
      out.write("                              title=\"Close Modal\">&times;</span>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <label for=\"uname\"><b>Username</b></label>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n");
      out.write("\n");
      out.write("                        <label for=\"psw\"><b>Password</b></label>\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("                        <select name=\"\" id=\"\" style=\"padding: 10px ; font-size: 15px;\">\n");
      out.write("                            <option selected=\"selected\" hidden value=\"\">Select Role</option>\n");
      out.write("                            <option value=\"3\">Sinh viên</option>\n");
      out.write("                            <option value=\"4\">Giảng viên</option>\n");
      out.write("                            <option value=\"5\">Cán bộ ĐH-FPT</option>\n");
      out.write("                            <option value=\"6\">Phụ huynh</option>\n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"\" id=\"\" style=\"padding: 10px ; font-size: 15px;\">\n");
      out.write("                            <option selected=\"selected\" hidden value=\"\">Select Campus</option>\n");
      out.write("                            <option value=\"3\">FU-H&#242;a Lạc</option>\n");
      out.write("                            <option value=\"4\">FU-Hồ Ch&#237; Minh</option>\n");
      out.write("                            <option value=\"5\">FU-Đ&#224; Nẵng</option>\n");
      out.write("                            <option value=\"6\">FU-Cần Thơ</option>\n");
      out.write("                            <option value=\"7\">FU-Quy Nhơn</option>\n");
      out.write("                        </select>\n");
      out.write("                        <button type=\"submit\">Login</button>\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("                        <button type=\"button\" onclick=\"document.getElementById('id01').style.display = 'none'\"\n");
      out.write("                                class=\"cancelbtn\">Cancel</button>\n");
      out.write("                        <!-- <span class=\"psw\">Forgot <a href=\"#\">password?</a></span> -->\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"id02\" class=\"modal\">\n");
      out.write("\n");
      out.write("                <span onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"close\"\n");
      out.write("                      title=\"Close Modal\">&times;</span>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1>Register</h1>\n");
      out.write("                    <h2>Information Student</h2>\n");
      out.write("                    <hr>\n");
      out.write("                    <form action=\"/action_page.php\"></form>\n");
      out.write("                    <label for=\"user\"><b>UserName</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter User\" name=\"user\" id=\"user\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" id=\"psw\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw-repeat\"><b>Repeat Password</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" id=\"psw-repeat\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"firstName\"><b>First Name</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter First Name\" name=\"firtName\" id=\"firstName\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"lasttName\"><b>Last Name</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Last Name\" name=\"lasttName\" id=\"lasttName\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"dateOf\"><b>Date Of Birth</b></label>\n");
      out.write("                    <input type=\"date\" style=\"font-size: 17px;\" placeholder=\"Enter Last Name\" name=\"dateOf\" id=\"dateOf\"\n");
      out.write("                           required>\n");
      out.write("\n");
      out.write("                    <label for=\"gender\"><b>Gender</b></label>\n");
      out.write("                    <div class=\"gen\">\n");
      out.write("                        <input type=\"radio\" placeholder=\"Enter Email\" name=\"gender_\" id=\"Male\" checked required> <label\n");
      out.write("                            for=\"Male\">Male</label>\n");
      out.write("                        <input type=\"radio\" placeholder=\"Enter Email\" name=\"gender_\" id=\"Female\" required><label\n");
      out.write("                            for=\"Female\">Female</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <label for=\"address\"><b>Address</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter address\" name=\"address\" id=\"address\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"telephone\"><b>Telephone</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter telephone\" name=\"telephone\" id=\"telephone\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"email\"><b>Email</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" id=\"email\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"Specialized\"><b>Specialized</b></label>\n");
      out.write("                    <div class=\"gen\">\n");
      out.write("                        <select style=\"font-size:25px ; width: 100%;\" class=\"form-control\" name=\"specialized\">\n");
      out.write("                            <option value=\"1\">Kỹ Thuật Phần Mềm</option>\n");
      out.write("                            <option value=\"2\">An Toàn Thông Tin</option>\n");
      out.write("                            <option value=\"3\">Quản Trị Kinh Doanh</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <label for=\"selectCampus\"><b>Select Campus</b></label>\n");
      out.write("                    <div class=\"gen\">\n");
      out.write("                        <select style=\"font-size:25px ; width: 100%;\" class=\"form-control\" name=\"specialized\">\n");
      out.write("                            <option selected value=\"3\">FU-H&#242;a Lạc</option>\n");
      out.write("                            <option value=\"4\">FU-Hồ Ch&#237; Minh</option>\n");
      out.write("                            <option value=\"5\">FU-Đ&#224; Nẵng</option>\n");
      out.write("                            <option value=\"6\">FU-Cần Thơ</option>\n");
      out.write("                            <option value=\"7\">FU-Quy Nhơn</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"registerbtn\">Register</button>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"container signin\">\n");
      out.write("                        <p>Already have an account? <button style=\"display: inline ; width: 100px ;\"\n");
      out.write("                                                            onclick=\"document.getElementById('id02').style.display = 'none';document.getElementById('id01').style.display = 'block'\">Sign\n");
      out.write("                                in</button></p> <br />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
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

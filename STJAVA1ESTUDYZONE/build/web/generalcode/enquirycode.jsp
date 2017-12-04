<%@page import="mypack.DBManager"%>
<%
    String username = request.getParameter("username").trim();
    String email = request.getParameter("email").trim();
    String mobile = request.getParameter("mobile").trim();
    String address = request.getParameter("address").trim();
    String enquiry = request.getParameter("enquiry").trim();
    DBManager db = new DBManager();
    int id = db.getAutoIncreemen("eqid", "enquiry");
    String q = "insert into enquiry values('" + id + "','" + username + "','" + email + "','" + mobile + "','" + address + "','" + enquiry + "','" + db.getCurrentDate() + "')";
    if (db.executeNoneQuery(q) == true) {
        out.print("<script>alert('Enquiry is Successfully');window.location.href='../enquiry.jsp';</script>");
    } else {
        out.print("<script>alert('Enquiry is not Successfully');window.location.href='../enquiry.jsp';</script>");

    }

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include  file="masterpages/link.jsp" %>
    </head>
    <body>
        <div class="container-fluid outer">
            <%@include file="masterpages/header.jsp"  %>
            <%@include file="masterpages/slider.jsp"  %>
            <%@include file="masterpages/menu.jsp"  %>
            <!--main div open-->
            <div class="row main text-center" style="margin: -20px;">
                <form action="generalcode/enquirycode.jsp" method="post"  >
                <div class="col-sm-12 h3 text-center">Enquiry Here....</div>
                <div class="row">
               <div class="col-sm-1"></div>
                <div class="col-sm-5">Enter User Name :</div>
                <div class="col-sm-5"><input required="" type="text" name="username" class="form-control"    /></div>
                <div class="col-sm-1"><br><br><br></div>
                </div>
                 <div class="row">
               <div class="col-sm-1"></div>
                <div class="col-sm-5">Enter Email :</div>
                <div class="col-sm-5"><input required="" type="text" name="email" class="form-control"    /></div>
                <div class="col-sm-1"><br><br><br></div>
                </div>
                <div class="row">
               <div class="col-sm-1"></div>
                <div class="col-sm-5">Enter Mobile No. :</div>
                <div class="col-sm-5"><input required="" type="text" name="mobile" class="form-control"    /></div>
                <div class="col-sm-1"><br><br><br></div>
                </div>
                <div class="row">
               <div class="col-sm-1"></div>
                <div class="col-sm-5">Enter Address :</div>
                <div class="col-sm-5"><input required="" type="text" name="address" class="form-control"    /></div>
                <div class="col-sm-1"><br><br><br></div>
                </div>
                <div class="row">
               <div class="col-sm-1"></div>
                <div class="col-sm-5">Enter Enquiry Text :</div>
                <div class="col-sm-5"><input required="" type="text" name="enquiry" class="form-control"    /></div>
                <div class="col-sm-1"><br><br><br></div>
                </div>
                <div class="row">
               <div class="col-sm-1"></div>
               <div class="col-sm-5"></div>
               <div class="col-sm-5"><input required="" type="submit"  class="form-control btn-primary"   /></div>
                <div class="col-sm-1"><br><br><br></div>
                </div>
                </form>
            </div>
            <!--main div close-->

            <%@include file="masterpages/footer.jsp"  %>

        </div>

    </body>
</html>

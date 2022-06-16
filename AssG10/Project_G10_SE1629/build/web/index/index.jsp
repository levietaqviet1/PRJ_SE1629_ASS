<%-- 
    Document   : index.jsp
    Created on : Jun 3, 2022, 8:59:17 PM
    Author     : NCC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="index.css">
    </head>
    <body>
        <div class="backGroup">

        </div>
        <div class="fo">
            <button onclick="document.getElementById('id01').style.display = 'block'"
                    style="display: block;width: auto;">Login</button>
            <button onclick="document.getElementById('id02').style.display = 'block'"
                    style="display: block;width: auto;">Register</button>
            <div id="id01" class="modal">
                <form class="modal-content animate" action="/action_page.php" method="post">
                    <div class="imgcontainer">
                        <span onclick="document.getElementById('id01').style.display = 'none'" class="close"
                              title="Close Modal">&times;</span>

                    </div>

                    <div class="container">
                        <label for="uname"><b>Username</b></label>
                        <input type="text" placeholder="Enter Username" name="uname" required>

                        <label for="psw"><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" name="psw" required>

                        <select name="" id="" style="padding: 10px ; font-size: 15px;">
                            <option selected="selected" hidden value="">Select Role</option>
                            <option value="3">Sinh viên</option>
                            <option value="4">Giảng viên</option>
                            <option value="5">Cán bộ ĐH-FPT</option>
                            <option value="6">Phụ huynh</option>
                        </select>
                        <select name="" id="" style="padding: 10px ; font-size: 15px;">
                            <option selected="selected" hidden value="">Select Campus</option>
                            <option value="3">FU-H&#242;a Lạc</option>
                            <option value="4">FU-Hồ Ch&#237; Minh</option>
                            <option value="5">FU-Đ&#224; Nẵng</option>
                            <option value="6">FU-Cần Thơ</option>
                            <option value="7">FU-Quy Nhơn</option>
                        </select>
                        <button type="submit">Login</button>
                        <label>
                            <input type="checkbox" checked="checked" name="remember"> Remember me
                        </label>
                    </div>

                    <div class="container" style="background-color:#f1f1f1">
                        <button type="button" onclick="document.getElementById('id01').style.display = 'none'"
                                class="cancelbtn">Cancel</button>
                        <!-- <span class="psw">Forgot <a href="#">password?</a></span> -->
                    </div>
                </form>
            </div>

            <div id="id02" class="modal">

                <span onclick="document.getElementById('id02').style.display = 'none'" class="close"
                      title="Close Modal">&times;</span>
                <div class="container">
                    <h1>Register</h1>
                    <h2>Information Student</h2>
                    <hr>
                    <form action="/action_page.php"></form>
                    <label for="user"><b>UserName</b></label>
                    <input type="text" placeholder="Enter User" name="user" id="user" required>

                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

                    <label for="psw-repeat"><b>Repeat Password</b></label>
                    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>

                    <label for="firstName"><b>First Name</b></label>
                    <input type="text" placeholder="Enter First Name" name="firtName" id="firstName" required>

                    <label for="lasttName"><b>Last Name</b></label>
                    <input type="text" placeholder="Enter Last Name" name="lasttName" id="lasttName" required>

                    <label for="dateOf"><b>Date Of Birth</b></label>
                    <input type="date" style="font-size: 17px;" placeholder="Enter Last Name" name="dateOf" id="dateOf"
                           required>

                    <label for="gender"><b>Gender</b></label>
                    <div class="gen">
                        <input type="radio" placeholder="Enter Email" name="gender_" id="Male" checked required> <label
                            for="Male">Male</label>
                        <input type="radio" placeholder="Enter Email" name="gender_" id="Female" required><label
                            for="Female">Female</label>
                    </div>

                    <label for="address"><b>Address</b></label>
                    <input type="text" placeholder="Enter address" name="address" id="address" required>

                    <label for="telephone"><b>Telephone</b></label>
                    <input type="text" placeholder="Enter telephone" name="telephone" id="telephone" required>

                    <label for="email"><b>Email</b></label>
                    <input type="text" placeholder="Enter Email" name="email" id="email" required>

                    <label for="Specialized"><b>Specialized</b></label>
                    <div class="gen">
                        <select style="font-size:25px ; width: 100%;" class="form-control" name="specialized">
                            <option value="1">Kỹ Thuật Phần Mềm</option>
                            <option value="2">An Toàn Thông Tin</option>
                            <option value="3">Quản Trị Kinh Doanh</option>
                        </select>
                    </div>

                    <label for="selectCampus"><b>Select Campus</b></label>
                    <div class="gen">
                        <select style="font-size:25px ; width: 100%;" class="form-control" name="specialized">
                            <option selected value="3">FU-H&#242;a Lạc</option>
                            <option value="4">FU-Hồ Ch&#237; Minh</option>
                            <option value="5">FU-Đ&#224; Nẵng</option>
                            <option value="6">FU-Cần Thơ</option>
                            <option value="7">FU-Quy Nhơn</option>
                        </select>
                    </div>

                    <hr>

                    <button type="submit" class="registerbtn">Register</button>
                    </form>
                    <div class="container signin">
                        <p>Already have an account? <button style="display: inline ; width: 100px ;"
                                                            onclick="document.getElementById('id02').style.display = 'none';document.getElementById('id01').style.display = 'block'">Sign
                                in</button></p> <br />
                    </div>
                </div>


            </div>
        </div>

    </body>
</html>

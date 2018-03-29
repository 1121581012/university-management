<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>


    <!-- General meta information -->
    <title>欢迎登录</title>
    <meta charset="utf-8" />
    <!-- // General meta information -->


    <!-- Load Javascript -->
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.query-2.1.7.js"></script>
    <script type="text/javascript" src="js/rainbows.js"></script>
    <!-- // Load Javascipt -->

    <!-- Load stylesheets -->
    <link type="text/css" rel="stylesheet" href="css/style.css" media="screen" />
    <!-- // Load stylesheets -->

    <script>


        $(document).ready(function(){

            $("#submit1").hover(
                function() {
                    $(this).animate({"opacity": "0"}, "slow");
                },
                function() {
                    $(this).animate({"opacity": "1"}, "slow");
                });
        });


    </script>

</head>
<body>

<div id="wrapper">
    <div id="wrappertop"></div>

    <div id="wrappermiddle">

        <h2>欢迎登录</h2>
        <form action="login" method="post">
        <div id="username_input">
            <div id="username_inputleft"></div>
            <div id="username_inputmiddle">
                    <input type="text" name="studentId" id="url" value="请输入学号" onclick="this.value = ''">
                    <img id="url_user" src="images/mailicon.png" alt="">
            </div>
            <div id="username_inputright"></div>
        </div>
        <div id="password_input">
            <div id="password_inputleft"></div>
            <div id="password_inputmiddle">
                    <input type="password" name="password" id="url" value="请输入密码" onclick="this.value = ''">
                    <img id="url_password" src="images/passicon.png" alt="">
            </div>
            <div id="password_inputright"></div>
        </div>
        <div id="submit">
                <input type="image" src="images/submit_hover.png" id="submit1" value="Sign In">
                <input type="image" src="images/submit.png" id="submit2" value="Sign In">
        </div>
        </form>


        <div id="links_left">

            <a href="#">忘记密码?</a>

        </div>

        <div id="links_right"></div>

    </div>

    <div id="wrapperbottom"></div>

    <div id="powered">

    </div>
</div>

</body>
</html>
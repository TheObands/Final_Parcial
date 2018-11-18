<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="my_main">
        <title>Login Page</title>
        <style type="text/css">
            label {
            float:left;
            width:65px;
            }
        </style>
    </head>
    <body>
       <g:form action="login" style="padding-left:220px">
        <h1>Login form</h1>
            <div style="width:220px">
                <label>User: </label><input type="text" name="username"/>
                <label>Password: </label><input type ="password" name="password"/>
                <label><input type="submit" value="Login" />
            </div>
        </g:form>
    </body>
</html>

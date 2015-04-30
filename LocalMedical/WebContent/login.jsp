<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<script>
function validateLogin()
{
    if(document.loginForm.name.value=="")
    {
      alert("Enter Username");
      document.loginForm.name.focus();
      return false;
    }
    else if(document.loginForm.pass.value=="")
    {
      alert("Enter Password");
      document.loginForm.pass.focus();
      return false;
    }

    document.loginForm.submit();
}
</script>

</head>
<body>
<form name="loginForm" method="post" action="auth.do">
<center>
<h1>Local Medical</h1>
<hr>


UserName:<input type="text" name="name" /><br><br>
Password:<input type="password" name="pass" /><br><br>
<input type="button" value="Login" onclick="validateLogin()" />
<input type="reset" value="Reset"/>
</center>
</form>
<%
Object obj = request.getAttribute("error");
if(obj!=null)
{
	System.out.println(obj.toString());
%>
<h3 align="center"><font color="RED"><%=obj.toString() %></font></h3>
<%
}
%>
</body>
</html>
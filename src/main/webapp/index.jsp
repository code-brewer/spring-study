<html>
<body>
<h2>Hello World!</h2>
<%
System.out.println("-----forward to /views/login/login.jsp----");
request.getRequestDispatcher("/WEB-INF/views/login/login.jsp").forward(request,response); %>
</body>
</html>

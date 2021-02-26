
<html>
<body>
<h2>JBehaveTestApp</h2>

</body>
<%
    Calculator calc = new Calculator();
    calc.add(Integer.parseInt(request.getParameter("number1")),Integer.parseInt(request.getParameter("number2")));
%>
<p>Result: <%=calc.getResult()%></p>
</html>

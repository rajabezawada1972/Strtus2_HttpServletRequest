<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Employee Success Page</title>
</head>
<body>
<h2>Employee details are from Request object </h2><br>

<hr>

  Code :<s:property value="#request.code"/><br>
  Name :<s:property value="#request.name"/><br>
  City :<s:property value="#request.city"/><br>
  Salary :<s:property value="#request.salary"/><br>
  <hr>


</body>
</html>
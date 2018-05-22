<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
  <head>
    <title>인덱스 페이지</title>
  </head>
  <body>
    <sec:authorize access="isAuthenticated()">
      <sec:authentication property="name" /> 님 환영합니다.
    </sec:authorize>

  <ul>
    <li><a href="/test/main">/manager/main</li>
      <li><a href="/admin/main">/admin/main</li>

   <sec:authorize access="isAuthenticated()">
      <li>/j_spring_security_logout</li>
    </sec:authorize>
  </ul>
  </body>
</html>

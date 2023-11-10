<%@ page import="kminsik.servlet.domain.member.Member" %>
<%@ page import="java.util.List" %>
<%@ page import="kminsik.servlet.domain.member.MemberRepository" %><%--
  Created by IntelliJ IDEA.
  User: MS
  Date: 11/10/23
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  MemberRepository memberRepository = MemberRepository.getInstance();
  List<Member> members = memberRepository.findAll();
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
  <thead>
  <th>id</th>
  <th>username</th>
  <th>age</th>
  </thead>
  <tbody>
    <%
      for (Member member : members) {
          out.write("    <tr>");
          out.write("       <td>" + member.getId() + "</td>");
          out.write("       <td>" + member.getUsername() + "</td>");
          out.write("       <td>" + member.getAge() + "</td>");
          out.write("    </tr>");
      }
    %>
  </tbody>
</table>

</body>
</html>

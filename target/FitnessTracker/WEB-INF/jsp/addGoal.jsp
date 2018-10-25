<%--
  Created by IntelliJ IDEA.
  User: samdavies
  Date: 24/10/2018
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
</head>
<style>
    .error {
        color: #ff0000;
    }

    .errorBlock {
        color: #ff0000;
        background: #ffEEEE;
        border: 3px solid black;
        padding: 8px;
        margin: 16px;
    }
</style>
<body>
<form:form commandName="goal">
    <form:errors path="*" element="div" cssClass="errorBlock"/>
    <table>
        <tr>
            <td>Add goal for today : </td>
            <td><form:input path="minutes" cssErrorClass="error"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Submit Goal">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

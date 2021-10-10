
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="POST" action="note">
            <label>Title</label>
            <input type="text" name="title_" value="${note.title1}">
            <br>
            <label>Contents</label>
            <input type="text" name="contents_" value="${note.contents1}">
            <br><br>
            <input type="submit" value="Save">
            
        </form>
            <c:if test="${errorMessage}">
                <p>Empty!</p>
            </c:if>
 
    </body>
</html>
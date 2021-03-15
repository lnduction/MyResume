<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="float: left" >&nbsp;<i class="fas fa-heart"></i>&nbsp;&nbsp;&nbsp;&nbsp;Hobby</h3>
        <h5 class="panel-title" align="right" ><a href="/edit/hobbies">Edit</a></h5>
    </div>
    <div class="panel-body">
        <br>
        <table class="table">
            <tbody>
                <c:forEach var="hobby" items="${account.hobbies}">
                    <tr align="center"><td>${hobby.hobbyCategory.img}</td><td align="center">${hobby.hobbyCategory.category}</td></tr>
                </c:forEach>
            <tr><td></td><td></td></tr>
            </tbody>
        </table>
    </div>
</div>
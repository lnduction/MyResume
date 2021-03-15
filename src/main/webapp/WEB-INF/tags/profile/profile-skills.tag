<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="float: left" >&nbsp;<i class="fas fa-cogs"></i>&nbsp;&nbsp;&nbsp;&nbsp;Technical skill</h3>
        <h5 class="panel-title" align="right" ><a href="/edit/skills">Edit</a></h5>
    </div>
    <div class="panel-body">
        <br>
        <table class="table">
            <thead><tr><th scope="col">Category</th><th scope="col" >Framework and technologies</th></tr></thead>
            <tbody>
            <c:forEach var="skill" items="${account.skills}">
                <tr><th scope="row">${skill.skillCategory.category}</th><td>${skill.frameworkAndTechnology}</td></tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
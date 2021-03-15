<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-primary">
    <div class="panel-heading" >
        <h3 class="panel-title" style="float: left" >&nbsp;<i class="fas fa-language"></i>&nbsp;&nbsp;&nbsp;&nbsp;Foreign languages</h3>
        <h5 class="panel-title" align="right" ><a href="/edit/languages">Edit</a></h5>
    </div>
    <div class="panel-body">
        <c:forEach var="language" items="${account.languages}">
        <h5>${language.language}: ${language.type.getDbValue()} (${language.level.getDbValue()})</h5>
        </c:forEach>
    </div>
</div>
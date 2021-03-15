<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="panel panel-primary">
    <img class="img-responsive" style="width:100%" src="${account.photo}">
    <h3 align="center">${account.firstName} ${account.lastName} ${account.middleName == null ? '': account.middleName}</h3>
    <c:if test="${account.country != null}"><p align="center">${account.country}<c:if test="${account.city != null}">, ${account.city}</c:if></p></c:if>
    <h5 align="center">Age: 2020, Birthday: <fmt:formatDate value="${account.birthday}" pattern="yyyy-mm-dd" /></h5><br>
    <table class="table">
        <tbody>
        <tr></tr>
        <tr><td>&nbsp;<i class="fas fa-phone"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.privacy.phone}</td></tr>
        <tr><td>&nbsp;<i class="fas fa-envelope"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.email}</td></tr>
        <c:if test="${account.contacts.skype != null}"><tr><td>&nbsp;<tr><td><i class="fab fa-skype"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.contacts.skype}</td></tr></c:if>
        <c:if test="${account.contacts.vkontakte != null}"><tr><td>&nbsp;<tr><td><i class="fab fa-vk"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.contacts.vkontakte}</td></tr></c:if>
        <c:if test="${account.contacts.facebook != null}"><tr><td>&nbsp;<tr><td><i class="fab fa-facebook-f"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.contacts.facebook}</td></tr></c:if>
        <c:if test="${account.contacts.linkedin != null}"><tr><td>&nbsp;<tr><td><i class="fab fa-linkedin-in"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.contacts.linkedin}</td></tr></c:if>
        <c:if test="${account.contacts.github != null}"><tr><td>&nbsp;<tr><td><i class="fab fa-github"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.contacts.github}</td></tr></c:if>
        <c:if test="${account.contacts.stackoverflow != null}"><tr><td>&nbsp;<tr><td><i class="fab fa-github"></i>&nbsp;&nbsp;&nbsp;&nbsp;${account.contacts.stackoverflow}</td></tr></c:if>
        </tbody>
    </table>
</div>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>

<h3 align="center">Hobbies</h3>
<h5 align="center">(No more than five)</h5>
<hr style="background: #d4d4d4;">
<br>

<form:form action="/edit/hobbies" method="post" commandName="hobbyForm">
    <div id="box-form">
    <c:forEach var="category" items="${hobbyCategories}" varStatus="loop">
        <c:if test="${loop.index % 4 == 0}"> <div class="row"> </c:if>
            <div class="col-md-3 col-sm-6 col-xs-6" >
                <div class="btn-group-toggle" data-toggle="buttons">
                    <label class="${hobbies.contains(category) ? 'btn btn-success active' : 'btn btn-default'}" style="width: 100%; margin-bottom: 5px;"
                           onclick="this.className = (this.className === 'btn btn-default' ? 'btn btn-success' : 'btn btn-default active')" for="${category.id}">
                    <input type="checkbox" id="${category.id}" >${category.img} ${category.category}</label>
                </div>
            </div>
        <c:if test="${loop.index % 4 == 3}"></div></c:if>
    </c:forEach>
    </div>
    <form:errors path="items" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
    <hr style="background: #d4d4d4;">
    <div align="center"><button type="submit" class="btn btn-primary" align="center">Submit</button></div>
</form:form>

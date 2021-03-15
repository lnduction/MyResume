<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h3 align="center">Practical experience</h3>
<hr style="background: #d4d4d4;">
<br>

<form:form action="/edit/courses" method="post" commandName="courseForm">
    <c:forEach var="course" items="${courses.items}" varStatus="loop">
        <input type="hidden"  name="items[${loop.index }].id" value="${course.id}"/>
        <div class="panel" id="ui-item-${loop.index}"  style="margin-left: 30px; margin-right:30px; -webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);
    box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);">
            <div class="panel-heading">
                <button type="button" class="close" onclick="$('#ui-item-${loop.index}').remove();">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <label for="name">Course name</label>
                        <input type="text" class="form-control" id="name" name="items[${loop.index }].name" placeholder="Course name" value="${course.name.trim()}">
                        <form:errors path="items[${loop.index }].name" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <label for="school">School</label>
                        <input type="text" class="form-control" id="school" name="items[${loop.index }].organisation" placeholder="School" value="${course.organisation.trim()}">
                        <form:errors path="items[${loop.index }].organisation" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                    <div class="col-md-2 col-sm-6 col-xs-6">
                        <label for="date-start">Date start</label>
                        <input type="text" class="form-control" id="date-start" maxlength="10"  placeholder="YYYY-MM-DD" name="items[${loop.index }].startDate" value="<fmt:formatDate value="${course.startDate}" pattern="yyyy-MM-dd" />" pattern=(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31))>
                        <form:errors path="items[${loop.index }].startDate" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                    <div class="col-md-2 col-sm-6 col-xs-6">
                        <label for="date-end">Date end</label>
                        <input type="text" class="form-control" id="date-end" maxlength="10" placeholder="YYYY-MM-DD" name="items[${loop.index }].endDate" value="<fmt:formatDate value="${course.endDate}" pattern="yyyy-MM-dd" />" pattern=(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31))>
                        <form:errors path="items[${loop.index }].endDate" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>

    <a href="">+ Add</a><br>
    <hr style="background: #d4d4d4;">
    <div align="center"><button type="submit" class="btn btn-primary" align="center">Submit</button></div>
</form:form>

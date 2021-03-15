<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>

<h3 align="center">Practical experience</h3>
<hr style="background: #d4d4d4;">
<br>

<form:form action="/edit/education" method="post" commandName="educationForm">
    <c:forEach var="education" items="${educations.items}">
    <input type="hidden"  name="items[${loop.index }].id" value="${education.id}"/>
    <div class="panel" id="ui-item-${loop.index}" style="margin-right: 30px; margin-left: 30px; -webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);">
        <div class="panel-heading">
            <button type="button" class="close" onclick="$('#ui-item-${loop.index}').remove();">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="panel-body">
            <div class="row">
                <div class="col-md-12">
                    <label for="specialisation">Specialisation</label>
                    <textarea type="text" class="form-control" id="specialisation" name="items[${loop.index }].specialisation"  placeholder="Specialisation" rows="3" style="resize: none">${education.specialisation}</textarea>
                    <div class="col-xs-12 col-sm-12 col-md-12" style="padding-left: 0px; padding-right: 0px;">
                        <form:errors path="items[${loop.index }].specialisation" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-6 col-sm-6 col-xs-6">
                    <label for="year-start">Year start</label>
                    <input type="text" class="form-control" id="year-start" maxlength="4" name="items[${loop.index }].startYear" value="${education.startYear}" placeholder="YYYY" pattern=(?:19|20)[0-9]{2}>
                    <form:errors path="items[${loop.index }].startYear" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-6">
                    <label for="year-end">Year end</label>
                    <input type="text" class="form-control" id="year-end" maxlength="4" name="items[${loop.index }].endYear" value="${education.endYear}" placeholder="YYYY" pattern=(?:19|20)[0-9]{2}>
                    <form:errors path="items[${loop.index }].endYear" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <label for="university">University</label>
                    <input type="text" class="form-control" value="${education.university.trim()}" name="items[${loop.index }].university"  placeholder="University" id="university">
                    <form:errors path="items[${loop.index }].university" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <label for="department">Department</label>
                    <input type="text" class="form-control" value="${education.faculty.trim()}" name="items[${loop.index }].faculty" placeholder="Department" id="department">
                    <form:errors path="items[${loop.index }].faculty" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                </div>
            </div>
        </div>
    </div>
</c:forEach>

    <a href="">+ Add</a><br><hr style="background: #d4d4d4;">

    <div align="center"><button type="submit" class="btn btn-primary" align="center">Submit</button></div>
</form:form>

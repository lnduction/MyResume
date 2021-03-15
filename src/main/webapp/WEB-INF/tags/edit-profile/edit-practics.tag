<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h3 align="center">Practical experience</h3>
<hr style="background: #d4d4d4;">
<br>

<form:form action="/edit/practices" method="post" commandName="practiceForm">
    <c:forEach var="practice" items="${practices.items}" varStatus="loop">
        <input type="hidden"  name="items[${loop.index }].id" value="${practice.id}"/>
        <div class="panel" id="ui-item-${loop.index}" style="-webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);
        box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175); margin-left: 20px; margin-right: 20px;">
            <div class="panel-heading">
                <button type="button" class="close" onclick="$('#ui-item-${loop.index}').remove();">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <label for="position">Position</label>
                        <input type="text" class="form-control" id="position" name="items[${loop.index }].position" value="${practice.position.trim()}" placeholder="Position">
                        <form:errors path="items[${loop.index }].position" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <label for="company">Company or organisation</label>
                        <input type="text" class="form-control" id="company" name="items[${loop.index }].companyOrOrganisation" value="${practice.companyOrOrganisation.trim()}" placeholder="Company or organisation">
                        <form:errors path="items[${loop.index }].companyOrOrganisation" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-md-6">
                        <div class="col-md-6 col-sm-6 col-xs-6">
                            <label for="month-start">Mouth start</label>
                            <select id="month-start" name="items[${loop.index }].mouthStart" class="form-control">
                                <c:forEach var="mouth" items="${mouths}" varStatus="loopM">
                                    <option value="${loopM.index + 1}" ${loopM.index == practice.getMouthStart()  ? ' selected="selected"' : ''}>${mouth}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                            <label for="year-start">Year start</label>
                            <select id="year-start" name="items[${loop.index }].yearStart" class="form-control">
                                <c:forEach var="year" items="${years}" varStatus="loopY">
                                    <option value="${practice.getYearStart()}" ${year == practice.getYearStart()  ? ' selected="selected"' : ''}>${year}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="col-md-6 col-sm-6 col-xs-6">
                            <label for="month-end">Mouth end</label>
                            <select id="month-end" name="items[${loop.index }].mouthEnd" class="form-control">
                                <c:forEach var="mouth" items="${mouths}" varStatus="loopM">
                                    <option value="${loopM.index + 1}" ${loopM.index == practice.getMouthEnd()  ? ' selected="selected"' : ''}>${mouth}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-md-6 col-sm-6 col-xs-6">
                            <label for="year-end">Year end</label>
                            <select id="year-end" name="items[${loop.index }].yearEnd" class="form-control">
                                <c:forEach var="year" items="${years}" varStatus="loopY">
                                    <option value="${practice.getYearEnd()}" ${year == practice.getYearEnd()  ? ' selected="selected"' : ''}>${year}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-md-12">
                        <label for="progress">Progress</label>
                        <textarea type="text" name="items[${loop.index }].responsibilitiesProgress" class="form-control" id="progress"  placeholder="Progress" rows="3" style="resize: none">${practice.responsibilitiesProgress}</textarea>
                        <div class="col-xs-12 col-sm-12 col-md-12" style="padding-left: 0px; padding-right: 0px;">
                            <form:errors path="items[${loop.index }].responsibilitiesProgress" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                        </div>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-md-6 col-sm-12">
                        <label for="demo">Demo</label>
                        <input type="text" name="items[${loop.index }].demoLink" class="form-control" id="demo" placeholder="Demo" value="${practice.demoLink.trim()}">
                        <form:errors path="items[${loop.index }].demoLink" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <label for="source">Source</label>
                        <input type="text" name="items[${loop.index }].sourceDemoLink" class="form-control" id="source" placeholder="Source" value="${practice.sourceDemoLink.trim()}">
                        <form:errors path="items[${loop.index }].sourceDemoLink" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
        <a href="">+ Add</a><br><hr style="background: #d4d4d4;">
        <div align="center"><button type="submit" class="btn btn-primary" align="center">Submit</button></div>
</form:form>
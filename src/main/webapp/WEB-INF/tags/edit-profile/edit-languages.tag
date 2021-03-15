<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>

<h3 align="center">Knowledge of languages</h3>
<hr style="background: #d4d4d4;">
<br>

<form:form action="/edit/languages" method="post" commandName="languageForm">
    <c:forEach var="language" items="${languages.items }"  varStatus="loop">
        <input type="hidden"  name="items[${loop.index }].id" value="${language.id}"/>
        <div class="panel" id="ui-item-${loop.index}"  style="-webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);">
            <div class="panel-heading">
                <button type="button" class="close" onclick="$('#ui-item-${loop.index}').remove();">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="col-md-6 col-sm-6 col-xs-6" style="padding-left: 0px; padding-right: 5px;">
                            <label for="language-category">Category</label>
                            <select id="language-category" name="items[${loop.index}].type" class="form-control">
                                <c:forEach var="type" items="${types}">
                                    <option value="${language.type}" ${type == language.type.getDbValue()  ? ' selected="selected"' : ''}>${type}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-md-6  col-sm-6 col-xs-6" style="padding-left: 5px; padding-right: 0px;">
                            <label for="language">Language</label>
                            <input type="text" class="form-control" name="items[${loop.index }].language" id="language" placeholder="Language" value="${language.language.trim()}">
                            <form:errors path="items[${loop.index }].languages" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                        </div>
                    </div>
                    <div class="col-md-9  col-sm-12 col-xs-12" style="padding-left: 10px;">
                        <label for="level" class="form-label">Level</label>
                        <div align="center">
                            <input type="hidden"  name="items[${loop.index }].level" value="${language.level}"/>
                            <input type="range" class="form-range" min="0" max="6" step="1" id="level" value="${language.level.getSliderIntValue()}" style="width: 95%">
                        </div>
                        <div style="display: flex; justify-content: space-between;">
                            <c:forEach var="level" items="${levels}">
                                <h6 for="level">${level}</h6>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>

    <a href="">+ Add</a><br><hr style="background: #d4d4d4;">
    <div align="center"><button type="submit" class="btn btn-primary" align="center">Submit</button></div>

</form:form>
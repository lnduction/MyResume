<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>

<h3 align="center">Technical skills in frameworks and technologies</h3>
<hr style="background: #d4d4d4;">


    <div class="row">
        <div class="col-md-3 col-sm-4 col-xs-4" align="center"><h5>Category</h5></div>
        <div class="col-md-9 col-sm-8 col-xs-8" align="center"><h5>Framework and technology</h5></div>
    </div>
    <br>
        <form:form action="/edit/skills" method="post" commandName="skillForm">
            <div id="ui-block-container">
                <c:forEach var="skill" items="${skills.items}" varStatus="loop">
                    <div id="ui-item-${loop.index}">
                        <button type="button" class="close" onclick="$('#ui-item-${loop.index}').remove();">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <div class="row"  style="padding-left: 30px; padding-right: 30px;">
                            <div class="col-md-3 col-sm-4 col-xs-4" align="center">
                                <input type="hidden" name="items[${loop.index}].id" value="${skill.id}" />
                                <select name="items[${loop.index }].skillCategory.category" class="form-control">
                                    <c:forEach var="category" items="${skillCategories}">
                                        <option value="${skill.skillCategory.category}" ${category.category == skill.skillCategory.category ? ' selected="selected"' : ''}>${category.category}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="col-md-9 col-sm-8 col-xs-8 value-container">
                                <textarea type="text" name="items[${loop.index }].frameworkAndTechnology" class="form-control pull-right" required="required"  placeholder="Framework and technology" rows="3" style="resize: none">${skill.frameworkAndTechnology}</textarea>
                                <div class="col-xs-12 col-sm-12 col-md-12" style="padding-left: 0px; padding-right: 0px;">
                                    <form:errors path="items[${loop.index }].frameworkAndTechnology" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
                                </div>
                            </div>

                        </div>
                    </div>
                    <br>
                </c:forEach>
            </div>

    <a href="javascript:void(0);">+ Add</a><br><hr style="background: #d4d4d4;">

    <div align="center">
        <button type="submit" class="btn btn-primary" align="center">Submit</button>
    </div>
</form:form>


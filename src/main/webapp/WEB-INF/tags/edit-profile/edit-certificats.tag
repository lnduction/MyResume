<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/edit-profile" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h3 align="center">Technical skills in frameworks and technologies</h3>
<hr style="background: #d4d4d4;">
<form>
    <c:forEach var="certificate" items="${certificates.items}" varStatus="loop">
        <div class="row" id="ui-item-${loop.index}">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <button type="button" class="close" style="margin-right: 5px;" onclick="$('#ui-item-${loop.index}').remove();">
                    <span aria-hidden="true">&times;</span>
                </button>
                <div class="panel" style="-webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);">
                    <div class="panel-body" align="center">
                        <img class="img-responsive" style="width:100%" src="${certificate.photo}">
                        <a href="">${certificate.name}</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3"></div>
        </div>
    </c:forEach>

    <hr style="background: #d4d4d4;"><br><a href="">+ Add</a><br>

    <div align="center">
        <hr style="background: #d4d4d4;">
        <button type="submit" class="btn btn-primary" align="center">Submit</button>
    </div>
</form>

<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="float: left">&nbsp;<i class="fas fa-certificate"></i>&nbsp;&nbsp;&nbsp;&nbsp;Certificates</h3>
        <h5 class="panel-title" align="right" ><a href="/edit/certificates">Edit</a></h5>
    </div>
    <div class="panel-body">
        <c:forEach var="certificate" items="${account.certificates}" varStatus="loop">
                <c:if test="${loop.index % 4 == 0}"><div class="row"></c:if>
                    <div class="col-md-3" style="margin-top: 10px;">
                        <div class="panel" align="center" style=" -webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175); box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175); border-radius: 5px;">
                            <div class="row"><div class="col-md-12" align="center"><img class="img-thumbnail" style="width:90%; margin-top: 7px;" src="${certificate.photo}"></div></div>
                            <div class="row"><div class="col-md-12" align="center"><a href="">${certificate.name}</a></div></div>
                        </div>
                    </div>
                <c:if test="${loop.index % 4 == 3}"> </div></c:if>
                <c:if test="${(loop.index == (fn:length(account.certificates) - 1)) && (fn:length(account.certificates) % 4 != 0)}"></div></c:if>
        </c:forEach>
    </div>
</div>
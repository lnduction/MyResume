<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="float: left" >&nbsp;<i class="fas fa-briefcase"></i>&nbsp;&nbsp;&nbsp;&nbsp;Practice</h3>
        <h5 class="panel-title" align="right" ><a href="/edit/practices">Edit</a></h5>
    </div>
    <div class="panel-body">
        <ul class="timeline">
            <c:forEach var="practic" items="${account.practices}">
            <li class="timeline-inverted">
                <div class="timeline-badge danger"><i class="fas fa-briefcase"></i></div>
                <div class="timeline-panel">
                    <div class="timeline-heading">
                        <h3 style="margin-top: 10px;">${practic.position} of ${practic.companyOrOrganisation}</h3>
                        <h5><i class="far fa-calendar-alt"></i>&nbsp;<fmt:formatDate value="${practic.startDate}" pattern="yyyy:MM" /> - <fmt:formatDate value="${practic.endDate}" pattern="yyyy:MM" /></h5>
                    </div>
                    <div class="timeline-body" style="margin-bottom: 10px;"><p>${practic.responsibilitiesProgress}</p></div>
                </div>
            </li>
            </c:forEach>
        </ul>
    </div>
</div>
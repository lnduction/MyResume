<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="float: left" >&nbsp;<i class="fab fa-discourse"></i>&nbsp;&nbsp;&nbsp;&nbsp;Courses</h3>
        <h5 class="panel-title" align="right" ><a href="/edit/courses">Edit</a></h5>
    </div>
    <div class="panel-body">
        <ul class="timeline">
            <c:forEach var="course" items="${account.courses}">
            <li class="timeline-inverted">
                <div class="timeline-badge success"><i class="fab fa-discourse"></i></div>
                <div class="timeline-panel">
                    <div class="timeline-heading">
                        <h3 style="margin-top: 10px;">${course.name}</h3>
                        <h5><i class="far fa-calendar-alt"></i>&nbsp;
                            <fmt:formatDate value="${course.startDate}" pattern="yyyy-MM-dd" /> -
                            <fmt:formatDate value="${course.endDate}" pattern="yyyy-MM-dd" />&nbsp;&nbsp;&nbsp;&nbsp;
                                ${course.organisation}</h5>
                    </div>
                </div>
            </li>
            </c:forEach>
        </ul>
    </div>
</div>
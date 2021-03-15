<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="float: left" >&nbsp;<i class="fas fa-university"></i>&nbsp;&nbsp;&nbsp;&nbsp;Education</h3>
        <h5 class="panel-title" align="right" ><a href="/edit/education">Edit</a></h5>
    </div>
    <div class="panel-body">
        <ul class="timeline">
            <c:forEach var="education" items="${account.educations}">
                <li class="timeline-inverted">
                    <div class="timeline-badge warning"><i class="fas fa-university"></i></div>
                    <div class="timeline-panel">
                        <div class="timeline-heading">
                            <h3 style="margin-top: 10px;">${education.faculty}</h3>
                            <h5><i class="fas fa-university"></i>&nbsp;${education.startYear} - ${education.endYear}&nbsp;${education.university}</h5>
                        </div>
                        <div class="timeline-body" style="margin-bottom: 10px;">
                            <p>${education.specialisation}</p>
                        </div>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
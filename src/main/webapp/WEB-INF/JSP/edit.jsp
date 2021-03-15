<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="resume" tagdir="/WEB-INF/tags/edit-profile" %>

<div class="container" style="width: 70%; min-width: 600px">
    <div id="tableList" style="display: flex; justify-content: center;">
        <ul class="nav nav-tabs" id="myTab" role="tablist">
            <li class="nav-item ${basic1}" ><a href="/edit/basic" class="nav-link " ${basic2} >Basic</a></li>
            <li class="nav-item ${contacts1}" ><a href="/edit/contacts" class="nav-link "  ${contacts2} >Contacts</a></li>
            <li class="nav-item ${skills1}" ><a href="/edit/skills" class="nav-link "  ${skills2} >Skills</a></li>
            <li class="nav-item ${practices1}"><a href="/edit/practices" class="nav-link " ${practices2} >Practices</a></li>
            <li class="nav-item ${certificates1}"><a href="/edit/certificates" class="nav-link " ${certificates2} >Certificates</a></li>
            <li class="nav-item ${courses1}"><a href="/edit/courses" class="nav-link "  ${courses2} >Courses</a></li>
            <li class="nav-item ${education1}"><a href="/edit/education" class="nav-link " ${education2} >Education</a></li>
            <li class="nav-item ${languages1}"><a href="/edit/languages" class="nav-link " ${languages2} >Languages</a></li>
            <li class="nav-item ${hobbies1}"><a href="/edit/hobbies" class="nav-link " ${hobbies2} >Hobbies</a></li>
            <li class="nav-item ${info1}" ><a href="/edit/info" class="nav-link " ${info2} >Info</a></li>
        </ul>
    </div>
    <div class="panel">
        <div class="panel-body">
            <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade in ${basic1}" id="basic"  role="tabpanel"> <resume:edit-basic/></div>
                <div class="tab-pane fade in ${contacts1}" id="contacts" role="tabpanel" ><resume:edit-contacts/></div>
                <div class="tab-pane fade in ${skills1}" id="skills" role="tabpanel" ><resume:edit-skills/></div>
                <div class="tab-pane fade in ${practices1}" id="practices" role="tabpanel" ><resume:edit-practics/></div>
                <div class="tab-pane fade in ${certificates1}" id="certificates" role="tabpanel" ><resume:edit-certificats/></div>
                <div class="tab-pane fade in ${courses1}" id="courses" role="tabpanel" ><resume:edit-courses/></div>
                <div class="tab-pane fade in ${education1}" id="education" role="tabpanel" ><resume:edit-educations/></div>
                <div class="tab-pane fade in ${languages1}" id="languages" role="tabpanel" ><resume:edit-languages/></div>
                <div class="tab-pane fade in ${hobbies1}" id="hobbies" role="tabpanel" ><resume:edit-hobbies/></div>
                <div class="tab-pane fade in ${info1}" id="info" role="tabpanel" > <resume:edit-info/></div>
            </div>
        </div>
    </div>
</div>
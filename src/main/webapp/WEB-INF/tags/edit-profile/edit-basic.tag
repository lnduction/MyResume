<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h3 align="center">${account.item.firstName} ${account.item.lastName} ${account.item.middleName == null ? '' : account.item.middleName}</h3>
<input type="hidden" name="item.firstName" value="${account.item.firstName}" />
<input type="hidden" name="item.lastName" value="${account.item.lastName}" />
<input type="hidden" name="item.middleName" value="${account.item.middleName}" />

    <hr style="background: #d4d4d4;">
<form:form action="/edit/basic" method="post" commandName="accountForm">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2" align="right"><h5>Photo:</h5></div>
        <div class="col-md-6 col-sm-6 col-xs-6">
            <img class="img-responsive" name="item.photo" style="width:50%" src="${account.item.photo}">
            <input type="hidden" name="item.photo" value="${account.item.photo}" />
            <div class="custom-file"><input type="file" class="custom-file-input" id="customFile"></div>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4">
            <div>
                <p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">
                    1. Please use a real photo <br>
                    2. Its not necessary to use the photo as in the passport <br>
                    3. As an example, look at the photo in other resumes <br>
                    4. Use photo with jpg extension only
                </p>
            </div>
        </div>
    </div>
<hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2" align="right"><h5>Date of birth:</h5></div>
        <div class="col-md-6 col-sm-6 col-xs-6">
            <input type="text" name="item.birthday" class="form-control" id="date" maxlength="10"  placeholder="YYYY-MM-DD" pattern=(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31)) value="<fmt:formatDate value="${account.item.birthday}" pattern="yyyy-MM-dd"  />">
            <form:errors path="item.birthday" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4"><div><p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">Date format YYYY-MM-DD</p></div></div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2" align="right"><h5>Country:</h5></div>
        <div class="col-md-6 col-sm-6 col-xs-6">
            <input type="text" name="item.country" class="form-control" id="country"  placeholder="Country" value="${account.item.country == null ? '' : account.item.country.trim()}">
            <form:errors path="item.country" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4"></div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2" align="right"><h5>City:</h5></div>
        <div class="col-md-6 col-sm-6 col-xs-6">
            <input type="text" name="item.city" class="form-control" id="city"  placeholder="City" value="${account.item.city == null ? '' : account.item.city.trim()}">
            <form:errors path="item.city" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4"></div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2" align="right"><h5>Email:</h5></div>
        <div class="col-md-6 col-sm-6 col-xs-6">
            <input type="text" name="item.email" class="form-control" id="email"  placeholder="Email" value="${account.item.email == null ? '' : account.item.email.trim()}">
            <form:errors path="item.email" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4">
            <div>
                <p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">
                    1. Use email with your first and last name <br>
                    2. Dont use creative emails
                </p>
            </div>
        </div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2" align="right"><h5>Preferred work:</h5></div>
        <div class="col-md-6 col-sm-6 col-xs-6">
            <input type="text" name="item.preferredWork" class="form-control" id="preferred"  placeholder="Preferred work" value="${account.item.preferredWork == null ? '' : account.item.preferredWork.trim()}">
            <form:errors path="item.preferredWork" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4"><div><p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">Write your preferred work short and clear</p></div></div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2" align="right"><h5>Your qualification:</h5></div>
        <div class="col-md-6 col-sm-6 col-xs-6">
            <textarea type="text" name="item.qualification" class="form-control" id="qualification"  placeholder="Your qualification" rows="3" style="resize: none">${account.item.qualification == null ? '' : account.item.qualification}</textarea>
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form:errors path="item.qualification" cssClass="alert alert-danger" element="div" cssStyle="margin-bottom: 0px; padding-top: 3px; padding-bottom: 3px;"/>
            </div>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4">
            <div>
                <p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">
                    1. Write about your work experience <br>
                    2. Dont write about your experience outside IT
                </p>
            </div>
        </div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2 col-sm-2 col-xs-2"></div>
        <div class="col-md-6 col-sm-6 col-xs-6"><button type="submit" class="btn btn-primary">Submit</button></div>
        <div class="col-md-4 col-sm-4 col-xs-4"></div>
    </div>
</form:form>




<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>

<h3 align="center">About self</h3>
<h5 align="center">Some words about your</h5>
<hr style="background: #d4d4d4;">
<br>

<form:form action="/edit/info" method="post" commandName="infoForm">
    <div class="row">
        <div class="col-md-12">
            <textarea type="text" class="form-control" id="info"  placeholder="About you" rows="5" style="resize: none">${info}</textarea>
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-md-12">
            <p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">
                Specify additional information that may be useful to the employer
            </p>
        </div>
    </div>

    <hr style="background: #d4d4d4;">
    <div align="center"><button type="submit" class="btn btn-primary" align="center">Submit</button></div>
</form:form>
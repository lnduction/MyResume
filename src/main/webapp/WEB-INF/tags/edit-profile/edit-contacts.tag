<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>

<h3 align="center">Contacts</h3>
    <hr style="background: #d4d4d4;">

<form:form action="/edit/contacts" method="post" commandName="contactsForm">
    <div class="row">
        <div class="col-md-2 col-sm-3 col-xs-3" align="right">
            <h5>Skype:</h5>
        </div>
        <div class="col-md-6 col-sm-5 col-xs-5">
            <input type="text" class="form-control" id="skype" name="item.skype" placeholder="Skype" value="${contacts.item.skype == null ? '' : contacts.item.skype.trim()}">
            <form:errors path="item.skype" cssClass="alert alert-danger" element="div" cssStyle="padding-bottom: 3px; padding-top: 3px; margin-bottom: 0px;"/>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4">
            <p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">
                1. Use skype with your first and last name <br>
                2. Dont use creative skype
            </p>
        </div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-8 col-sm-8 col-xs-8" style="padding-left: 0px; padding-right: 0px;">
            <div class="col-md-3 col-sm-4 col-xs-4" align="right"><h5>Vkontakte:</h5></div>
            <div class="col-md-9 col-sm-8 col-xs-8">
                <input type="text" class="form-control" id="vkontakte" name="item.vkontakte" placeholder="Vkontakte" value="${contacts.item.vkontakte == null ? '' : contacts.item.vkontakte.trim()}">
                <form:errors path="item.vkontakte" cssClass="alert alert-danger" element="div" cssStyle="padding-bottom: 3px; padding-top: 3px; margin-bottom: 0px;"/>
                <hr style="background: #d4d4d4;">
            </div>
            <div class="col-md-3 col-sm-4 col-xs-4" align="right"><h5>Facebook:</h5></div>
            <div class="col-md-9 col-sm-8 col-xs-8">
                <input type="text" class="form-control" id="facebook" name="item.facebook" placeholder="Facebook" value="${contacts.item.facebook == null ? '' : contacts.item.facebook.trim()}">
                <form:errors path="item.facebook" cssClass="alert alert-danger" element="div" cssStyle="padding-bottom: 3px; padding-top: 3px; margin-bottom: 0px;"/>
                <hr style="background: #d4d4d4;">
            </div>
            <div class="col-md-3 col-sm-4 col-xs-4" align="right"><h5>LinkedIn:</h5></div>
            <div class="col-md-9 col-sm-8 col-xs-8">
                <input type="text" class="form-control" id="linkedin" name="item.linkedin" placeholder="LinkedIn" value="${contacts.item.linkedin == null ? '' : contacts.item.linkedin.trim()}">
                <form:errors path="item.linkedin" cssClass="alert alert-danger" element="div" cssStyle="padding-bottom: 3px; padding-top: 3px; margin-bottom: 0px;"/>
                <hr style="background: #d4d4d4;">
            </div>
            <div class="col-md-3 col-sm-4 col-xs-4" align="right"><h5>GitHub:</h5></div>
            <div class="col-md-9 col-sm-8 col-xs-8">
                <input type="text" class="form-control" id="github" name="item.github" placeholder="GitHub" value="${contacts.item.github == null ? '' : contacts.item.github.trim()}">
                <form:errors path="item.github" cssClass="alert alert-danger" element="div" cssStyle="padding-bottom: 3px; padding-top: 3px; margin-bottom: 0px;"/>
                <hr style="background: #d4d4d4;">
            </div>
            <div class="col-md-3 col-sm-4 col-xs-4" align="right"><h5>StackOverFlow:</h5></div>
            <div class="col-md-9 col-sm-8 col-xs-8">
                <input type="text" class="form-control" id="stackoverflow" name="item.stackoverflow" placeholder="StackOverFlow" value="${contacts.item.stackoverflow == null ? '' : contacts.item.stackoverflow.trim()}">
                <form:errors path="item.stackoverflow" cssClass="alert alert-danger" element="div" cssStyle="padding-bottom: 3px; padding-top: 3px; margin-bottom: 0px;"/>
            </div>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-4">
            <p style="border-left: 2px solid #ccc; margin-left: 20px; padding-left: 10px;">
                1. HR can see your profile, please clear all contrary information <br>
                2. Check your profile for information that might defame you <br>
            </p>
        </div>
    </div>
        <hr style="background: #d4d4d4;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-6"><button type="submit" class="btn btn-primary">Submit</button></div>
        <div class="col-md-4"></div>
    </div>
</form:form>
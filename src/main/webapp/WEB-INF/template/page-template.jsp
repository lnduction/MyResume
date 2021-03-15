<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="resume" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <link rel="stylesheet" href="/static/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/static/css/app.css">
    <link rel="stylesheet" href="/static/css/font-awesome.css">
    <link rel="stylesheet" href="/static/css/all.css">
    <link rel="stylesheet" href="/static/css/timeline.css">
    <link rel="stylesheet" href="/static/css/fileinput.css">
    <link rel="stylesheet" href="/static/css/styles/progress-tracker.css">
    <link rel="stylesheet" href="/static/css/styles/site.css">

</head>
<body class ="bground">
<header>
    <resume:head/>
</header>
<section class="main">
    <sitemesh:write property='body'/>
</section>
<footer></footer>

<script src="/static/js/jquery.js"></script>
<script src="/static/js/bootstrap.js"></script>
<script src="/static/js/app.js"></script>
<script src="/static/js/all.js"></script>
<script src="/static/js/fileinput.js"></script>

</body>
</html>

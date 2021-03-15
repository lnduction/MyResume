<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<div class="container" style="width: 50%; min-width: 500px;">
<div class="panel panel-primary panel-info">
    <div class="panel-heading"><h5><i class="fas fa-external-link-alt"></i>&nbsp;Enter to your profile</h5></div>
    <div class="panel-body">
        <h5>You cant use your UID or Email or Phone like login</h5>
        <form>
            <div class="form-group">
                <label for="login">Login</label>
                <input class="form-control" id="login" placeholder="UID or Email or Phone">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password">
            </div>
            <div class="form-group form-check">
                <input type="checkbox" class="form-check-input" id="remember">
                <label class="form-check-label" for="remember">Remember me</label>
            </div><hr>
            <button type="submit" class="btn btn-success" style="float: left">Enter</button>
        </form>
        <div align="right"><button type="submit" class="btn btn-primary"><i class="fab fa-facebook-f"></i>&nbsp;&nbsp;&nbsp;&nbsp;Sing in Facebook</button><hr></div>
        <div align="center"><a href="" >Recovery success</a></div>
    </div>
</div>
</div>
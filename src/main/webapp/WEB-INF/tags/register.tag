<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<div class="container" style="width: 50%; min-width: 500px;">
    <div class="panel panel-primary panel-info">
        <div class="panel-heading">
            <h5><i class="fas fa-cash-register"></i>&nbsp;Enter your personal data</h5>
        </div>
        <div class="panel-body">
            <h5>Warning: you cant change your first name and last name! Please, use your real data.</h5>
            <form>
                <div class="form-group">
                    <label for="first-name">First name</label>
                    <input class="form-control" id="first-name" placeholder="First name">
                </div>
                <div class="form-group">
                    <label for="last-name">Last name</label>
                    <input class="form-control" id="last-name" placeholder="Last name">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password">
                </div>
                <div class="form-group">
                    <label for="password-confirm">Confirm password</label>
                    <input type="password" class="form-control" id="password-confirm">
                </div>
                <button type="submit" class="btn btn-success" style="float: left; width: 45%">Register</button>
            </form>
            <div align="right">
                <button type="submit" class="btn btn-primary" style="width: 45%"><i class="fab fa-facebook-f"></i>&nbsp;&nbsp;Sing up with Facebook</button>
            </div>
        </div>
    </div>
</div>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="col-md-2 col-sm-3 col-xs-4" style="padding-left: 0px;">
    <a class="navbar-brand" href="/">My Resume</a>
        </div>
        <div class="col-md-5 col-sm-2 col-xs-2"></div>

        <div class="col-md-4 col-sm-5 col-xs-6" style="padding-bottom: 10px; padding-top: 10px;">
    <form class="form-inline" role="search">
        <div class="col-md-9 col-sm-9 col-xs-9" align="right" style="padding-right: 5px;">
            <input class="form-control" type="search" placeholder="Search" aria-label="Search">
        </div>
        <div class="col-md-3 col-sm-3 col-xs-3" style="padding-left: 5px;">
            <button class="btn btn-primary" type="submit" >Find</button>
        </div>
    </form>
        </div>
        <div class="col-md-1 col-sm-2 col-xs-12">
        <ul class="nav navbar-nav navbar-right">

            <li class="dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                <ul class="dropdown-menu" role="menu">
                    <li><a class="dropdown-item" href="/profile"><i class="fas fa-eye"></i>&nbsp;My profile</a></li>
                    <li><a class="dropdown-item" href="/edit"><i class="fas fa-edit"></i>&nbsp;Edit profile</a></li>
                    <li><a class="dropdown-item" href=""><i class="fas fa-unlock"></i>&nbsp;Password</a></li>
                    <li><a class="dropdown-item" href=""><i class="fas fa-trash-alt"></i>&nbsp;Delete</a></li>
                    <li class="divider"></li>
                    <li><a class="dropdown-item" href=""><i class="fas fa-sign-out-alt"></i>&nbsp;Exit</a></li>
                </ul>
            </li>
        </ul>
    </div>
    </div>
</nav>
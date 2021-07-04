<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Registration</title>
<link rel="stylesheet" href="/css/logreg.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/js/logreg.js"></script>
</head>
<body> 
	<div>
		
	<div class="form-structor">
	<div class="signup">
		<h2 class="form-title" id="signup"><span>or</span>Sign up</h2>
		<p class="errorMessages"><form:errors path="user.*"/></p>
		<p class="errorMessages"><c:if test="${logoutMessage != null}">
        <c:out value="${logoutMessage}"></c:out>
    	</c:if>
    	<c:if test="${errorMessage != null}">
        <c:out value="${errorMessage}"></c:out>
	    </c:if></p>
		<div class="form-holder">		
    	<form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:input path="fullName" class="input" placeholder="Full Name"/>
        </p>
         <p>
            <form:input type="email" path="username" class="input" placeholder="Email"/>
        </p>
        <p>
            <form:password path="password"  class="input" placeholder="Password"/>
        </p>
        <p>
            <form:password path="passwordConfirmation"  class="input" placeholder="Password Confirmation"/>
        </p>
		</div>
		<input type="submit" value="Sign up" class="submit-btn"/>
		</div>
    </form:form>

	<div class="login slide-up">
		<div class="center">
			<h2 class="form-title" id="login"><span>or</span>Log in</h2>
			<div class="form-holder">
		<form method="POST" action="/login">
	        <p>
	            <input type="email" class="input" name="username" placeholder="Email"/>
	        </p>
	        <p>
	            <input type="password" class="input" name="password" placeholder="Password"/>
	        </p>
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="Login" class="submit-btn"/>
    	</form>
			</div>
		</div>
	</div>
</div>
</div>
	
</body>
</html>
<%@ page import="ua.com.timur.common.Consts" %>
<%@page contentType="text/html" session="true" %>
<%--<jsp:useBean id="facadeBean" scope="session" class="ua.com.cs.ifobs.webclient.legacy.base.FacadeBean"/>--%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<%
    if (Consts.SHOW_LOGIN_FIRST_STEP_PAGE) {
        response.sendRedirect("LoginSecurityShow.action");
    } else {
        response.sendRedirect("LoginChooseShow.action");
    }
%>
</html>
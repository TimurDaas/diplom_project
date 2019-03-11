<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title><s:property value="@ua.com.timur.common.Consts@APP_WEB_CLIENT_TITLE"/></title>
</head>
<body>
<h1 align="center" style="color: #ff4b0a;">
    Логин в систему
</h1>
<a href="LoginChooseShow.action">
    Легкий вход
</a>
<br>
<a href="LoginChooseShow.action">
    Стандартный вход
</a>
<br>
<a href="LoginChooseShow.action">
    Вход с MobileID
</a>
<br>
<s:if test="@ua.com.timur.common.Consts@APP_SELF_REGISTRATION_ENABLED">
    <a href="SelfRegistrationShow.action">
        Регистрация в системе
    </a>
</s:if>
</body>
</html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:property value="@ua.com.timur.common.Consts@APP_WEB_CLIENT_TITLE"/></title>
</head>
<body>
<h1 align="center" style="color: #2183f9;">
    Регистрация в системе
</h1>
<form id = "selfRegistration" title="Пройтите регистрацию в системе">
    <p>Введите фамилию </p>
    <input type="text" title="Введите фамилию" id="surname">
    <p>Введите имя </p>
    <input type="text" title="Введите имя" id="name">
    <p>Введите отчество </p>
    <input type="text" title="Введите отчество" id="middlename">
    <p>Тип пользователя </p>
    <select>
        <option value="1">Должностное лицо юр.лица</option>
        <option value="2">Юридическое лицо</option>
        <option value="3">Физ.лицо-предпрениматель</option>
        <option value="4">Физическое лицо</option>
    </select>
</form>
</body>
</html>

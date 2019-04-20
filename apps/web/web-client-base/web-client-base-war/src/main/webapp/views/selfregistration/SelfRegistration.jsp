<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:property value="@ua.com.timur.common.Consts@APP_WEB_CLIENT_TITLE"/></title>
</head>
<script src="./script/libs/jquery-3.3.1.min.js" type="text/javascript"></script>
<body>
<h1 align="center" style="color: #2183f9;">
    Регистрация в системе
</h1>
<form id = "selfRegistration" name = "selfRegistration" action="SelfRegistration.action" method="post">
    <p>Введите фамилию </p>
    <input type="text" title="Введите фамилию" id="surname" name="surname">
    <p>Введите имя </p>
    <input type="text" title="Введите имя" id="name" name="name">
    <p>Введите отчество </p>
    <input type="text" title="Введите отчество" id="middlename" name="middlename">
    <p>Тип пользователя </p>
    <select id = "usertype" name="usertype">
        <option value="1">Должностное лицо юр.лица</option>
        <option value="2">Юридическое лицо</option>
        <option value="3">Физ.лицо-предпрениматель</option>
        <option value="4">Физическое лицо</option>
    </select>
    <button type="submit" id = "enter_btn" value="Зарегистрироваться" onclick="doSubmit()">Registration</button>
</form>
<script type="text/javascript">
    function doSubmit() {
        document.selfRegistration.submit();
    }
</script>
</body>
</html>
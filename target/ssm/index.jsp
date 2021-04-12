<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="insert.do">
    <table>
        <tr>
            <td>请输入需要插入的学生信息</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input id="name" name="name"></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input id="age" name="age"></td>
        </tr>
        <tr>
            <td><input type="submit" value="增加"></td>
        </tr>
    </table>
</form>

<form action="select.do">
    <table>
        <tr>
            <td><input type="submit" value="查询所有"></td>
        </tr>
    </table>
</form>
</body>

</html>

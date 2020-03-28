<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-03-28
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${msg}</title>
</head>
<body>
    <div>
        <a href="../success">测试请求</a>
    </div>
    <div>
        <a href="../vermouth/pathAnt">测试path ant请求</a>
    </div>
    <div>
        <a href="../rest/vermouth">测试rest GET请求</a>
    </div>
    <div>
        <form action="../rest" method="post">
            <input type="submit" value="rest post"/>
        </form>
    </div>
    <div>
        <form action="../rest/kagura" method="post">
            <input type="hidden" name="_method" value="PUT"/>
            <input type="submit" value="rest put"/>
        </form>
    </div>
    <div>
        <form action="../rest/linux" method="post">
            <input type="hidden" name="_method" value="DELETE"/>
            <input type="submit" value="rest delete"/>
        </form>
    </div>
    <div>
        <form action="../saveUser" method="post">
            <div>
                <label for="username">姓名:</label>
                <input type="text" name="username" id="username"/>
            </div>
            <div>
                <label for="age">年龄:</label>
                <input type="text" name="age" id="age"/>
            </div>
            <div>
                <label for="address">地址:</label>
                <input type="text" name="userOther.address" id="address"/>
            </div>
            <div>
                <label for="phone">电话:</label>
                <input type="text" name="userOther.phone" id="phone"/>
            </div>
            <div>
                <input type="submit" value="submit form"/>
            </div>
        </form>
    </div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: qiulan
  Date: 2020/2/10
  Time: 1:50 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
</div>

<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    <div class="form-gruop">
        <label >书籍名称</label>
        <input type="text" class="form-controller"name="bookname" required>
    </div>
    <div class="form-gruop">
        <label >书籍数量</label>
        <input type="text" class="form-controller" name="bookcounts" required>
    </div>
    <div class="form-gruop">
        <label >书籍描述</label>
        <input type="text" class="form-controller" name="detail" required>
    </div>
    <div class="form-gruop">
       <input type="submit" class="form-controller" value="添加">
    </div>
</form>

</body>
</html>

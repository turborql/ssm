<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: qiulan
  Date: 2020/2/10
  Time: 8:52 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->

    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
        a{
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
        h3{
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: cornflowerblue;
        }
    </style>
</head>
<body>
<h1>书籍展示</h1>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12">
            <div class="page-header">
                <h1>书籍列表--------显示所有书籍</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8 column">
                <form action="${pageContext.request.contextPath}/book/queryBook" method="post">
                <input type="text"  name="queryBookName" class="from-control" placeholder="请输入要查询的书籍名称">
                <br>
                    <span style="color: red">${error}</span>

                    <input type="submit" value="搜索" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>
</div>

<div class="row clearfix">
    <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍详情</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${list}">
                <tr>
                   <td>${book.bookid}</td>
                   <td>${book.bookname}</td>
                   <td>${book.bookcounts}</td>
                   <td>${book.detail}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookid}">修改</a>|
                        <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.bookid}">删除</a>
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>


</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    单个文件上传<br/>
    <form action="/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file"><br/>
        <input type="submit" value="提交上传">
    </form>

    多个文件上传<br/>
    <form action="/uploads" method="post" enctype="multipart/form-data">
        <input type="file" name="file"><br/>
        <input type="file" name="file"><br/>
        <input type="file" name="file"><br/>
        <input type="submit" value="提交上传">
    </form>
</body>
</html>

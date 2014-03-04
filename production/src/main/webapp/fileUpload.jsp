<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <s:form namespace="/" action="upload_file" method="post" enctype="multipart/form-data">
       <s:file name="file" label="请选择文件！"></s:file>
       <s:submit label="上传"></s:submit>
   </s:form>
</body>
<s:fielderror></s:fielderror>
</html>
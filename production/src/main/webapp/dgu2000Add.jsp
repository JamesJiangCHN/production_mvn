<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>添加新用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" href="css/jquery-ui-1.10.0.custom.css">
<script src="js/jquery-1.10.2.js"></script>
<script src="js/jquery-ui-1.10.4.custom.js"></script>
<script src="js/myui.js"></script>
</head>

<body>
	<center>
		<h1>添加采集器</h1>
		<div style="text-align:left; margin:0 auto;width:250px;">
		<s:form action="dgu2000_add" namespace="/" method="post">
			<div>
				<label>采集器id</label>
				<s:textfield label="采集器id" name="dgu2000.id"></s:textfield>
			</div>
			<div>
				<label>采集器ip</label>
				<s:textfield label="采集器ip" name="dgu2000.ip" value="192.168.0."></s:textfield>
			</div>
			<div>
				<label>项目名称</label>
				<s:select cssClass="combobox" list="projectList" name="project.projectId" listKey="projectId" listValue="projectName">
				</s:select>
			</div>
			<div>
				<s:submit value="提交"></s:submit>
			</div>
		</s:form>
		</div>
	</center>
</body>
</html>

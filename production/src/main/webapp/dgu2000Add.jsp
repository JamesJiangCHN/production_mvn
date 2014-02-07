<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>添加新用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" href="css/jquery-ui-1.10.4.custom.css">
<script src="js/jquery-1.10.2.js"></script>
<script src="js/jquery-ui-1.10.4.custom.js"></script>
<script>
	$(function() {
		$("input[type=submit], a, button").button();
	});
</script>
</head>

<body>
	<center>
		<h1>添加采集器</h1>
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
				<s:textfield label="项目名称" name="dgu2000.xiangmuName"></s:textfield>
			</div>
			<div>
				<label>风场名称</label>
				<s:textfield label="风场名称" name="dgu2000.fengchang"></s:textfield>
			</div>
			<div>
				<label>风场地址</label>
				<s:textfield label="地址" name="dgu2000.address"></s:textfield>
			</div>
			<div>
				<s:submit value="提交"></s:submit>
			</div>
		</s:form>
	</center>
</body>
</html>

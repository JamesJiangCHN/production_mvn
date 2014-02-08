<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>用户列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<link rel="stylesheet" href="css/jquery-ui-1.10.0.custom.css">
<!-- <link rel="stylesheet" href="css/jquery-ui.css">-->
<script src="js/jquery-1.10.2.js"></script>
<script src="js/jquery-ui-1.10.4.custom.js"></script>
<script src="js/myui.js"></script>
</head>

<body>
	<center>
		<h2>采集器列表</h2>
		<h3>
			<s:a action="dgu2000_addUI" namespace="/">添加采集器</s:a>
		</h3>
		<s:form action="dgu2000_getDgu2000ByMap" namespace="/" method="post">
			<fieldset>
			<div>
				<label>开始时间：</label>
				<s:textfield cssClass="datepicker" label="startTime" title="选择开始时间"
					name="searchItem.startTime"/>
				<label>结束时间：</label>
				<s:textfield cssClass="datepicker" label="endTime" title="选择结束时间"
					name="searchItem.endTime"/>
				<label>项目名称：</label>
				<s:textfield label="xiangmu" title="输入项目名称" name="searchItem.xiangmu"/>
				<label>风场名称：</label>
				<s:textfield label="fengchang" title="输入风场名称" name="searchItem.fengchang"/>
				<s:submit value="查询"></s:submit>
			</div>
			</fieldset>
		</s:form>
		<table width="90%" border="1">
			<tr>
				<th>采集器id</th>
				<th>采集器ip</th>
				<th>项目名称</th>
				<th>风场名称</th>
				<th>添加时间</th>
				<th>操作</th>
			</tr>
			<s:iterator value="dgu2000List">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="ip" /></td>
					<td><s:property value="project.projectName" /></td>
					<td><s:property value="project.windFarm.windFarmName" /></td>
					<td><s:property value="dateString" /></td>
					<td><s:a action="dgu2000_updateUI" namespace="/">
							<s:param name="dgu2000.id">${id}</s:param>修改</s:a> &nbsp;&nbsp;<s:a
							action="dgu2000_delete" namespace="/">
							<s:param name="dgu2000.id">${id}</s:param>删除</s:a> &nbsp;&nbsp;<s:a
							action="dgu2000_addUI" namespace="/">
							<s:param name="dgu2000.id">${id}</s:param>复制</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</center>
</body>
</html>

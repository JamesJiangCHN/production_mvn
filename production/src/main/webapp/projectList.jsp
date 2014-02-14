<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>項目列表</title>

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
		<h2>項目列表</h2>
		<h3>
			<s:a action="project_addUI" namespace="/">添加項目</s:a>
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
				<label>关联风场：</label>
				<s:textfield label="fengchang" title="输入风场名称" name="searchItem.fengchang"/>
				<s:submit value="查询"></s:submit>
			</div>
			</fieldset>
		</s:form>
		<table width="90%" border="1">
			<tr>
				<th>项目编号</th>
				<th>项目名称</th>
				<th>风场名称</th>
				<th>时间</th>
				<th>负责人</th>
				<th>操作</th>
			</tr>
			<s:iterator value="projectList">
				<tr>
					<td><s:property value="projectId" /></td>
					<td><s:property value="projectName" /></td>
					<td><s:property value="windFarm.windFarmName" /></td>
					<td><s:property value="dateString" /></td>
					<td><s:property value="personInCharge" /></td>
					<td><s:a action="project_updateUI" namespace="/">
						<s:param name="project.projectId">${projectId}</s:param>修改</s:a> &nbsp;&nbsp;
						<s:a action="project_delete" namespace="/">
						<s:param name="project.projectId">${projectId}</s:param>删除</s:a> &nbsp;&nbsp;
						<s:a action="project_addUI" namespace="/">
						<s:param name="project.projectId">${projectId}</s:param>复制</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</center>
</body>
</html>

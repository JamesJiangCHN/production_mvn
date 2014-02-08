<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改用户</title>

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

		<h1>修改采集器</h1>
		<div style="text-align: left; margin: 0 auto; width: 250px;">
			<s:form action="dgu2000_update" namespace="/" method="post">

				<s:hidden name="dgu2000.id"></s:hidden>
				<div>
					<label>采集器IP</label>
					<s:textfield label="ip" name="dgu2000.ip"></s:textfield>
				</div>
				<!--<s:textfield label="项目名称" name="dgu2000.xiangmuName"></s:textfield>-->
				<div>
					<label>项目名称</label>
					<s:select cssClass="combobox" list="projectList" name="project.projectId"
						value="%{dgu2000.project.projectName}" listKey="projectId"
						listValue="projectName">
					</s:select>
				</div>
				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</center>
</body>
</html>
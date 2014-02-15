<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改项目</title>

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

		<h1>修改项目</h1>
		<div style="text-align: left; margin: 0 auto; width: 250px;">
			<s:form action="project_update" namespace="/" method="post">

				<s:hidden name="project.projectId"></s:hidden>
				<div>
					<label>项目名称</label>
					<s:textfield label="projectName" name="project.projectName"></s:textfield>
				</div>
				<div>
				<label>发货时间</label>
				<s:textfield cssClass="datepicker" name="project.dateString"></s:textfield>
				</div>
				<div>
					<label>关联风场</label>
					<s:select cssClass="combobox" list="windFarmList" name="windFarm.windFarmId"
						value="%{project.windFarm.windFarmId}" listKey="windFarmId"
						listValue="windFarmName">
					</s:select>
				</div>
				<div>
					<label>负责人</label>
					<s:textfield label="personInCharge" name="project.personInCharge"></s:textfield>
				</div>
				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</center>
</body>
</html>
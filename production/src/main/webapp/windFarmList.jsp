<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>风场列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<link rel="stylesheet" href="css/jquery-ui-1.10.0.custom.css">
<link rel="stylesheet" href="css/mycss.css">
<!-- <link rel="stylesheet" href="css/jquery-ui.css">-->
<script src="js/jquery-1.10.2.js"></script>
<script src="js/jquery-ui-1.10.4.custom.js"></script>
<script src="js/myui.js"></script>
</head>

<body>
	<center>
	<div id="wid980" >
		<div id="nav">
	    <ul>
	      <li>
	        <center>
	          <a href="index.jsp" >首页</a>
	        </center>
	      </li>
	      <li>
	        <center>
	          <a href="project_getAllProject.action">项目列表</a>
	        </center>
	      </li>
	      <li>
	        <center>
	          <a href="dgu2000_getAllDgu2000.action">采集器列表</a>
	        </center>
	      </li>
	      <li>
	        <center>
	          <a href="windFarm_getAllWindFarm.action">风场列表</a>
	        </center>
	      </li>
	    </ul>
	  	</div>
	</div>
		<h3>
			<s:a action="windFarm_addUI" namespace="/">添加风场</s:a>
		</h3>
		<s:form action="windFarm_getListByMap" namespace="/" method="post">
			<fieldset>
			<div>
				<label>风场名称：</label>
				<s:textfield label="windFarmName" title="输入项目名称" name="searchItem.windFarmName"/>
				<s:submit value="查询"></s:submit>
			</div>
			</fieldset>
		</s:form>
		<table width="90%" border="1">
			<tr>
				<th>风场名称</th>
				<th>地址</th>
				<th>联系人</th>
				<th>联系电话</th>
				<th>操作</th>
			</tr>
			<s:iterator value="windFarmList">
				<tr>
					<td><s:property value="windFarmName" /></td>
					<td><s:property value="address" /></td>
					<td><s:property value="people" /></td>
					<td><s:property value="phone" /></td>
					<td>
						<s:a action="windFarm_updateUI" namespace="/">
						<s:param name="windFarm.windFarmId">${windFarmId}</s:param>修改</s:a> &nbsp;&nbsp;
						<s:a action="windFarm_delete" namespace="/">
						<s:param name="windFarm.windFarmId">${windFarmId}</s:param>删除</s:a> &nbsp;&nbsp;
						<s:a action="windFarm_addUI" namespace="/">
						<s:param name="windFarm.windFarmId">${windFarmId}</s:param>复制</s:a>
						</td>
				</tr>
			</s:iterator>
		</table>
	</center>
</body>
</html>

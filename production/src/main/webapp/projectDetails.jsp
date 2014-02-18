<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>项目详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" href="css/jquery-ui-1.10.0.custom.css">
<link rel="stylesheet" href="css/mycss.css">
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
		<div class ="main">
			<div class="nav">
				<label>项目编号:</label>
				<s:property value="project.projectId"/>
			</div>
			<div class="nav">
				<label>项目名称:</label>
				<s:property value="project.projectName"/>
			</div>
			<div class="nav">
				<label>发货时间:</label>
				<s:property value="project.dateString"/>
			</div>
			<div class="nav">
				<label>负 责 人:</label>
				<s:property value="project.personInCharge"/>
			</div>
		</div>
		<div class ="main">
			<div class="title">
				<label>关联风场:</label>
			</div>
			<s:iterator value="project.windFarmList" >
				<div class="content">
					<s:property value="windFarmName"/>
				</div>
			</s:iterator>
			
		</div>
		
		<div class ="main">
			<div class="title"><label>关联采集器:</label></div>
			<s:iterator value="project.dgu2000List" >
					<div class="content">
						<s:property value="id"/>
					</div>
				</s:iterator>
		</div>
	</center>
</body>
</html>

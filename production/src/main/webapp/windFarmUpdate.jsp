<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改风场</title>

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
		<div id="content">
			<s:form action="windFarm_update" namespace="/" method="post">
				<div>
					<s:hidden name="windFarm.windFarmId"></s:hidden>
				</div>
				<div>
					<label>风场名称</label>
					<s:textfield label="windFarmName" name="windFarm.windFarmName"></s:textfield>
				</div>
				<div>
					<label>风场地址</label>
					<s:textfield name="windFarm.address"></s:textfield>
				</div>
				<div>
					<label>联 系 人</label>
					<s:textfield name="windFarm.people"></s:textfield>
				</div>
				<div>
					<label>联系电话</label>
					<s:textfield name="windFarm.phone"></s:textfield>
				</div>
				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</center>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>中自庆安项目管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" href="css/jquery-ui-1.10.0.custom.css">
<script src="js/jquery-1.10.2.js"></script>
<script src="js/jquery-ui-1.10.4.custom.js"></script>
<script src="js/jquery-migrate-1.0.0.js"></script>
<script src="js/iealert.js" type="text/javascript"></script>
<script src="js/index.js"></script>
<script src="js/myui.js"></script>
<link rel="stylesheet" href="css/mycss.css">
<link rel="stylesheet" href="css/iealert.css">
</head>

<body>
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
	      <li>
	        <center>
	          <a href="uploadUI_uploadUI.action">上传文件</a>
	        </center>
	      </li>
	    </ul>
	  	</div>
	</div>
	<div id="swf">
		<object id="FlashID"
			classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" height="560"
			width="1280">
			<param name="movie" value="swf/index.swf">
			<param name="quality" value="high">
			<param name="wmode" value="opaque">
			<param name="swfversion" value="6.0.65.0">
			<!-- This param tag prompts users with Flash Player 6.0 r65 
				and higher to download the latest version of Flash Player. 
				Delete it if you don’t want users to see the prompt. -->
			<param name="expressinstall" value="Scripts/expressInstall.swf">
			<!-- Next object tag is for non-IE browsers. So hide it from IE using IECC. -->
			<!--[if !IE]>-->
			<object type="application/x-shockwave-flash" data="swf/index.swf"
				height="560" width="1280">
				<!--<![endif]-->
				<param name="quality" value="high">
				<param name="wmode" value="opaque">
				<param name="swfversion" value="6.0.65.0">
				<param name="expressinstall" value="Scripts/expressInstall.swf">
				<!-- The browser displays the following alternative content for users with Flash Player 6.0 and older. -->
				<div>
					<h4>Content on this page requires a newer version of Adobe Flash Player.</h4>
					<p>
						<a href="http://www.adobe.com/go/getflashplayer"> <img
							src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif"
							alt="Get Adobe Flash player" height="33" width="112"></a>
					</p>
				</div>
				<!--[if !IE]>-->
			</object>
			<!--<![endif]-->
		</object>
	</div>
	<div id="maincontent">
			到  <span id="clock"></span> 止<br/>
			累计完成项目 <span id="pNum">0</span> 个        覆盖风场  <span id="wNum">0</span>  个<br/>
			累计生产 <span id="dSumNum">0</span> 台        装机  <span id="dNum">0</span>  台<br/>
			<br/>
	</div>
</body>
</html>

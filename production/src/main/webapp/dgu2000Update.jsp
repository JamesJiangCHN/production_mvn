<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>修改用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">   

  </head>
  
  <body>
    <center>
    	<h1>修改采集器</h1>
    	<s:form action="dgu2000_update" namespace="/" method="post">
    		<s:hidden name="dgu2000.id"></s:hidden>
    		<s:textfield label="ip" name="dgu2000.ip"></s:textfield>
    		<s:textfield label="项目名称" name="dgu2000.xiangmuName"></s:textfield>
    		<s:textfield label="风场名称" name="dgu2000.fengchang"></s:textfield>
    		<s:textfield label="地址" name="dgu2000.address"></s:textfield>
    		<s:submit value="提交"></s:submit>
    	</s:form>
    </center>
  </body>
</html>
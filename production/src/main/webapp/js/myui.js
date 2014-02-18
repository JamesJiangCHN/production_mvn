$(function() {
	$("input[type=submit], button").button();
	$("input[type=button], button").button();
	$(".datepicker").datepicker();
	$(".datepicker").datepicker("option", "dateFormat", "yy-mm-dd");
	//$(".combobox").combobox();
	$(document).tooltip();
	$("#addProject").click(function(){
		$.get("projectJSON_ifHasProject.action?project.projectId="+$("input[name='project.projectId']").val(), function(date){
			if(date != "0"){
				alert("该项目编号已存在！");
				return false;
			}
			$("#addForm").submit();
		});
	});
});
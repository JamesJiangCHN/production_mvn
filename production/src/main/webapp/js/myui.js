$(function() {
	$("input[type=submit], button").button();
	$(".datepicker").datepicker();
	$(".datepicker").datepicker("option", "dateFormat", "yy-mm-dd");
	//$(".combobox").combobox();
	$(document).tooltip();
});
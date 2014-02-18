$(function() {
	setInterval(get_time,1000);
	$.get("globalJSON_getCount.action", function(data){
		$("#pNum").html(data.projectNum);
		$("#wNum").html(data.windFarmNum);
		$("#dSumNum").html(data.dgu2000SumNum);
		$("#dNum").html(data.dgu2000Num);
	});
	
});

function get_time(){
	 var myDate=new Date();
	 var yy = myDate.getFullYear();
	 var mm = myDate.getMonth()+1;
	 var dd = myDate.getDate();
	 var h=myDate.getHours();
	 var m=myDate.getMinutes();
	 var s=myDate.getSeconds();
	 $("#clock").html(toDouble(yy)+"-"+toDouble(mm)+"-"+toDouble(dd)
			 +" "+toDouble(h)+":"+toDouble(m)+":"+toDouble(s));
}

function toDouble(num){
    if(typeof num !== "number"){return;}
    if(num < 10){
        return "0" + num;
    }else{
        return num;
    }
}
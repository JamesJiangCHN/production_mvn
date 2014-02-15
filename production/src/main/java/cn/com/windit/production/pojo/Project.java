package cn.com.windit.production.pojo;

public class Project {
	private String projectId;
	private String projectName;
	private String dateString;
	private long dateTime;
	private String personInCharge;
	
	private WindFarm windFarm;
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDateString() {
		return dateString;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	public long getDateTime() {
		return dateTime;
	}
	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}
	public String getPersonInCharge() {
		return personInCharge;
	}
	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}
	public WindFarm getWindFarm() {
		return windFarm;
	}
	public void setWindFarm(WindFarm windFarm) {
		this.windFarm = windFarm;
	}
	
	@Override
	public String toString(){
		return this.projectName;
	}
	
}

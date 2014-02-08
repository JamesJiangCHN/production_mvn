package cn.com.windit.production.pojo;

public class Project {
	private int projectId;
	private String projectName;
	
	private WindFarm windFarm;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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

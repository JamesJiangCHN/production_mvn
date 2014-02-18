package cn.com.windit.production.pojo;

import java.io.Serializable;

public class SearchItem implements Serializable  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2246018298005048639L;
	private String  startTime;
	private String	endTime;
	private String	dgu2000Id;
	private String  projectId;
	private String	projectName;
	private String	windFarmName;
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDgu2000Id() {
		return dgu2000Id;
	}
	public void setDgu2000Id(String dgu2000Id) {
		this.dgu2000Id = dgu2000Id;
	}
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
	public String getWindFarmName() {
		return windFarmName;
	}
	public void setWindFarmName(String windFarmName) {
		this.windFarmName = windFarmName;
	}
	
	
}

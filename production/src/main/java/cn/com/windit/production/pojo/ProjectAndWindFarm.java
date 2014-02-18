package cn.com.windit.production.pojo;

import java.io.Serializable;

public class ProjectAndWindFarm implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3830238871243001158L;
	private String projectId;
	private int windFarmId;
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public int getWindFarmId() {
		return windFarmId;
	}
	public void setWindFarmId(int windFarmId) {
		this.windFarmId = windFarmId;
	}
}

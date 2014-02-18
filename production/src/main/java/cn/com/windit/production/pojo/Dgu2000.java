package cn.com.windit.production.pojo;

import java.io.Serializable;

public class Dgu2000 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8166301377458577477L;
	private String id;
	private String	ip;
	private String	dateString;
	private Long	addTime;
	
	private Project project;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDateString() {
		return dateString;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	public Long getAddTime() {
		return addTime;
	}
	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
}

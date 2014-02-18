package cn.com.windit.production.pojo;

import java.io.Serializable;
import java.util.List;

public class Project implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6338437310352060734L;
	private String projectId;
	private String projectName;
	private String dateString;
	private long dateTime;
	private String personInCharge;
	
	private List<WindFarm> windFarmList;
	
	private List<Dgu2000> dgu2000List;
	
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
	public List<WindFarm> getWindFarmList() {
		return windFarmList;
	}
	public void setWindFarmList(List<WindFarm> windFarmList) {
		this.windFarmList = windFarmList;
	}
	public List<Dgu2000> getDgu2000List() {
		return dgu2000List;
	}
	public void setDgu2000List(List<Dgu2000> dgu2000List) {
		this.dgu2000List = dgu2000List;
	}
	@Override
	public String toString(){
		return this.projectName;
	}
	
}

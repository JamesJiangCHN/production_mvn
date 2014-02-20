package cn.com.windit.production.pojo;

import java.io.Serializable;

public class WindFarm implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7952531797480016449L;
	
	private int windFarmId;
	private String windFarmName;
	private String address;
	private String people;
	private String phone;
	
	public int getWindFarmId() {
		return windFarmId;
	}
	public void setWindFarmId(int windFarmId) {
		this.windFarmId = windFarmId;
	}
	public String getWindFarmName() {
		return windFarmName;
	}
	public void setWindFarmName(String windFarmName) {
		this.windFarmName = windFarmName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

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
	
	
}

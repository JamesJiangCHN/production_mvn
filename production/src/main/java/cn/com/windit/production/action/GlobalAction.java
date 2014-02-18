package cn.com.windit.production.action;

import cn.com.windit.production.service.IDgu2000Service;
import cn.com.windit.production.service.IProjectService;
import cn.com.windit.production.service.IWindFarmService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class GlobalAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 815866875585394002L;
	
	private Integer projectNum = 0;
	private Integer windFarmNum = 0;
	private Integer dgu2000Num = 0;
	private Integer dgu2000SumNum = 0;
	
	private IDgu2000Service dgu2000Service;
	private IProjectService projectService;
	private IWindFarmService windFarmService;
	
	public String getCount(){
		projectNum = projectService.getSumCount();
		windFarmNum = windFarmService.getSumCount();
		dgu2000Num = dgu2000Service.getUsedCount();
		dgu2000SumNum = dgu2000Service.getSumCount();
		return Action.SUCCESS;
	}
	
	
	
	
	public Integer getProjectNum() {
		return projectNum;
	}
	public void setProjectNum(Integer projectNum) {
		this.projectNum = projectNum;
	}
	public Integer getWindFarmNum() {
		return windFarmNum;
	}
	public void setWindFarmNum(Integer windFarmNum) {
		this.windFarmNum = windFarmNum;
	}
	public Integer getDgu2000Num() {
		return dgu2000Num;
	}
	public void setDgu2000Num(Integer dgu2000Num) {
		this.dgu2000Num = dgu2000Num;
	}
	public Integer getDgu2000SumNum() {
		return dgu2000SumNum;
	}
	public void setDgu2000SumNum(Integer dgu2000SumNum) {
		this.dgu2000SumNum = dgu2000SumNum;
	}
	public IDgu2000Service getDgu2000Service() {
		return dgu2000Service;
	}
	public void setDgu2000Service(IDgu2000Service dgu2000Service) {
		this.dgu2000Service = dgu2000Service;
	}
	public IProjectService getProjectService() {
		return projectService;
	}
	public void setProjectService(IProjectService projectService) {
		this.projectService = projectService;
	}
	public IWindFarmService getWindFarmService() {
		return windFarmService;
	}
	public void setWindFarmService(IWindFarmService windFarmService) {
		this.windFarmService = windFarmService;
	}
}

package cn.com.windit.production.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.SearchItem;
import cn.com.windit.production.pojo.WindFarm;
import cn.com.windit.production.service.IWindFarmService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class WindFarmAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1104239446726286154L;
	
	private WindFarm windFarm = new WindFarm();
	private SearchItem searchItem = new SearchItem();
	private List<WindFarm> windFarmList = new ArrayList<WindFarm>();
	private IWindFarmService windFarmService;
	
	
	public String getAllWindFarm(){
		windFarmList = windFarmService.getAllWindFarm();
		return "list";
	}
	
	public String getListByMap(){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("windFarmName", searchItem.getWindFarmName());
		windFarmList = windFarmService.getListByMap(map);
		return "list";
	}
	
	public String getUI(){
		windFarm = windFarmService.getWindFarmById(windFarm.getWindFarmId());
		return "getUI";
	}
	
	public String addUI(){
		if(windFarm.getWindFarmId() != 0){
			windFarm = windFarmService.getWindFarmById(windFarm.getWindFarmId());
		}
		return "addUI";
	}
	
	public String add(){
		windFarmService.insertWindFarm(windFarm);
		return SUCCESS;
	}
	
	public String updateUI(){
		windFarm = windFarmService.getWindFarmById(windFarm.getWindFarmId());
		return "updateUI";
	}
	
	public String update(){
		windFarmService.updateWindFarm(windFarm);
		return Action.SUCCESS;
	}
	
	public String delete(){
		windFarmService.deleteWindFarmById(windFarm.getWindFarmId());
		return Action.SUCCESS;
	}
	
	public WindFarm getWindFarm() {
		return windFarm;
	}
	
	public void setWindFarm(WindFarm windFarm) {
		this.windFarm = windFarm;
	}
	
	public SearchItem getSearchItem() {
		return searchItem;
	}

	public void setSearchItem(SearchItem searchItem) {
		this.searchItem = searchItem;
	}

	public List<WindFarm> getWindFarmList() {
		return windFarmList;
	}
	
	public void setWindFarmList(List<WindFarm> windFarmList) {
		this.windFarmList = windFarmList;
	}
	
	public IWindFarmService getWindFarmService() {
		return windFarmService;
	}
	
	public void setWindFarmService(IWindFarmService windFarmService) {
		this.windFarmService = windFarmService;
	}

}

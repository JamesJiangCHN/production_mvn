package cn.com.windit.production.service;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.dao.IWindFarmDAO;
import cn.com.windit.production.pojo.WindFarm;

public class WindFarmService implements IWindFarmService {

	private IWindFarmDAO windFarmDAO; 
	
	@Override
	public Integer getSumCount() {
		return windFarmDAO.getSumCount();
	}
	
	@Override
	public List<WindFarm> getAllWindFarm() {
		return windFarmDAO.getAllWindFarm();
	}
	
	@Override
	public List<WindFarm> getListByMap(Map<String, Object> map) {
		return windFarmDAO.getListByMap(map);
	}

	public IWindFarmDAO getWindFarmDAO() {
		return windFarmDAO;
	}

	public void setWindFarmDAO(IWindFarmDAO windFarmDAO) {
		this.windFarmDAO = windFarmDAO;
	}

	

	
	
	
}

package cn.com.windit.production.service;

import java.util.List;

import cn.com.windit.production.dao.IWindFarmDAO;
import cn.com.windit.production.pojo.WindFarm;

public class WindFarmService implements IWindFarmService {

	private IWindFarmDAO windFarmDAO; 
	
	@Override
	public List<WindFarm> getAllWindFarm() {
		return windFarmDAO.getAllWindFarm();
	}

	public IWindFarmDAO getWindFarmDAO() {
		return windFarmDAO;
	}

	public void setWindFarmDAO(IWindFarmDAO windFarmDAO) {
		this.windFarmDAO = windFarmDAO;
	}
	
	
}

package cn.com.windit.production.service;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.dao.Dgu2000.IDgu2000DAO;
import cn.com.windit.production.pojo.Dgu2000;

public class Dgu2000Service implements IDgu2000Service {

	private IDgu2000DAO dgu2000DAO;

	@Override
	public Dgu2000 getDgu2000ById(String id) {
		return dgu2000DAO.getDgu2000ById(id);
	}
	
	@Override
	public Integer insertDgu2000(Dgu2000 dgu2000) {
		return dgu2000DAO.insertDgu2000(dgu2000);
	}
	
	@Override
	public Integer updateDgu2000(Dgu2000 dgu2000) {
		return dgu2000DAO.updateDgu2000(dgu2000);
		
	}
	
	@Override
	public Integer deleteDgu2000ById(String id) {
		return dgu2000DAO.deleteDgu2000ById(id);
	}
	
	@Override
	public List<Dgu2000> getAllDgu2000() {
		return dgu2000DAO.getAllDgu2000();
	}
	
	@Override
	public List<Dgu2000> getDgu2000ByMap(Map<String, Object> map) {
		return dgu2000DAO.getDgu2000ByMap(map);
	}


	@Override
	public List<Dgu2000> getDgu2000sByXiangmuName(String xiangmu) {
		// TODO Auto-generated method stub
		return null;
	}

	public IDgu2000DAO getDgu2000DAO() {
		return dgu2000DAO;
	}

	public void setDgu2000DAO(IDgu2000DAO dgu2000dao) {
		dgu2000DAO = dgu2000dao;
	}

	@Override
	public Integer getSumCount() {
		return dgu2000DAO.getSumCount();
	}

	@Override
	public Integer getUsedCount() {
		return dgu2000DAO.getUsedCount();
	}

	@Override
	public Integer getCountByProjectId(String projectId) {
		return dgu2000DAO.getCountByProjectId(projectId);
	}

	
	

	

	
	

}

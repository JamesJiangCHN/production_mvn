package cn.com.windit.production.dao;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.WindFarm;

public interface IWindFarmDAO {
	
	WindFarm getWindFarmById(int windFarmId);
	
	List<WindFarm> getAllWindFarm();
	
	List<WindFarm> getListByMap(Map<String, Object> map);
	
	List<WindFarm> getListByProjectId(String projectId);

}

package cn.com.windit.production.service;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.Dgu2000;

public interface IDgu2000Service {
	
	Integer getSumCount();
	
	Integer getUsedCount();
	
	Integer getCountByProjectId(String projectId);
	
	Dgu2000 getDgu2000ById(String id);
	
	Integer insertDgu2000(Dgu2000 dgu2000);
	
	Integer updateDgu2000(Dgu2000 dgu2000);
	
	Integer deleteDgu2000ById(String id);
	
	List<Dgu2000> getAllDgu2000();
	
	List<Dgu2000> getDgu2000ByMap(Map<String, Object> map);
	
	List<Dgu2000> getDgu2000sByXiangmuName(String xiangmu);
}

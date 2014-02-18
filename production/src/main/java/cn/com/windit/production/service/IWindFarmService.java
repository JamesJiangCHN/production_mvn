package cn.com.windit.production.service;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.WindFarm;

public interface IWindFarmService {
	
	Integer getSumCount();
	
	List<WindFarm> getAllWindFarm();
	
	List<WindFarm> getListByMap(Map<String, Object> map);
}

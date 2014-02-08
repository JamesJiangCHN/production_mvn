package cn.com.windit.production.dao;

import java.util.List;

import cn.com.windit.production.pojo.WindFarm;

public interface IWindFarmDAO {
	
	WindFarm getWindFarmById(int windFarmId);
	
	List<WindFarm> getAllWindFarm();

}

package cn.com.windit.production.dao.Dgu2000;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.Dgu2000;

public interface IDgu2000DAO {
	
	Dgu2000 getDgu2000ById(int id);
	
	Integer insertDgu2000(Dgu2000 dgu2000);
	
	Integer updateDgu2000(Dgu2000 dgu2000);
	
	Integer deleteDgu2000ById(int id);
	
	List<Dgu2000> getAllDgu2000();
	
	List<Dgu2000> getDgu2000ByMap(Map<String, Object> map);
	
	List<Dgu2000> getDgu2000ByFengchang(String fengchang);
	
	List<Dgu2000> getDgu2000ByXiangmuName(String xiangmuName);
}

package cn.com.windit.production.dao;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.windit.production.pojo.WindFarm;

public class WindFarmDAO implements IWindFarmDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public WindFarm getWindFarmById(int windFarmId) {
		return sqlSessionTemplate.selectOne("getWindFarmById", windFarmId);
	}
	
	@Override
	public Integer insertWindFarm(WindFarm windFarm) {
		return sqlSessionTemplate.insert("insertWindFarm", windFarm);
	}
	@Override
	public Integer updateWindFarm(WindFarm windFarm) {
		return sqlSessionTemplate.update("updateWindFarm", windFarm);
	}
	
	@Override
	public Integer deleteWindFarmById(int windFarmId) {
		return sqlSessionTemplate.delete("deleteWindFarmById", windFarmId);
	}
	
	@Override
	public List<WindFarm> getAllWindFarm(){
		return sqlSessionTemplate.selectList("getAllWindFarmById");
	}
	@Override
	public List<WindFarm> getListByProjectId(String projectId) {
		return sqlSessionTemplate.selectList("getListByProjectId", projectId);
	}
	@Override
	public List<WindFarm> getListByMap(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("getListByMap", map);
	}
	@Override
	public Integer getSumCount() {
		return sqlSessionTemplate.selectOne("getSumCount");
	}

	


}

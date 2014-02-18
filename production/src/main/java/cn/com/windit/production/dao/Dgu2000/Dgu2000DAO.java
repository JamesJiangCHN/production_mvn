package cn.com.windit.production.dao.Dgu2000;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.windit.production.pojo.Dgu2000;

public class Dgu2000DAO implements IDgu2000DAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public Dgu2000 getDgu2000ById(String id) {
		return sqlSessionTemplate.selectOne("getDgu2000ById", id);
	}

	@Override
	public Integer insertDgu2000(Dgu2000 dgu2000) {
		return sqlSessionTemplate.insert("insertDgu2000", dgu2000);
	}

	@Override
	public List<Dgu2000> getAllDgu2000() {
		return sqlSessionTemplate.selectList("getAllDgu2000");
	}

	@Override
	public Integer updateDgu2000(Dgu2000 dgu2000) {
		return sqlSessionTemplate.update("updateDgu2000", dgu2000);
	}

	@Override
	public Integer deleteDgu2000ById(String id) {
		return sqlSessionTemplate.delete("deleteDgu2000ById", id);
	}

	@Override
	public List<Dgu2000> getDgu2000ByMap(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("getDgu2000ByMap", map);
	}

}

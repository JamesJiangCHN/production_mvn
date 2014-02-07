package cn.com.windit.production.dao;

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

}

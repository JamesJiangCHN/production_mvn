package cn.com.windit.production.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.windit.production.pojo.Project;

public class ProjectDAO implements IProjectDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public Project getProjectById(int projectId) {
		return sqlSessionTemplate.selectOne("getProjectById", projectId);
	}

}

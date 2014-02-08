package cn.com.windit.production.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.windit.production.pojo.Project;

public class ProjectDAO implements IProjectDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public Project getProjectById(String projectId) {
		return sqlSessionTemplate.selectOne("getProjectById", projectId);
	}
	
	@Override
	public Integer insertProject(Project project){
		return sqlSessionTemplate.insert("insertProject", project);
	}
	@Override
	public Integer updateProject(Project project) {
		return sqlSessionTemplate.update("updateProject", project);
	}

	@Override
	public List<Project> getAllProject() {
		return sqlSessionTemplate.selectList("getAllProject");
	}

	

}

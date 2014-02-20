package cn.com.windit.production.dao;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.Project;
import cn.com.windit.production.pojo.ProjectAndWindFarm;

public interface IProjectDAO {
	
	Integer getSumCount();
	
	Project getProjectById(String projectId);
	
	Integer insertProject(Project project);
	
	Integer insertRelation(ProjectAndWindFarm projectAndWindFarm);
	
	Integer updateProject(Project project);
	
	List<Project> getAllProject();
	
	List<Project> getListByMap(Map<String, Object> map);
	
	Integer deleteProjectById(String projectId);
	
	Integer deleteRelation(String projectId);
}

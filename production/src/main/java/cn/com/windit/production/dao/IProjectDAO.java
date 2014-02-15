package cn.com.windit.production.dao;

import java.util.List;

import cn.com.windit.production.pojo.Project;

public interface IProjectDAO {
	
	Project getProjectById(String projectId);
	
	Integer insertProject(Project project);
	
	Integer updateProject(Project project);
	
	List<Project> getAllProject();

}

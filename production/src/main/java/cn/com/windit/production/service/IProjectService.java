package cn.com.windit.production.service;

import java.util.List;

import cn.com.windit.production.pojo.Project;

public interface IProjectService {
	
	Project getProjectById(String string);
	
	Integer insertProject(Project project);
	
	Integer updateProject(Project project);
	
	List<Project> getAllProject();
}

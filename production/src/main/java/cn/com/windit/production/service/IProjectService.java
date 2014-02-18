package cn.com.windit.production.service;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.Project;

public interface IProjectService {
	
	Project getProjectById(String projectId);
	
	Integer insertProject(Project project);
	
	Integer updateProject(Project project);
	
	List<Project> getAllProject();
	
	List<Project> getListByMap(Map<String, Object> map);
	
	Integer deleteProjectById(String ProjectId);
}

package cn.com.windit.production.service;

import java.util.List;

import cn.com.windit.production.pojo.Project;

public interface IProjectService {
	
	Project getProjectById(int id);
	
	List<Project> getAllProject();
}

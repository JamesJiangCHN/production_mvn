package cn.com.windit.production.dao;

import java.util.List;

import cn.com.windit.production.pojo.Project;

public interface IProjectDAO {
	
	Project getProjectById(int projectId);
	
	List<Project> getAllProject();

}

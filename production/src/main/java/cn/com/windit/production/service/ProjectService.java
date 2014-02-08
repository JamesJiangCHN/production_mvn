package cn.com.windit.production.service;

import java.util.List;

import cn.com.windit.production.dao.IProjectDAO;
import cn.com.windit.production.pojo.Project;

public class ProjectService implements IProjectService {

	private IProjectDAO projectDAO;
	
	@Override
	public Project getProjectById(int id) {
		return projectDAO.getProjectById(id);
	}
	
	@Override
	public List<Project> getAllProject() {
		return projectDAO.getAllProject();
	}
	
	
	public IProjectDAO getProjectDAO() {
		return projectDAO;
	}
	public void setProjectDAO(IProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}


	
	
}

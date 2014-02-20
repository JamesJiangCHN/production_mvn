package cn.com.windit.production.service;

import java.util.List;
import java.util.Map;

import cn.com.windit.production.dao.IProjectDAO;
import cn.com.windit.production.pojo.Project;
import cn.com.windit.production.pojo.ProjectAndWindFarm;
import cn.com.windit.production.pojo.WindFarm;

public class ProjectService implements IProjectService {

	private IProjectDAO projectDAO;
	
	@Override
	public Integer getSumCount() {
		return projectDAO.getSumCount();
	}
	
	@Override
	public Project getProjectById(String ProjectId) {
		return projectDAO.getProjectById(ProjectId);
	}
	
	@Override
	public Integer insertProject(Project project){
		Integer reNum = 0;
		reNum = projectDAO.insertProject(project);
		if( reNum > 0){
			ProjectAndWindFarm projectAndWindFarm = new ProjectAndWindFarm();
			
			for (WindFarm windFarm : project.getWindFarmList()) {
				projectAndWindFarm.setProjectId(project.getProjectId());
				projectAndWindFarm.setWindFarmId(windFarm.getWindFarmId());
			}
			
			projectDAO.insertRelation(projectAndWindFarm);
		}
		
		return reNum;
	}
	
	@Override
	public Integer updateProject(Project project) {
		Integer reNum = 0; 
		reNum = projectDAO.updateProject(project);
		
		if( reNum > 0){
			ProjectAndWindFarm projectAndWindFarm = new ProjectAndWindFarm();
			
			for (WindFarm windFarm : project.getWindFarmList()) {
				projectAndWindFarm.setProjectId(project.getProjectId());
				projectAndWindFarm.setWindFarmId(windFarm.getWindFarmId());
			}
			
			projectDAO.insertRelation(projectAndWindFarm);
		}
		
		return reNum;
	}
	
	@Override
	public List<Project> getAllProject() {
		return projectDAO.getAllProject();
	}
	
	@Override
	public List<Project> getListByMap(Map<String, Object> map) {
		return projectDAO.getListByMap(map);
	}
	
	@Override
	public Integer deleteProjectById(String projectId) {
		int num = projectDAO.deleteProjectById(projectId);
		if(num > 0){
			projectDAO.deleteRelation(projectId);
		}
		return num;
	}
	
	public IProjectDAO getProjectDAO() {
		return projectDAO;
	}
	public void setProjectDAO(IProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	
}

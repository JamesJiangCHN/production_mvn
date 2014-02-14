package cn.com.windit.production.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import cn.com.windit.production.pojo.Project;
import cn.com.windit.production.pojo.WindFarm;
import cn.com.windit.production.service.IProjectService;
import cn.com.windit.production.service.IWindFarmService;

import com.opensymphony.xwork2.ActionSupport;

public class ProjectAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3029352958769591898L;
	
	private Project project = new Project();
	private WindFarm windFarm = new WindFarm();
	private List<Project> projectList;
	private List<WindFarm> windFarmList;
	
	private IProjectService projectService;
	private IWindFarmService windFarmService;
	
	public String getAllProject(){
		projectList = projectService.getAllProject();
		return "projectList";
	}
	
	public String addUI(){
		/*if (project.getProjectId() != null)
			project = projectService.getProjectById(project.getProjectId());
		project.setProjectId(0);*/
		windFarmList = windFarmService.getAllWindFarm();
		return "addUI";
	}
	
	public String add(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //mm为分钟
		try {
			if(!project.getDateString().isEmpty()){
				project.setDateTime(sdf.parse(project.getDateString()).getTime());
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		project.setWindFarm(windFarm);
		projectService.insertProject(project);
		return "success";
	}
	
	public String updateUI(){
		project = projectService.getProjectById(project.getProjectId());
		windFarmList = windFarmService.getAllWindFarm();
		return "updateUI";
	}
	
	public String update(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //mm为分钟
		try {
			if(!project.getDateString().isEmpty()){
				project.setDateTime(sdf.parse(project.getDateString()).getTime());
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		project.setWindFarm(windFarm);
		projectService.updateProject(project);
		return "success";
	}
	

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
	
	public WindFarm getWindFarm() {
		return windFarm;
	}

	public void setWindFarm(WindFarm windFarm) {
		this.windFarm = windFarm;
	}

	public List<WindFarm> getWindFarmList() {
		return windFarmList;
	}

	public void setWindFarmList(List<WindFarm> windFarmList) {
		this.windFarmList = windFarmList;
	}

	public IProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(IProjectService projectService) {
		this.projectService = projectService;
	}

	public IWindFarmService getWindFarmService() {
		return windFarmService;
	}

	public void setWindFarmService(IWindFarmService windFarmService) {
		this.windFarmService = windFarmService;
	}

}

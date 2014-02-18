package cn.com.windit.production.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.Project;
import cn.com.windit.production.pojo.SearchItem;
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
	private SearchItem searchItem = new SearchItem();
	private String reDate = "";
	private List<Project> projectList;
	private List<WindFarm> windFarmList = new ArrayList<WindFarm>();
	
	private IProjectService projectService;
	private IWindFarmService windFarmService;
	
	public String getAllProject(){
		projectList = projectService.getAllProject();
		return "projectList";
	}
	
	public String ifHasProject(){
		project = projectService.getProjectById(project.getProjectId());
		if(project == null){
			reDate = "0";
		}else{
			reDate = "1";
		}
		return SUCCESS;
	}
	
	public String getUI(){
		project = projectService.getProjectById(project.getProjectId());
		return "getUI";
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
		windFarmList.add(windFarm);
		project.setWindFarmList(windFarmList);
		projectService.insertProject(project);
		return SUCCESS;
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
		project.setWindFarmList(windFarmList);
		projectService.updateProject(project);
		return "success";
	}
	
	public String getListByMap() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //mm为分钟
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (!searchItem.getStartTime().isEmpty()
					&& !searchItem.getEndTime().isEmpty()) {
				map.put("startTime", sdf.parse(searchItem.getStartTime())
					.getTime());
				map.put("endTime", sdf.parse(searchItem.getEndTime()).getTime());
			}
			map.put("projectId", searchItem.getProjectId().trim());
			map.put("projectName", searchItem.getProjectName().trim());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		projectList = projectService.getListByMap(map);
		return "projectList";
	}
	
	public String delete(){
		projectService.deleteProjectById(project.getProjectId());
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
	
	public SearchItem getSearchItem() {
		return searchItem;
	}

	public void setSearchItem(SearchItem searchItem) {
		this.searchItem = searchItem;
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

	public String getReDate() {
		return reDate;
	}

	public void setReDate(String reDate) {
		this.reDate = reDate;
	}
}

package cn.com.windit.production.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.windit.production.pojo.Dgu2000;
import cn.com.windit.production.pojo.Project;
import cn.com.windit.production.pojo.SearchItem;
import cn.com.windit.production.service.IDgu2000Service;
import cn.com.windit.production.service.IProjectService;

import com.opensymphony.xwork2.ActionSupport;

public class Dgu2000Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7919451973963429612L;

	private Dgu2000 dgu2000 = new Dgu2000();
	private Project	project = new Project();
	private SearchItem searchItem = new SearchItem();
	private List<Dgu2000> dgu2000List;
	private List<Project> projectList;
	
	private IDgu2000Service dgu2000Service;
	private IProjectService projectService;

	public String getAllDgu2000() {
		dgu2000List = dgu2000Service.getAllDgu2000();
		return "dgu2000List";
	}

	public String addUI() {
		if (dgu2000.getId() != null)
			dgu2000 = dgu2000Service.getDgu2000ById(dgu2000.getId());
		dgu2000.setId(0);
		projectList = projectService.getAllProject();
		return "add";
	}

	public String add() {
		Date date = new Date();
		dgu2000.setDateString((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))
				.format(date));
		dgu2000.setAddTime(date.getTime());
		//project = projectService.getProjectById(project.getProjectId());
		dgu2000.setProject(project);
		dgu2000Service.insertDgu2000(dgu2000);
		return "success";
	}

	public String updateUI() {
		dgu2000 = dgu2000Service.getDgu2000ById(dgu2000.getId());
		projectList = projectService.getAllProject();
		return "update";
	}

	public String update() {
		dgu2000.setProject(project);
		//project = projectService.getProjectById(project.getProjectId());
		dgu2000Service.updateDgu2000(dgu2000);
		return "success";
	}

	public String delete() {
		dgu2000Service.deleteDgu2000ById(dgu2000.getId());
		return "success";
	}

	public String getDgu2000ByMap() {
		/*if (searchItem.getStartTime().isEmpty()
				|| searchItem.getEndTime().isEmpty()) {
			dgu2000List = dgu2000Service.getAllDgu2000();
		} else {*/
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //mm为分钟
			Map<String, Object> map = new HashMap<String, Object>();
			try {
				if (!searchItem.getStartTime().isEmpty()
						&& !searchItem.getEndTime().isEmpty()) {
					map.put("startTime", sdf.parse(searchItem.getStartTime())
						.getTime());
					map.put("endTime", sdf.parse(searchItem.getEndTime()).getTime());
				}
				map.put("fengchang", searchItem.getFengchang().trim());
				map.put("xiangmuName", searchItem.getXiangmu().trim());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			dgu2000List = dgu2000Service.getDgu2000ByMap(map);
		return "dgu2000List";
	}

	public Dgu2000 getDgu2000() {
		return dgu2000;
	}

	public void setDgu2000(Dgu2000 dgu2000) {
		this.dgu2000 = dgu2000;
	}

	public List<Dgu2000> getDgu2000List() {
		return dgu2000List;
	}

	public void setDgu2000List(List<Dgu2000> dgu2000List) {
		this.dgu2000List = dgu2000List;
	}
	
	public SearchItem getSearchItem() {
		return searchItem;
	}

	public void setSearchItem(SearchItem searchItem) {
		this.searchItem = searchItem;
	}

	public IDgu2000Service getDgu2000Service() {
		return dgu2000Service;
	}

	public void setDgu2000Service(IDgu2000Service dgu2000Service) {
		this.dgu2000Service = dgu2000Service;
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

	public IProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(IProjectService projectService) {
		this.projectService = projectService;
	}
}

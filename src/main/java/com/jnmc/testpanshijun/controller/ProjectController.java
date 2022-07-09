package com.jnmc.testpanshijun.controller;

import com.jnmc.testpanshijun.entity.Project;
import com.jnmc.testpanshijun.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/proj")
public class ProjectController {
    @Resource
    private ProjectService projectService;

    @GetMapping("/showAllProj")
    public String showAllProj(){
        Model model=new ConcurrentModel();
        List<Project> projects=projectService.selectAllProject();
        model.addAttribute("projects",projects);
        return "showAllProjects";
    }
    @GetMapping("/selectProjectbyrid")
    public String selectProjectbyrid(String rid){
        Model model=new ConcurrentModel();
        List<Project> projectsbyrid=projectService.selectProjectbyrid(rid);
        model.addAttribute("projects",projectsbyrid);
        return "showAllProjects";
    }
    @GetMapping("/updProjectbyrid")
    public String updProjectbyrid(String isruku,String rid){
        projectService.updProjectbyrid(isruku,rid);

        return "Redirect:/selectProjectbyrid?rid="+rid;
    }
    @GetMapping("/addProject")
    public String addProject(String pid,String pname,String pprice,String pgys,String rid){
        Project project=new Project();
        project.setPid(pid);
        project.setPname(pname);
        project.setPprice(pprice);
        project.setPgys(pgys);
        project.setRid(rid);
        projectService.addProject(project);
        return "Redirect:/selectProjectbyrid?rid="+rid;
    }
    @GetMapping("/delProject")
    public String delProject(String pid,String rid){
        projectService.delProject(pid);
        return "Redirect:/selectProjectbyrid?rid="+rid;
    }
    @GetMapping("/updProject")
    public String updProject(String pid,String pname,String pprice,String pgys,String rid){
        Project project=new Project();
        project.setPid(pid);
        project.setPname(pname);
        project.setPprice(pprice);
        project.setPgys(pgys);
        project.setRid(rid);
        projectService.updProject(project);
        return "Redirect:/selectProjectbyrid?rid="+rid;
    }
}

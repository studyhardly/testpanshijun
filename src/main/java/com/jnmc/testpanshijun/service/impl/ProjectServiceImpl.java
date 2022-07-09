package com.jnmc.testpanshijun.service.impl;

import com.jnmc.testpanshijun.dao.ProjectDao;
import com.jnmc.testpanshijun.dao.UserDao;
import com.jnmc.testpanshijun.entity.Project;
import com.jnmc.testpanshijun.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectDao projectDao;
    @Override
    public List<Project> selectAllProject() {
        return projectDao.selectAllProject();
    }

    @Override
    public List<Project> selectProjectbyrid(String rid) {
        return projectDao.selectProjectbyrid(rid);
    }

    @Override
    public void updProjectbyrid(String isruku, String pid) {
        projectDao.updProjectbyrid(isruku,pid);
    }

    @Override
    public void addProject(Project project) {
        projectDao.addProject(project);
    }

    @Override
    public void delProject(String rid) {
        projectDao.delProject(rid);
    }

    @Override
    public void updProject(Project project) {
        projectDao.updProject(project);
    }
}

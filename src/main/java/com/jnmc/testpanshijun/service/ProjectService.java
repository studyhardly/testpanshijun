package com.jnmc.testpanshijun.service;

import com.jnmc.testpanshijun.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectService {
    List<Project> selectAllProject();

    /**
     * 该库房内所有产品的查看
     * @param rid
     * @return
     */
    List<Project> selectProjectbyrid(String rid);
    /**
     * 入库，出库查看
     * @param isruku
     * @return
     */
    void updProjectbyrid(String isruku,String rid);
    void addProject(Project project);
    void delProject(String pid);
    void updProject(Project project);

}

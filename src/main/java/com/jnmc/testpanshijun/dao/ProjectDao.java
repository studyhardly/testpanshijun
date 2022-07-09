package com.jnmc.testpanshijun.dao;

import com.jnmc.testpanshijun.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ProjectDao {
    List<Project> selectAllProject();

    /**
     * 该库房内所有产品的查看
     * @param rid
     * @return
     */
    List<Project> selectProjectbyrid(@Param("rid") String rid);
    /**
     * 入库，出库
     * @param isruku
     * @return
     */
    void updProjectbyrid(@Param("isruku") String isruku,@Param("rid") String rid);
    void addProject(@Param("project")Project project);
    void delProject(@Param("pid") String pid);
    void updProject(@Param("project")Project project);

}

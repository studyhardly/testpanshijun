package com.jnmc.testpanshijun.dao;

import com.jnmc.testpanshijun.entity.Project;
import com.jnmc.testpanshijun.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomDao {
    List<Room> selectAllRoom();
    void addRoom(@Param("room") Room room);
    void delRoom(@Param("rid") String rid);
    void updRoom(@Param("room") Room room);
}

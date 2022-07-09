package com.jnmc.testpanshijun.service;

import com.jnmc.testpanshijun.entity.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomService {
    List<Room> selectAllRoom();
    void addRoom(Room room);
    void delRoom(String rid);
    void updRoom(Room room);
}

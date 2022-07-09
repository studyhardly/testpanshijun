package com.jnmc.testpanshijun.service.impl;

import com.jnmc.testpanshijun.dao.ProjectDao;
import com.jnmc.testpanshijun.dao.RoomDao;
import com.jnmc.testpanshijun.entity.Room;
import com.jnmc.testpanshijun.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomDao roomDao;
    @Override
    public List<Room> selectAllRoom() {
        return roomDao.selectAllRoom();
    }

    @Override
    public void addRoom(Room room) {
        roomDao.addRoom(room);
    }

    @Override
    public void delRoom(String rid) {
        roomDao.delRoom(rid);
    }

    @Override
    public void updRoom(Room room) {
       roomDao.updRoom(room);
    }
}

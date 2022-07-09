package com.jnmc.testpanshijun.controller;

import com.jnmc.testpanshijun.entity.Room;
import com.jnmc.testpanshijun.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/room")
public class RoomController {
    @Resource
    private RoomService roomService;
    @GetMapping("/selectAllRoom")
    public String  selectAllRoom(){
        Model model=new ConcurrentModel();
        List<Room> rooms=roomService.selectAllRoom();
        model.addAttribute("rooms",rooms);
        return "showAllRoom";
    }
    @GetMapping("/addRoom")
    public String  addRoom(String rid,String rname,String rkc){
        Room room=new Room();
        room.setRid(rid);
        room.setRname(rname);
        room.setRkc(rkc);
        roomService.addRoom(room);
        return "Redirect:/selectAllRoom";
    }
    @GetMapping("/delRoom")
    public String  delRoom(String rid){
        roomService.delRoom(rid);
        return "Redirect:/selectAllRoom";
    }
    @GetMapping("/updRoom")
    public String  updRoom(String rid,String rname,String rkc){
        Room room=new Room();
        room.setRid(rid);
        room.setRname(rname);
        room.setRkc(rkc);
        roomService.updRoom(room);
        return "Redirect:/selectAllRoom";
    }

}

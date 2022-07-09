package com.jnmc.testpanshijun.controller;

import com.jnmc.testpanshijun.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @GetMapping("/login")
    public String login(String username,String password){
        if(userService.login(username,password)){
            log.info("登录成功！");
            return "redirect:/proj/showAllProj";
        }
        else {
            log.info("登录失败！");
            return "login";
        }
    }
    @GetMapping("/index")
    public String index(){
        return "redirect:/proj/showAllProj";

    }
}

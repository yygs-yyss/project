package com.example.demo.controller;

import com.example.demo.VO.ResultVO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@Slf4j
@RestController
@RequestMapping("/api/")
public class LoginController {
    @Autowired
    private UserService userService;
    @PostMapping("login")
    public ResultVO login(@RequestBody User user, HttpServletResponse response){
//        //基于用户名查询
        log.debug("222222");
//        log.debug("{}",user.getUserName());
//        log.debug("1");
        User u = userService.getUser(user.getUserName());
        log.debug("kkk");
        if(u == null || !u.getPassword().equals(user.getPassword())) {
            return ResultVO.error(401,"用户名密码错误");
        }
//        userService.UserCache(u.getId());
//        String token = encryptComponent.encrypt(Map.of("uid",u.getId(),"role",u.getRole()));
//        response.addHeader("token",token);
//        log.debug("{}",token);
        log.debug("ttt");
        return ResultVO.success(Map.of("user",u));
        //return ResultVO.success(Map.of("u","1"));
    }
}

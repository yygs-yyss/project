package com.example.demo.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户管理", tags = {"管理员用户操作"})
@Slf4j
@RestController
@RequestMapping("/api/")
public class UserController {
}

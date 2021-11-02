package com.example.demo.controller;

import com.example.demo.VO.ResultVO;
import com.example.demo.entity.TechnicalOffice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(value = "用户管理", tags = {"管理员用户操作"})
@Slf4j
@RestController
@RequestMapping("/api/")
public class technicalOfficeController {
    @ApiOperation("查询所有科室")
    @GetMapping("technicalOffice")
    public ResultVO getTechnicalOffice() {
        List<TechnicalOffice> list = null ;
        return ResultVO.success(Map.of("technicalOffice",list));
    }
}

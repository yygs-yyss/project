package com.example.demo.service;

import com.example.demo.entity.TechnicalOffice;
import com.example.demo.mapper.TechnicalOfficeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class TechnicalOfficeService {
    @Autowired
    private TechnicalOfficeMapper technicalOfficeMapper;
    public List<TechnicalOffice> selectAll() {
        return (List<TechnicalOffice>) technicalOfficeMapper.getALLT();
    }
}

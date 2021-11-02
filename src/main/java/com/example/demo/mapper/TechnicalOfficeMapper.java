package com.example.demo.mapper;

import com.example.demo.entity.TechnicalOffice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
@Component
public interface TechnicalOfficeMapper {
    @Select("select * from TechnicalOffice")
    public TechnicalOffice getALLT();
}

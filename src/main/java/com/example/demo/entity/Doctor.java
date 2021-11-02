package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String id;
    private String nickName;
    private String userName;
    private String password;
    private Date time;
    private String technicalOffice;
}

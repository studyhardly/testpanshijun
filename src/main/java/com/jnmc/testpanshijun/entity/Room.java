package com.jnmc.testpanshijun.entity;

import lombok.Data;

import java.util.List;

@Data
public class Room {

    private String rid;
    private String rname;
    private String rkc;

    private List<Project> projects;

}

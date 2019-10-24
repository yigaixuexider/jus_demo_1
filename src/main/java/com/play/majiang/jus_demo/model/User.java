package com.play.majiang.jus_demo.model;

import lombok.Data;

/**
 * created by wm on 2019/10/10
 */


@Data
public class User {
    private Integer id;
    private String  name;
    private String  accountId;
    private String  token;
    private Long    gmtCreate;
    private Long    gmtModified;
    private String  avatarUrl;
}

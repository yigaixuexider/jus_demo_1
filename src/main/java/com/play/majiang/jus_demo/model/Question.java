package com.play.majiang.jus_demo.model;

import lombok.Data;

/**
 * created by wm on 2019/10/16
 */

@Data
public class Question {
    private  Integer id;
    private  String title;
    private  String description;
    private  String tag;
    private  Long   gmtCreate;
    private  Long   gmtModified;
    private  Integer creator;
    private  Integer viewCount;
    private  Integer commentCount;
    private  Integer likeCount;

}

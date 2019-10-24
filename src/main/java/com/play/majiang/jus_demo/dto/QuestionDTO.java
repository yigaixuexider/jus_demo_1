package com.play.majiang.jus_demo.dto;

import com.play.majiang.jus_demo.model.User;
import lombok.Data;

/**
 * created by wm on 2019/10/19
 */

@Data
public class QuestionDTO {
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
    private  User user;
}

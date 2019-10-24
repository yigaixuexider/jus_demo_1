package com.play.majiang.jus_demo.dto;

import lombok.Data;

/**
 * created by wm on 2019/10/9
 */

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}

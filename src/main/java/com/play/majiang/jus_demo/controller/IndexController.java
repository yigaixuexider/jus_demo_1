package com.play.majiang.jus_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by wm on 2019/10/9
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public  String index(){
        return "index";
    }
}

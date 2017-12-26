package com.gz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaozefeng
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}


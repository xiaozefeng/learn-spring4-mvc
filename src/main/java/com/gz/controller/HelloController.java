package com.gz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaozefeng
 */
@Controller
public class HelloController {

    @GetMapping("/index")
    public String hello(){
        return "index";
    }
}


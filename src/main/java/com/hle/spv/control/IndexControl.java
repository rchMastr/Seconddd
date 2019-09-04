package com.hle.spv.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexControl {
    @RequestMapping("/index")
    public String hiapi(){
        System.out.println("his is hiapi");
        return "/index";
    }
}

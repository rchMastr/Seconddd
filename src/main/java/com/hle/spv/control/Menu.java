package com.hle.spv.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Menu {
    @RequestMapping("/hi")
    public String hiapi(){
        System.out.println("his is hiapi");
        return "/pages/hipg";
    }
}

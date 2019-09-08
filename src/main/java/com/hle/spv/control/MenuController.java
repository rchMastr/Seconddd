package com.hle.spv.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MenuController {
    @RequestMapping("/hi")
    public String hiapi(){
        System.out.println("his ifdsfdsgs hiapi");
        return "/pages/hipg";
    }
}

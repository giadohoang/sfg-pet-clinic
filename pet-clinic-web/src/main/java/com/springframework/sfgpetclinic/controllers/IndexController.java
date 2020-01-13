package com.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //When incoming requests are empty, or / or index or index.html, it will be mapped through this
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping({"/oups"})
    public String oupsHandler(){
        return "notimplemented";
    }
}

package com.piaodekuai.flight.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("mess", "hello JSP");
        m.addAttribute("name","thymeleaf");

        if(false){
            throw new Exception("some exception");
        }

        //return "Hello Spring Boot!";
        return "hello";
    }
}
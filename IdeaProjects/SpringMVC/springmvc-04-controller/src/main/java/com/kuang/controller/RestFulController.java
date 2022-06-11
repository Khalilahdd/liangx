package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    //安全 : 
    //原来的：http://localhost:8080/springmvc_04_controller/add?a=1&b=2
    //RestFul：http://localhost:8080/springmvc_04_controller/add/a/b

    @RequestMapping(value = "/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model) {
        int result = a + b;

        model.addAttribute("msg","结果为" + result);

        return "test";
    }
}

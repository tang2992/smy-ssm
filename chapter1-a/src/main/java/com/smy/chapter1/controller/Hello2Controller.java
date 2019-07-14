package com.smy.chapter1.controller;

import com.smy.chapter1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
public class Hello2Controller {
    @Autowired
    private HelloService helloService;

    @RequestMapping("hello2-1")
    public String hello2(Model model) {
        model.addAttribute("hello2_param1", helloService.m1());
        return "hello2";
    }
}

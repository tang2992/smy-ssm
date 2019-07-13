package com.smy.chapter1.controller;

import com.smy.chapter1.dto.User;
import com.smy.chapter1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("hello2")
    public String hello2(Model model) {
        model.addAttribute("hello2_param1", helloService.m1());
        return "hello2";
    }
    @RequestMapping("hello3")
    public void hello3(Model model) {
        model.addAttribute("hello2_param1", "hello3");
        return;
    }

    @RequestMapping("hello4")
    public void hello4(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.write("Hello World 4");
        writer.flush();

        return;
    }

    @ResponseBody
    @RequestMapping("json")
    public String json() {
        return "json";
    }

    @ResponseBody
    @RequestMapping("user")
    public User user() {
        return User.builder()
                .id(1)
                .name("好耶")
                .build();
    }
}

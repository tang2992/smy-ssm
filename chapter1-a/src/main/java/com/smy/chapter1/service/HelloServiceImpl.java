package com.smy.chapter1.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String m1() {
        return "service1";
    }
}

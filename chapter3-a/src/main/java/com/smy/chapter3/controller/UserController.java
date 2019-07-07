package com.smy.chapter3.controller;

import com.smy.chapter3.entity.User;
import com.smy.chapter3.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@Controller
public class UserController {

    private static final AtomicLong counter = new AtomicLong();

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable Long id) {
        return userRepository.getUser(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public User saveUser() {
        return userRepository.saveUser(counter.getAndIncrement());
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteUser(id);
    }
}
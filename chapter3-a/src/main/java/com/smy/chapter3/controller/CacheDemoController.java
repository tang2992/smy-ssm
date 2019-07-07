package com.smy.chapter3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class CacheDemoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @Cacheable(value = "calculateResult", keyGenerator = "customKeyGenerator")
    public String calculateResult() {
        log.debug("Performing expensive calculation...");
        // perform computationally expensive calculation
        return "result";
    }

}

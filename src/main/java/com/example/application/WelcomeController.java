/*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.example.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * <p>
 * Description:TODO
 * </P>
 * <p>
 * Company:Alibaba @ AliExpress
 * </p>
 * <p>
 * Department:Trade Platform
 * </p>
 *
 * @Author: zhangyue
 * @Since: 1.0
 * @Date:16/5/17
 */
@Controller
public class WelcomeController {

//    @Value("${application.message:Hello World}")
    private String message = "Hello World";

//    @GetMapping("/")
    @RequestMapping("/")
    public String welcome(ModelMap map) {
        map.addAttribute("host", "testDDDDD");
        return "index2";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

    @RequestMapping("/123")
    public String foo(ModelMap map) {
        map.addAttribute("host", "1231231231");
        return "welcome";
    }
}

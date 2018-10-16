package com.codersongs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wusongsong
 * @date 2018/10/15
 */
@Controller
@RequestMapping("/test")
public class TestController {
    /**
     *
     * @return 返回响应的地址
     */
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello world");
        return "hello";
    }
}

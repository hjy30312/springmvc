package com.hjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //扫描到Spring容器
public class HelloController {

    @RequestMapping("/hello.do")
    public ModelAndView execute() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.getModel().put("msg","注解版");
        return mav;
    }

}

package com.hjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

@Controller
public class AgeController {


    @RequestMapping("/toage.do")
    public String toage(){
        return "age";
    }

    @RequestMapping("/age.do")
    public String age(
            String birth,
            ModelMap model) throws ParseException {
        //接收用户输入的生日，计算年龄
        Date now = new Date();
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd");
        Date birth1 = sdf.parse(birth);
        int result = now.getYear()-birth1.getYear();
        model.put("msg", "年龄为：" + result);

        return "age";
    }

    //当前Controller异常处理
    //执行该方法后，不会再调用ExceptionResolver
    @ExceptionHandler   //局部异常处理
    public String handleException(
            HttpServletRequest request,
            Exception e) {
        request.setAttribute("msg","输入信息有误");
        return "age";
    }

}

package com.hjy.controller;


import com.hjy.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class LoginController {

    @RequestMapping("/tologin.do")
    public String toLogin() {
        return "login"; //返回视图名称
    }

    @RequestMapping("/login.do")
    public String checkLogin(
            HttpServletRequest request) {
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        if ("root".equals(name)
                && "1234".equals(password)) {
            return "ok";
        } else {
            return "login";
        }
    }

    @RequestMapping("/login1.do")
    public String checkLogin1(
            String username, String password) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);

        return "ok";
    }

    @RequestMapping("/login2.do")
    public String checkLogin2(User user){
        System.out.println("username:" + user.getUsername());
        System.out.println("password:" + user.getPassword());
        return "login";

    }



    @RequestMapping("/login3.do")
    public String checkLogin3(
            String username,
            String password,
            ModelMap model,
            HttpSession session) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        if ("root".equals(username)
                && "1234".equals(password)) {
            model.put("username", username);
            session.setAttribute(
                    "username", username);
            return "ok";    //"ok.jsp"使用${user}
        } else {
            model.put("msg", "用户名或密码错误");
            return "login";    //login.jsp 使用${msg}
        }
    }
}

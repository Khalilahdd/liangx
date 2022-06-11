package com.atguigu.crud.controller;

import com.atguigu.crud.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    /**
     * 登录页
     * @return
     */
//    @GetMapping(value = {"/","/login"})
//    public String loginPage() {
//        return "login";
//    }
//
//    @PostMapping("/login")
//    public String main(User user, HttpSession session, Model model) {
//
//        if (!StringUtils.hasLength(user.getUsername()) && "123456".equals(user.getPassword())){
//
//            //把登录成功的用户保存起来
//            session.setAttribute("loginUser",user);
//            //登录成功重定向到index.jsp ；重定向防止表单重复提交
//            return "index";
//        }else {
//            model.addAttribute("msg","账号密码错误");
//            //回到登录页面
//            return "login";
//        }
//    }
//
//    /**
//     * 去index页面
//     * @return
//     */
//    @PostMapping("/index")
//    public String mainPage(HttpSession session, Model model) {
//
//        //是否登录， 拦截器，过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null) {
//            return "index";
//        }else {
//            //回到登录页面
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
//    }



}

package com.atguigu.admin.controller;


import com.atguigu.admin.bean.Book;
import com.atguigu.admin.bean.Teacher;
import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.BookService;
import com.atguigu.admin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    BookService bookService;

    @Autowired
    TeacherService teacherService;

    @ResponseBody
    @PostMapping("/t1")
    public Teacher saveTeacher(Teacher teacher) {

        teacherService.saveTeacher(teacher);
        return teacher;
    }

    @ResponseBody
    @GetMapping("/t")
    public Teacher getTeacherByID(@RequestParam("id") Long id) {

        return teacherService.getTeacherById(id);
    }


    @ResponseBody
    @GetMapping("/book")
    public Book getBookById(@RequestParam("id") Long id) {

        return bookService.getBookById(id);

    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_book", Long.class);
        return aLong.toString();
    }
    /**
     * 登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage() {


        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {

        if (!StringUtils.hasLength(user.getUsername()) && "123456".equals(user.getPassword())){

            //把登录成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登录成功重定向到main.html ；重定向防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            //回到登录页面
            return "login";
        }
    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model) {

        //是否登录， 拦截器，过滤器
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return "main";
        }else {
            //回到登录页面
            model.addAttribute("msg","请重新登录");
            return "login";
        }


    }
}

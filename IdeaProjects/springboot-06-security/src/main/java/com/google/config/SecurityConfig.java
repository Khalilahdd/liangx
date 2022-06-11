package com.google.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//AOP:拦截器！
@EnableWebSecurity      //开启WebSecurity模式
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //链式编程
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问，功能页只有对应有权限的人才能访问
        //请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");


        //没有权限默认会到登录页面
        //定制登录页 loginPage("/toLogin")
        http.formLogin().loginPage("/toLogin").loginProcessingUrl("/login");

        //注销
        //开启了注销功能,跳到首页
        //防止网站攻击： get   post
        http.csrf().disable();//关闭csrf功能
        http.logout().logoutSuccessUrl("/");

        //开启记住我功能   cookie,默认保存两周
        http.rememberMe().rememberMeParameter("remember");
    }

    //认证，在springboot 2.1.x 可以直接使用~
    //密码编码：PasswordEncoder
    //在Spring Security 5.0+ 新增了很多的加密方法~
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //这些数据正常应该从数据库中读
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("google")
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles("vip2","vip3")
                .and()
                .withUser("root")
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles("vip1","vip2","vip3")
                .and()
                .withUser("guest")
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles("vip1");
    }
}

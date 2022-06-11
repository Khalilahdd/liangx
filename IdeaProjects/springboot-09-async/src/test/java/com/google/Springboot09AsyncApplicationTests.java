package com.google;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot09AsyncApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        //一个简单的邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("Khalilah你好呀~");
        mailMessage.setText("谢谢你~");
        mailMessage.setTo("1768518051@qq.com");
        mailMessage.setFrom("1768518051@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
    void contextLoads2() throws MessagingException {

        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        //正文
        helper.setSubject("Khalilah你好呀~");
        helper.setText("<p style='color:red'>谢谢你~</p>",true);

        //附件
        helper.addAttachment("1.jpg",new File("E:\\素材\\优质的壁纸\\1.jpg"));
        helper.addAttachment("2.jpg",new File("E:\\素材\\优质的壁纸\\1.jpg"));

        helper.setTo("913126577@qq.com");
        helper.setFrom("1768518051@qq.com");

        mailSender.send(mimeMessage);
    }

}

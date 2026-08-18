package com.masq.aidemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

@SpringBootTest(classes = AiDemoApplication.class)
public class MailSendTest {

    @Autowired
    private MailSender mailSender;

    @Test
    public void testSendSimpleEmail() {
        // 发送Hello World到kfw5264@163.com
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("kangfawei@qq.com");
        message.setTo("kfw5264@163.com");
        message.setSubject("测试邮件");
        message.setText("Hello World");


        // 发送邮件
         mailSender.send(message);
    }
}

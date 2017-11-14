package com.ygy.MailUtil;

import com.sun.mail.smtp.SMTPTransport;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Properties;

public class emailSend {
    @Bean("Session")
    public Session  session(){
        Properties props=new Properties();
        props.setProperty("mail.debug", "true");
        // 发送服务器需要身份验证
        props.setProperty("mail.smtp.auth", "true");
        // 设置邮件服务器主机名
        props.setProperty("mail.host", "smtp.163.com");
        // 发送邮件协议名称
        props.setProperty("mail.transport.protocol", "smtp");
     return Session.getInstance(props);
    }
    public Message message(String test,String subject){
        Message message=new MimeMessage(session());

        try {
            message.setText(test);
//            标题
            message.setSubject(subject);
            message.setFrom(new InternetAddress("ygy1982088424@163.com"));
        } catch (MessagingException e) {
            e.printStackTrace();
        }
         return message;
    }
    public void sendEmail(String test,String subject){
        Transport transport;
        try {
            transport = session().getTransport();
            transport.connect("ygy1982088424", "ygy123");
            transport.sendMessage(message(test, subject), new Address[]{
                    new InternetAddress("1982088424@qq.com")
            });
            transport.close();
        }catch (Exception e){

        }
    }
@Test
    public void test()throws Exception{
        sendEmail("测试！！","ygy");
}

}

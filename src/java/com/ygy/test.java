package com.ygy;

import com.ygy.service.userServiceDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Logger;

public class test {
    @Test
    public void ma()throws Exception{
        Properties props = new Properties();
        // 开启debug调试
        props.setProperty("mail.debug", "true");
        // 发送服务器需要身份验证
        props.setProperty("mail.smtp.auth", "true");
        // 设置邮件服务器主机名
        props.setProperty("mail.host", "smtp.163.com");
        // 发送邮件协议名称
        props.setProperty("mail.transport.protocol", "smtp");

        // 设置环境信息
        Session session = Session.getInstance(props);

        // 创建邮件对象
        Message msg = new MimeMessage(session);
        msg.setSubject("测试");
        // 设置邮件内容
        msg.setText("呵呵呵呵！");
        // 设置发件人
        msg.setFrom(new InternetAddress("ygy1982088424@163.com"));

        Transport transport = session.getTransport();
        // 连接邮件服务器
        transport.connect("ygy1982088424", "ygy123");
        // 发送邮件
        transport.sendMessage(msg, new Address[] {new InternetAddress("1982088424@qq.com")});
        // 关闭连接
        transport.close();
    }

}


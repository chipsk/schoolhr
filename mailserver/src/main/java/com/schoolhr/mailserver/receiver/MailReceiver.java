package com.schoolhr.mailserver.receiver;

import com.schoolhr.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@Component
public class MailReceiver {

    public static final Logger logger = LoggerFactory.getLogger(MailReceiver.class);

    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    MailProperties mailProperties;
    @Autowired
    TemplateEngine templateEngine;
    //RabbitMQ监听对象
    @RabbitListener(queues = "schoolhr.mail.welcome")
    public void handler(Employee employee) {
        logger.info(employee.toString());
        //收到消息，发送邮件
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg);
        try {
            helper.setFrom(mailProperties.getUsername());//发件人
            helper.setTo(employee.getE_mail());//收件人
            helper.setSubject("入职欢迎");//主题
            helper.setSentDate(new Date());//发送时间
            Context context = new Context();
            context.setVariable("username", employee.getUsername());
            context.setVariable("posname", employee.getPosname());
            context.setVariable("joblevel", employee.getJoblevel());
            context.setVariable("dname", employee.getDname());
            //渲染HTML字符串
            String mail = templateEngine.process("mail", context);
            helper.setText(mail, true);// 正文
            javaMailSender.send(msg);//发送
        } catch (MessagingException e) {
            e.printStackTrace();
            logger.error("邮件发送失败："+e.getMessage());
        }
    }
}


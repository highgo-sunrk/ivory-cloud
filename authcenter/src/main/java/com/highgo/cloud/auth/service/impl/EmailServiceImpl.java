package com.highgo.cloud.auth.service.impl;

import com.highgo.cloud.auth.entity.EmailVerificationCode;
import com.highgo.cloud.auth.service.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: highgo-lucunqiao
 * @date: 2023/3/8 9:58
 * @Description: 邮件相关serviceimpl
 */
@Service
public class EmailServiceImpl implements EmailService {

    @Resource
    private JavaMailSender mailSender;

    /**
     * 配置文件中我的邮箱
     */
    @Value("${spring.mail.from}")
    private String fromEmail;

    /**
     * description: 发送邮箱 验证码
     * date: 2023/3/8 10:43
     * @param code
     * @return: void
     * @author: highgo-lucunqiao
     * @since JDK 1.8
     */
    @Override
    public void sendEmailVerificationCode(EmailVerificationCode code) {
        //创建SimpleMailMessage对象
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件发送人
        message.setFrom(fromEmail);
        //邮件接收人
        message.setTo(code.getUserEmail());
        //邮件主题
        message.setSubject("Highgo Cloud 验证码");
        //邮件内容
        message.setText("【Highgo Cloud】 您的验证码为：" + code.getVerificationCode() + "，请在2分钟之内操作，谢谢！");
        //发送邮件
        mailSender.send(message);
    }
}
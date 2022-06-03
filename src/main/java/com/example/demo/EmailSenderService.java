package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail (String to,
                           String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("khaledgritli7@gmail.com");
        message.setTo("khaledgritli7@gmail.com");
        message.setText(body);
        message.setSubject("mot de passe");
        mailSender.send(message);
    }
}

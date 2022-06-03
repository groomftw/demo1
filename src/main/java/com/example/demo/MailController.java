package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {
    @Autowired
    private EmailSenderService senderService;

    @GetMapping (path = "/sendMail")
    public void sendMail(@RequestParam(name = "mail") String mail,
                             @RequestParam(name = "password") String password) {
        senderService.sendEmail("","mail :"+mail+" password :"+password);
    }
}

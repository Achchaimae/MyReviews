package com.youcode.myreview.mail;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MailController {
    private MailService emailService;

    @GetMapping("/sendEmail")
    public String sendEmail() {
        emailService.sendSimpleMessage("Achchaimae1@gmail.com", "Test mail message", "this is a mail Message");
        return "Email sent successfully!";
    }
}

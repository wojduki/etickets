package com.wojduki.tickets_delivery_service.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    JavaMailSender javaMailSender;

    public void sendEmail(String email) throws MessagingException {
        MimeMessage message= javaMailSender.createMimeMessage();
        MimeMessageHelper helper= new MimeMessageHelper(message, true);
        helper.setFrom("wojduki@gmail.com");
        helper.setTo(email);
        helper.setSubject("Twoje bilety od etickets");
        helper.setText("Twoje bilety są dostępne pod linkiem: ");
        javaMailSender.send(message);
        System.out.println("wysłano maila na: "+email);
    }
}

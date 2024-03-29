package com.app.Exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService {
	@Autowired 
private JavaMailSender javaMailSender; 
	
	public void sendEmail(String toEmail,String subject,String body) {
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setFrom("tamboliyasin02@gmail.com");
		simpleMailMessage.setTo(toEmail);
		simpleMailMessage.setText(body);
		simpleMailMessage.setSubject(subject);
		
		javaMailSender.send(simpleMailMessage);
		System.out.println("Mail sent succesfully");
		
	}

}

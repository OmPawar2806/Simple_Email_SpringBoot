//package com.Simple_Mail_Message.simpleMail;
//
//import java.io.File;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.FileSystemResource;
////import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//
//
//@Service
//public class EmailSender {
//	
//	@Autowired
//	private JavaMailSender mailSender;
//	
//	public void simpleEmail(String toEmail, String subject, String body) {
//		SimpleMailMessage message= new SimpleMailMessage();
//		
//		message.setFrom("ompawar2806mail.com");
//		message.setTo(toEmail);
//		message.setSubject(subject);
//		message.setText(body);
//		
//		 mailSender.send(message);
//		 System.out.println("Mail Sent...");
//	}
//	
//	public void sendMailAttachment(String toEmail, String subject, String body, String attachment) throws MessagingException {
//		MimeMessage mimemessage = mailSender.createMimeMessage();
//		
//		MimeMessageHelper mimeMessageHelper = new  MimeMessageHelper(mimemessage, true);
//		mimeMessageHelper.setFrom("ompawar2806mail.com");
//		mimeMessageHelper.setTo(toEmail);
//		mimeMessageHelper.setSubject("THIS IS THE SUBJECT!!!");
//		mimeMessageHelper.setSubject(subject);
//		mimeMessageHelper.setText(body);
//		
//		FileSystemResource fileSystem = new FileSystemResource(new File(attachment));
//		
//		mimeMessageHelper.addAttachment(fileSystem.getFilename(), fileSystem);
//		
//		mailSender.send(mimemessage);
//		System.out.println("Mail with attachment was sent....");
//	}
//}

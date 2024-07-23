package com.Simple_Mail_Message.simpleMail;

//import java.util.Scanner;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;

//import jakarta.mail.MessagingException;

@SpringBootApplication
public class SimpleMailApplication {

//	@Autowired
//	private EmailSender service;
	
	public static void main(String[] args) { SpringApplication.run(SimpleMailApplication.class, args); }
//		Scanner scanner=new Scanner(System.in);
//		@EventListener(ApplicationReadyEvent.class)
//		public void triggerMail() {
//			service.simpleEmail("patilrohit4948@gmail.com",
//					"this is subject.",
//					"this is body of email....");
//			try {
//				System.out.println("Enter the valid email address: ");
//				String toEmail= scanner.next();
//				System.out.println("Enter the Subject of the Email: ");
//				String subject= scanner.nextLine();
//				System.out.println();
//				System.out.println("Enter the Body of Email: ");
//				String body= scanner.nextLine();
				
//				service.sendMailAttachment(toEmail,
//						subject,
//						body,
//						"E:\\JAVA_PRO\\resume\\Om_Resume.pdf");
//			} 
//				catch (MessagingException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
}



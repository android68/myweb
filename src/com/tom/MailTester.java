package com.tom;

import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailTester {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		prop.put("mail.host", "mail.pccu.edu.tw");
		prop.put("mail.transport.protocol", "smtp");
		Session session = Session.getDefaultInstance(prop);
		
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress("tom@com.tw"));
			msg.setRecipient(RecipientType.TO, 
					new InternetAddress("hanktom220@gmail.com"));
			msg.setSubject("Email驗證信");
			msg.setText("bla bla bla http://localhost:8080/myweb/v?code=xxx");
			Transport.send(msg);
			
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

package TP2Punto2;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Main2 {
	public static void main(String[] args) {
		// provide recipient's email ID
		String to = "from@exampl.com";
		// provide sender's email ID
		String from = "alvarezagus1400@gmail.com";
		// provide Mailtrap's username
		final String username = "b78c9f4878db7f";
		// provide Mailtrap's password
		final String password = "b4f74a52b601e4";
		// provide Mailtrap's host address
		String host = "sandbox.smtp.mailtrap.io";
		// configure Mailtrap's SMTP server details
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		// create the Session object
		Authenticator authenticator = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		};
		Session session = Session.getInstance(props, authenticator);

		try {
			// create a MimeMessage object
			Message message = new MimeMessage(session);
			// set From email field
			message.setFrom(new InternetAddress(from));
			// set To email field
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			// set email subject field
			message.setSubject("Here comes Jakarta Mail!");
			// set the content of the email message
			message.setText("Que ondaaaaaaaaaaa");
			// send the email message
			Transport.send(message);
			System.out.println("Mensaje Enviado!");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
// Java program to send email
//set classpath=mail.jar;activation.jar;.;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class SendMailBySite 
{
	public static void main(String[] args) 
	{  
		String host="smtp.gmail.com";  
		final String user="zalarushirajsinh07@gmail.com";     //your email address
		final String password="rushi@123";//password  
		String to="yupinbhensdadiya88@gmail.com";            //change accordingly  
  
		//Get the session object  
		Properties props = new Properties();  
		props.put("mail.smtp.host",host);  
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
	
     
		Session session = Session.getDefaultInstance(props,  
				new javax.mail.Authenticator() 
				{  
					protected PasswordAuthentication getPasswordAuthentication() 
				{  
					return new PasswordAuthentication(user,password);  
				}  
			});  
  
		//Compose the message 
		
		try 
		{  
			MimeMessage message = new MimeMessage(session);  
			message.setFrom(new InternetAddress(user));  
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			message.setSubject("Email sent to the user.");  
			message.setText("NEW NOTIFICATION");  
			//Using HTML
			//message.setContent("Thank you for the payment.<b>JAVA</b>");
			//send the message  
			Transport.send(message);  
			System.out.println("Message Sent Successfully...");  
   
		} 
		catch (MessagingException e) 
		{
			e.printStackTrace();
		}  
	}  
}  
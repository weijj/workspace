<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%
	String result;
	// Recipient's email ID needs to be mentioned.
	String to = "weijj_ios@163.com";

	// Sender's email ID needs to be mentioned
	String from = "javabeta@163.com";

	// Assuming you are sending email from localhost
	String host = "smtp.163.com";

	// Get system properties object
	Properties properties = System.getProperties();

	// Setup mail server
	properties.setProperty("mail.smtp.host", host);
	properties.setProperty("mail.user", "javabeta");
	properties.setProperty("mail.password", "");

	// Get the default Session object.
	Session mailSession = Session.getDefaultInstance(properties);

	try {
		// Create a default MimeMessage object.
		MimeMessage message = new MimeMessage(mailSession);
		// Set From: header field of the header.
		message.setFrom(new InternetAddress(from));
		// Set To: header field of the header.
		message.addRecipient(Message.RecipientType.TO,
				new InternetAddress(to));
		// Set Subject: header field
		message.setSubject("Test Java Mail");
		// Now set the actual message
		message.setText("Wow, it's awesome!");
		// Send message
		Transport.send(message);
		result = "Sent message successfully....";
	} catch (MessagingException mex) {
		mex.printStackTrace();
		result = "Error: unable to send message....";
	}
%>
<html>
<head>
<title>Send Email using JSP</title>
</head>
<body>
	<center>
		<h1>Send Email using JSP</h1>
	</center>
	<p align="center">
		<%
			out.println("Result: " + result + "\n");
		%>
	</p>
</body>
</html>
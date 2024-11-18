//
//package Project_end;
//import com.sun.jdi.connect.Transport;
//import java.net.Authenticator;
//import java.net.PasswordAuthentication;
//import java.util.Properties;
//import javax.mail.*;
//import javax.mail.internet.*;
//import net.ucanaccess.jdbc.Session;
//
//public class GmailVerification {
//
//    public static void sendVerificationEmail(String toEmail, String verificationCode) {
//        final String fromEmail = "your-email@gmail.com"; // sender's email
//        final String password = "your-password";         // sender's email password
//
//        Properties properties = new Properties();
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "587");
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//
//        Session session = Session.getInstance(properties, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(fromEmail, password);
//            }
//        });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(fromEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
//            message.setSubject("Gmail Verification");
//            message.setText("Your verification code is: " + verificationCode);
//
//            Transport.send(message);
//            System.out.println("Verification email sent successfully.");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        String recipientEmail = "recipient-email@gmail.com";
//        String verificationCode = "123456"; // Generate a random code in real-world applications
//        sendVerificationEmail(recipientEmail, verificationCode);
//    }
//}

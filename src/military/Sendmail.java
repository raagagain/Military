
package military;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Sendmail {
    
    public static void main(String... args)throws IOException
    {
       String to="rahulagarwal199525@gmail.com"; 
       Properties prop=new Properties();
       prop.put("mail.smtp.host","smtp.gmail.com");
       prop.put("mail.smtp.socketFactory.port","465");
       prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
       prop.put("mail.smtp.auth","true");
       prop.put("mail.smtp.port","465");
       Session session=Session.getDefaultInstance(prop,
               new javax.mail.Authenticator() {
                   protected PasswordAuthentication getPasswordAuthentication(){
                       return new PasswordAuthentication("agarwalrupa08@gmail.com","sabkamalik1");
                   }
}
       );
       Randomno rd=new Randomno();
       int x=rd.otp();
       try{
           MimeMessage msg=new MimeMessage(session);
           msg.setFrom(new InternetAddress("agarwalrupa08@gmail.com"));
           msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
           msg.setSubject("Testing");
           msg.setText(Integer.toString(x));
           Transport.send(msg);
           System.out.println("Sent Succesfully");
       }
       catch(Exception e)
       {
           throw new RuntimeException(e);
       }
    }
    
}
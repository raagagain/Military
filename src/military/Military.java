package military;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Military {

    void smtp()
    {
       String to="rahulagarwal199525@gmail.com";
       String from="rahulagarwal199525@gmail.com";
       String host="localhost";
       
       
       System.out.println("1 Succesfully");
       Properties prop=System.getProperties();
       prop.setProperty("mail.smtp.host", host);
       Session session=Session.getDefaultInstance(prop);
       System.out.println("2 Succesfully");
       try{
           System.out.println("3 Succesfully");
           MimeMessage msg=new MimeMessage(session);
           System.out.println("4 Succesfully");
           msg.setFrom(new InternetAddress(from));
           System.out.println("5 Succesfully");
           msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
           System.out.println("6 Succesfully");
           msg.setSubject("ping");
           System.out.println("7 Succesfully");
           msg.setText("It's a Test");
           System.out.println("8 Succesfully");
           Transport.send(msg);
           System.out.println("Sent Succesfully");
          }
       catch(Exception e)
       {
          System.out.println(e);
       }  
    }
    
    public static void main(String[] args) throws IOException {
       
      Military mt=new Military();
      Sendmail sm=new Sendmail();
      sm.main(null);
     }
}

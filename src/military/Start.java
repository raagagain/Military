package military;

import MFS100.FingerData;
import MFS100.MFS100;
import MFS100.MFS100Event;
import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Start extends javax.swing.JFrame implements MFS100Event{
    int a,y;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Date d;
    PatternMatching pm;
    byte[] ISOTemplate=null;
    byte[] ISOTemplate2=null;
    MFS100 mfs100=null;
    public Start(byte[] barr) {
        conn=db.java_db();
        initComponents();
        mfs100=new MFS100(this);
        ISOTemplate=barr;
        Toolkit tk=getToolkit();
        Dimension size=tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2 );
        conn=db.java_db();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        sno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        otpenter = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(558, 203));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/oie_1683234iGtbCaE4.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Generate OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sno.setBackground(new java.awt.Color(0, 0, 0));
        sno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sno.setForeground(new java.awt.Color(255, 255, 255));
        sno.setBorder(null);
        sno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snoKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Your Passcode");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Powered By : Raag Corporation");

        back_button.setBackground(new java.awt.Color(0, 0, 0));
        back_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 255, 255));
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        jPanel5.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter The OTP");

        otpenter.setBackground(new java.awt.Color(102, 102, 102));
        otpenter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                otpenterKeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Powered By : Raag Corporation");

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(otpenter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otpenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        jPanel5.add(jPanel2, "card3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static long bettimes(Date d1,Date d2)
{
    return ChronoUnit.SECONDS.between(d1.toInstant(),d2.toInstant());
}
    boolean sendmail()throws IOException
    {
        String to=null;
        try
        {
            int c=0;
        String sql;
        sql="select email from users where sno="+a;
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next())
        {
        c++;
        to=rs.getString("email");
        }
        if(c==0){
           JOptionPane.showMessageDialog(null,"Couldn't Find Any User");
           sno.setText(null);
        }
        else
        {
           DateFormat df=new SimpleDateFormat("HH:mm:ss");
           d=new Date();
           Properties prop=new Properties();
           prop.put("mail.smtp.host","smtp.gmail.com");
           prop.put("mail.smtp.socketFactory.port","465");
           prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
           prop.put("mail.smtp.auth","true");
           prop.put("mail.smtp.port","465");
       
        Session session=Session.getInstance(prop,
               new javax.mail.Authenticator() {
                   protected PasswordAuthentication getPasswordAuthentication(){
                       return new PasswordAuthentication("agarwalrupa08@gmail.com","sabkamalik1");
                   }
        }
       );
       Randomno rd=new Randomno();
       int x=rd.otp();
       y=x;
       try{
           MimeMessage msg=new MimeMessage(session);
           msg.setFrom(new InternetAddress("agarwalrupa08@gmail.com"));
           msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
           msg.setSubject("Testing");
           msg.setText(Integer.toString(x));
           Transport.send(msg);
           return true;
       }
       catch(Exception e)
       {
           throw new RuntimeException(e);
       }
       }
       }
       catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e);
           return false;
        }
        return false;
    }

    public int matchiso()
    {
        int ret=0;
        if (ISOTemplate == null || ISOTemplate.length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Capture Finger First");
            return 0;
        }
        if (ret == 0) {
            int score = 0;
            score = mfs100.MatchISO(ISOTemplate2, ISOTemplate);
            if (score >= 14000) {
                JOptionPane.showMessageDialog(rootPane, "Finger Matched With Score " + String.valueOf(score));
            } else if (score >= 0 && score < 14000) {
                JOptionPane.showMessageDialog(rootPane, "Finger Not Matched " + String.valueOf(score));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
            }
            return score;
        } else {
           JOptionPane.showMessageDialog(rootPane, "Error: " + mfs100.GetLastError() + " (" + String.valueOf(ret) + ")");
        }
        return 0;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(sno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Fill Up the Id");
            sno.requestFocus();
        }
        else
        {
            a=Integer.parseInt(sno.getText());
            String sql="Select * from users where sno="+a;
            try
        {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next())
            {               
                byte[] img=rs.getBytes("fid");
                String str = new String(img);
                byte[] temp = str.getBytes("ISO-8859-1");
                ISOTemplate2=new byte[img.length];
                System.arraycopy(img, 0, ISOTemplate2, 0, img.length);
                System.out.println(img.length);
                int score=0;
                score=matchiso();
                if(score>14000)
                {
                    JOptionPane.showMessageDialog(null,"FIngerprint Matched");
                    boolean cnf=false;
                    cnf=sendmail();
                    if(cnf==true)
                    {
                        jPanel5.removeAll();
                        jPanel5.repaint();
                        jPanel5.add(jPanel2);
                        jPanel2.repaint();
                        jPanel2.revalidate();   
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Fingerprint Not Matched,,,,,,"
                            + "Try Again");
                    RaagStart rst=new RaagStart();
                    rst.setVisible(true);
                    this.dispose();
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid User");
                sno.setText("");
                sno.requestFocus();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            RaagStart rst=new RaagStart();
            rst.setVisible(true);
            this.dispose();
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x=Integer.parseInt(otpenter.getText());
        Date h=new Date();
        int i=0;
        
        i=(int) bettimes(d,h);
        
        if(y==x && i<=300)
        {
            JOptionPane.showMessageDialog(null,"Successfully Authorized");
            
            UserData uf=new UserData(a);
            uf.setVisible(true);
            this.dispose();
        }
        else if(i>300)
        {
            JOptionPane.showMessageDialog(null,"Time Limit Exceeded");
            
            RaagStart rst=new RaagStart();
            rst.setVisible(true);
            this.dispose();
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Alert Everyone");
            
            RaagStart rst=new RaagStart();
            rst.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void snoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snoKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE))
        {
           Toolkit tk=getToolkit();
           tk.beep();
           evt.consume();
        }
    }//GEN-LAST:event_snoKeyTyped

    private void otpenterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otpenterKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE))
        {
           Toolkit tk=getToolkit();
           tk.beep();
           evt.consume();
        }
    }//GEN-LAST:event_otpenterKeyTyped

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        RaagStart rst=new RaagStart();
        rst.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RaagStart rst=new RaagStart();
        rst.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField otpenter;
    private javax.swing.JTextField sno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void OnPreview(FingerData fd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void OnCaptureCompleted(boolean bln, int i, String string, FingerData fd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

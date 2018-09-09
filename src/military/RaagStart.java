package military;

import MFS100.*;
import java.awt.Dimension;
import java.awt.Image;
import static java.awt.PageAttributes.MediaType.D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import static jdk.internal.org.objectweb.asm.commons.GeneratorAdapter.OR;
import java.util.*;
import java.net.URL;
import java.net.URLConnection;

public class RaagStart extends javax.swing.JFrame implements MFS100Event{
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    MFS100 mfs100=null;
    byte[] ISOTemplate=null;
    public RaagStart() {
        conn=db.java_db();
        initComponents();
        mfs100=new MFS100(this);     
        Toolkit tk=getToolkit();
        Dimension size=tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2 );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        capture = new javax.swing.JButton();
        status = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4561_P_37.jpeg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        capture.setBackground(new java.awt.Color(0, 0, 0));
        capture.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        capture.setForeground(new java.awt.Color(0, 0, 204));
        capture.setText("Capture");
        capture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureActionPerformed(evt);
            }
        });

        status.setBackground(new java.awt.Color(0, 0, 0));
        status.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 0));
        status.setText("Status");
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capture, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(capture, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        boolean net=true;
        try
        {
            URL url=new URL("https://www.google.com/");
            URLConnection connection=url.openConnection();
            connection.connect();
        }
        catch(Exception e)
        {
            net=false;
        }    
        if(mfs100.IsConnected() && net==true)
        {
            JOptionPane.showMessageDialog(null,"Device And Network both are Connected");
        }
        else if(!(mfs100.IsConnected()) && net==false)
        {
            JOptionPane.showMessageDialog(null,"Device And Network both are Not Connected");
        }
        else if(net==false)
        {
            JOptionPane.showMessageDialog(null,"Network not Connected");
        }
        else 
        {
             JOptionPane.showMessageDialog(null,"Device is not Connected");
        }
    }//GEN-LAST:event_statusActionPerformed

    private void captureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captureActionPerformed
        int ret=mfs100.Init();
        int rey=mfs100.StartCapture(70,10000,false);
        if(ret!=0)
        {
            JOptionPane.showMessageDialog(null, mfs100.GetErrorMsg(ret));
        }
    }//GEN-LAST:event_captureActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaagStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton capture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton status;
    // End of variables declaration//GEN-END:variables

    @Override
    public void OnPreview(FingerData fd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void OnCaptureCompleted(boolean bln, int i, String string, FingerData fd) {
        if(mfs100.IsConnected())
        {
            try{
            if(bln)
            {            
                Runnable runnable = new Runnable() {
                    public void run()
                    {
                        ISOTemplate = new byte[fd.ISOTemplate().length];
                        System.arraycopy(fd.ISOTemplate(), 0, ISOTemplate, 0, fd.ISOTemplate().length);
                        BufferedImage image=null;
                        BufferedImage img=mfs100.BytesToBitmap(fd.FingerImage());
                        try {
                             image=new BufferedImage(jLabel1.getWidth(),jLabel1.getHeight(),BufferedImage.TYPE_INT_ARGB);
                             Image nimg=img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), jLabel1.getWidth());
                             ImageIcon inew=new ImageIcon(nimg);
                             jLabel1.setIcon(inew);
                             jLabel1.repaint();
                             File out=new File("C:\\Users\\raag\\Documents\\NetBeansProjects\\Military\\src\\images\\try.jpg");
                             ImageIO.write(img,"jpg", out);             
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RaagStart.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Start st=new Start(ISOTemplate);
                            st.setVisible(true);
                        } catch (IOException ex) {
                            Logger.getLogger(RaagStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                      System.out.println("Start : "+fd.Quality());
                    }
            };
                Thread trd=new Thread(runnable);
                trd.start();
                JOptionPane.showMessageDialog(rootPane, "Capture Success");
                this.dispose();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Device is being Detached");
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

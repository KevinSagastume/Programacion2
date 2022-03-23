
package interfaz;

import java.awt.Color;


public class Interfaz extends javax.swing.JFrame {

    int MouseX,MouseY;
    
    public Interfaz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        uesFmocc = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        userTxt = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        LogingBtn = new javax.swing.JPanel();
        LogingTxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uesFmocc.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        uesFmocc.setForeground(new java.awt.Color(255, 255, 255));
        uesFmocc.setText("UES FMO");
        bg.add(uesFmocc, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 110, 30));

        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda_1.png"))); // NOI18N
        citybg.setText("jLabel1");
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -10, 730, 570));

        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        favicon.setText("jLabel3");
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 50));

        logoname.setBackground(new java.awt.Color(0, 0, 0));
        logoname.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        logoname.setForeground(new java.awt.Color(0, 0, 0));
        logoname.setText("FMOcc");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 140, 30));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("INICIAR SESIÓN");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 50));

        passLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 30));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 420, 10));

        userTxt.setBackground(new java.awt.Color(255, 255, 255));
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setToolTipText("");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 420, 30));

        userLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 200, 140, 30));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 420, 10));

        passTxt.setBackground(new java.awt.Color(255, 255, 255));
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 306, 420, 30));

        LogingBtn.setBackground(new java.awt.Color(0, 134, 190));

        LogingTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        LogingTxt.setForeground(new java.awt.Color(255, 255, 255));
        LogingTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogingTxt.setText("ENTRAR");
        LogingTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogingTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogingTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogingTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogingTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LogingBtnLayout = new javax.swing.GroupLayout(LogingBtn);
        LogingBtn.setLayout(LogingBtnLayout);
        LogingBtnLayout.setHorizontalGroup(
            LogingBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogingBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LogingBtnLayout.setVerticalGroup(
            LogingBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogingBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(LogingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        ExitBtn.setBackground(new java.awt.Color(255, 255, 255));

        ExitTxt.setBackground(new java.awt.Color(255, 255, 255));
        ExitTxt.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        ExitTxt.setForeground(new java.awt.Color(0, 0, 0));
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("X");
        ExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
        ExitBtn.setLayout(ExitBtnLayout);
        ExitBtnLayout.setHorizontalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitBtnLayout.createSequentialGroup()
                .addComponent(ExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        ExitBtnLayout.setVerticalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1144, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        
    }//GEN-LAST:event_userTxtActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
       MouseX = evt.getX();
       MouseY = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-MouseX, y-MouseY);
        
    }//GEN-LAST:event_headerMouseDragged

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
        ExitBtn.setBackground(Color.red);
        ExitTxt.setForeground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
       ExitBtn.setBackground(Color.white);
       ExitTxt.setForeground(Color.black);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void LogingTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogingTxtMouseEntered
        LogingBtn.setBackground(new Color(0,156,223));
        
    }//GEN-LAST:event_LogingTxtMouseEntered

    private void LogingTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogingTxtMouseExited
       LogingBtn.setBackground(new Color(0,134,190));
       
    }//GEN-LAST:event_LogingTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
       if(userTxt.getText().equals("Ingrese su nombre de usuario")){
       userTxt.setText("");
       userTxt.setForeground(Color.black);
       }
       if(String.valueOf(passTxt.getPassword()).isEmpty()){
       passTxt.setText("********");
       passTxt.setForeground(Color.gray);
       }
        
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if(String.valueOf(passTxt.getPassword()).equals("********"));{
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if(userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void LogingTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogingTxtMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de Login con los datos:\nUsuario: " + userTxt.getText() + "\ncontraseña: " + String.valueOf(passTxt.getPassword()), "Login",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_LogingTxtMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel ExitTxt;
    private javax.swing.JPanel LogingBtn;
    private javax.swing.JLabel LogingTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel uesFmocc;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}

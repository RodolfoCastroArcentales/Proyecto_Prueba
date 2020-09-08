package proyectox;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.UIManager;
public class AccesoalSistema extends javax.swing.JFrame implements ActionListener{
    public boolean mostrar = true;
    public AccesoalSistema() {
        initComponents();       
        this.setSize(370,440);
        JBtnA.addActionListener(this);
        setLocationRelativeTo(null);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPassOculto = new javax.swing.JPasswordField();
        JTxtuser = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        JPassVisible = new javax.swing.JTextField();
        JBtnA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 90, 20);

        JPassOculto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JPassOculto.setToolTipText("Digite su contraseña porfavor");
        JPassOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPassOcultoActionPerformed(evt);
            }
        });
        getContentPane().add(JPassOculto);
        JPassOculto.setBounds(160, 150, 130, 30);

        JTxtuser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        JTxtuser.setToolTipText("Ingrese su numero de cedula");
        JTxtuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JTxtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtuserActionPerformed(evt);
            }
        });
        getContentPane().add(JTxtuser);
        JTxtuser.setBounds(160, 93, 130, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 120, 20);

        btnVer.setFont(new java.awt.Font("Candara", 1, 11)); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer);
        btnVer.setBounds(300, 150, 40, 30);

        JPassVisible.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JPassVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPassVisibleMouseEntered(evt);
            }
        });
        JPassVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPassVisibleActionPerformed(evt);
            }
        });
        JPassVisible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JPassVisibleKeyTyped(evt);
            }
        });
        getContentPane().add(JPassVisible);
        JPassVisible.setBounds(160, 150, 130, 30);

        JBtnA.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        JBtnA.setText("Acceder");
        getContentPane().add(JBtnA);
        JBtnA.setBounds(120, 250, 120, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\Fondo_Seguridad2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, 0, 430, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if (mostrar) {
            JPassVisible.setVisible(true);
            JPassOculto.setVisible(false);
            JPassVisible.setText(JPassOculto.getText());
            mostrar = false;
        } else {
            JPassVisible.setVisible(false);
            JPassOculto.setVisible(true);
            JPassOculto.setText(JPassVisible.getText());
            mostrar = true;
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void JPassVisibleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPassVisibleMouseEntered

    }//GEN-LAST:event_JPassVisibleMouseEntered

    private void JPassVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPassVisibleActionPerformed

    }//GEN-LAST:event_JPassVisibleActionPerformed

    private void JPassVisibleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPassVisibleKeyTyped

    }//GEN-LAST:event_JPassVisibleKeyTyped

    private void JPassOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPassOcultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPassOcultoActionPerformed

    private void JTxtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtuserActionPerformed
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
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new AccesoalSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnA;
    private javax.swing.JPasswordField JPassOculto;
    private javax.swing.JTextField JPassVisible;
    private javax.swing.JFormattedTextField JTxtuser;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(JBtnA ==e.getSource()){
            char m[] = JPassOculto.getPassword();
            char pass[]= new char[] {'a','d','m','i','n'};
            if (Arrays.equals(m, pass)) {
                Nivel0 obj = new Nivel0();
                obj.setVisible(true);
                dispose();
            }
        }
    }
}

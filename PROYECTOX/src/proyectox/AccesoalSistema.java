package proyectox;
import java.awt.event.*;
import java.util.Arrays;
public class AccesoalSistema extends javax.swing.JFrame implements ActionListener{
    public AccesoalSistema() {
        initComponents();
        this.setSize(329,440);
        JBtnA.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPass = new javax.swing.JPasswordField();
        JTxtuser = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        JBtnA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 90, 20);

        JPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JPass.setToolTipText("Digite su contraseña porfavor");
        getContentPane().add(JPass);
        JPass.setBounds(160, 160, 130, 23);

        JTxtuser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        JTxtuser.setToolTipText("Ingrese su numero de cedula");
        JTxtuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(JTxtuser);
        JTxtuser.setBounds(160, 100, 130, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 120, 20);

        JBtnA.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        JBtnA.setText("Acceder");
        getContentPane().add(JBtnA);
        JBtnA.setBounds(100, 250, 110, 29);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 320, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private javax.swing.JPasswordField JPass;
    private javax.swing.JFormattedTextField JTxtuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(JBtnA ==e.getSource()){
            char m[] = JPass.getPassword();
            char pass[]= new char[] {'a','d','m','i','n'};
            if (Arrays.equals(m, pass)) {
                Nivel0 obj = new Nivel0();
                obj.setVisible(true);
                dispose();
            }
        }
    }
}

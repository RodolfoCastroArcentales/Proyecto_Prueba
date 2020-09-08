package Registro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
    public Registro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JApe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JCed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTel = new javax.swing.JTextField();
        BtnReg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JDir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JCiud = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Cedula:");

        jLabel5.setText("Telefono:");

        BtnReg.setText("Registrar");
        BtnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellidos:");

        jLabel1.setText("Ciudad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JApe)
                            .addComponent(JNom)
                            .addComponent(JDir, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(JTel)
                            .addComponent(JCed)
                            .addComponent(JCiud)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(BtnReg)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JCiud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(BtnReg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegActionPerformed
        String r= "";
        if(!(r.equals(JCed.getText())&& r.equals(JNom.getText())&& r.equals(JApe.getText())&& r.equals(JDir.getText())&& r.equals(JDir.getText())&& r.equals(JCiud.getText()))){
            JOptionPane.showMessageDialog(this,"Debe ingresar todos los datos","Sistema",JOptionPane.ERROR_MESSAGE);
            Registrar();
            Nivel0 obj = new Nivel0();
            obj.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"Sistema","Todo bien",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnRegActionPerformed
    private Connection conexion(){
        Connection cn=null;
        String query="";
        try{
            String url = "jdbc:oracle:thin:@DESKTOP-M2DQEAJ:1521:XE";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection(url,"hr","hr"); 
        }catch(ClassNotFoundException ex){
           
        }
        catch(SQLException ex){
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE,null,ex);
        }
        return cn;
    }
    public int ejecutar(Connection cn, String sQuery){
        Statement st;
        int fila=0;
        try{
            st=cn.createStatement();
            fila=st.executeUpdate(sQuery);
            st.close();
        }
        catch(SQLException ex){
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE,null,ex);
        }
        return fila;
    }
    public void Registrar(){
        Connection cn;
        String sQuery;
        cn=conexion();
        if(cn!=null){
            sQuery="Insert into CLIENTES values ("+this.JCed.getText()+",'"+this.JNom.getText()+"','"+"','"+this.JApe.getText()+this.JDir.getText()+"','"+this.JTel.getText()+"','"+this.JCiud.getText()+"')";
            this.ejecutar(cn, sQuery);
        }
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReg;
    private javax.swing.JTextField JApe;
    private javax.swing.JTextField JCed;
    private javax.swing.JTextField JCiud;
    private javax.swing.JTextField JDir;
    private javax.swing.JTextField JNom;
    private javax.swing.JTextField JTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

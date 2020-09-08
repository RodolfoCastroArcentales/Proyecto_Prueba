package proyectox;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.UIManager;
public class Login extends javax.swing.JFrame implements  MouseListener{

    public Login() {
        initComponents();
        setSize(440,590);
        setLocationRelativeTo(null);
        JBtnIngreso.addMouseListener(this);
        JBtnRegistro.addMouseListener(this);
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBtnIngreso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JBtnRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(null);

        JBtnIngreso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\AccSis2.jpg")); // NOI18N
        JBtnIngreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBtnIngreso.setBorderPainted(false);
        JBtnIngreso.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\AccSis.jpg")); // NOI18N
        JBtnIngreso.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\AccSis2.jpg")); // NOI18N
        getContentPane().add(JBtnIngreso);
        JBtnIngreso.setBounds(90, 340, 60, 70);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO(A)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 60, 280, 40);

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SISBAN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 160, 140, 60);

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrarse");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 470, 140, 30);

        JBtnRegistro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\SignUp2.jpg")); // NOI18N
        JBtnRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBtnRegistro.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\SignUp.jpg")); // NOI18N
        JBtnRegistro.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\SignUp2.jpg")); // NOI18N
        getContentPane().add(JBtnRegistro);
        JBtnRegistro.setBounds(90, 450, 60, 70);

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acceder al Sistema");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 360, 140, 30);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfoblue\\Documents\\NetBeansProjects\\PROYECTO_S3\\PROYECTOX\\src\\Imagenes\\Fondo.jpg")); // NOI18N
        Fondo.setToolTipText("");
        getContentPane().add(Fondo);
        Fondo.setBounds(-40, 0, 480, 550);

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton JBtnIngreso;
    private javax.swing.JButton JBtnRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(this==e.getSource()){
            JBtnRegistro.setSize(60, 70);
            JBtnIngreso.setSize(60, 70);
        }
        if(e.getSource()==JBtnIngreso){
            
        }else{
            if(e.getSource()==JBtnRegistro){
                /*Registro ob = new Registro(this,true);
                ob.pack();
                ob.setVisible(true);
                dispose();*/
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(JBtnIngreso ==e.getSource()){
            JBtnIngreso.setSize(80,80);
            JBtnRegistro.setSize(60, 70);
        }else{
            if(JBtnRegistro ==e.getSource()){
                JBtnRegistro.setSize(80,80);
                JBtnIngreso.setSize(60, 70);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}


/*       JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception e) {
        }*/
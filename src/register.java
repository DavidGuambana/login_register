import base_datos.conexion;
import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import rojerusan.RSNotifyAnimated;

public class register extends javax.swing.JFrame {

    public static ResultSet rs;
    public static Connection con = null;
    public static PreparedStatement ps;

    
    public register() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    public void registrar() {
        if (cedula.getText().isEmpty() || name.getText().isEmpty()|| lastname.getText().isEmpty()|| phone.getText().isEmpty()||email.getText().isEmpty()|| username.getText().isEmpty()||password.getText().isEmpty()) {
            warning("Mensaje de precaución:","¡Aún hay campos por completar!");
        } else {
            con = conexion.conectar();
            if (con != null) {
                try {
                    ps = (PreparedStatement) con.prepareStatement("insert into usuario (cedula_usu, nombre_usu, password_usu, apellido_usu, celular_usu, correo_usu, usuario_usu) values (?,?,?,?,?,?,?)");
                    ps.setString(1, cedula.getText());
                    ps.setString(2, name.getText());
                    ps.setString(3, password.getText());
                    ps.setString(4, lastname.getText());
                    ps.setString(5, phone.getText());
                    ps.setString(6, email.getText());
                    ps.setString(7, username.getText());
                    
                    ps.executeUpdate();
                    success("Mensaje de registro:","¡Registrado correctamente!");
                    this.dispose();
                    login log = new login();
                    log.setVisible(true);
                } catch (SQLException ex) {
                    getToolkit().beep();
                    error("Mensaje de error:","¡Este usuario ya existe!");
                }
            }
        }
    }

    public static void success(String actividad, String mensaje) {
        new rojerusan.RSNotifyAnimated(actividad, mensaje, 5, RSNotifyAnimated.PositionNotify.TopRight, RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
    }

    public static void warning(String actividad, String mensaje) {
        new rojerusan.RSNotifyAnimated(actividad, mensaje,
                5, RSNotifyAnimated.PositionNotify.TopRight, RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.WARNING).setVisible(true);
    }

    public static void error(String actividad, String mensaje) {
        new rojerusan.RSNotifyAnimated(actividad, mensaje, 5, RSNotifyAnimated.PositionNotify.TopRight, RSNotifyAnimated.AnimationNotify.RightLeft,
                RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        cedula = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jl_cerrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(245, 462));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(146, 53));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡REGISTRAR!");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 170, 40));

        password.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(0, 102, 102));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 170, 60));

        cedula.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 102, 102));
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cédula de identidad:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 170, 60));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inicio de Sesión");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jl_cerrar.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jl_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cerrar.setText("×");
        jl_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_cerrar)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jl_cerrar))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(146, 53));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGRESAR");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 170, 40));

        username.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(0, 102, 102));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de usuario:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 170, 60));

        phone.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(0, 102, 102));
        phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Celular:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, 60));

        email.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 102, 102));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 170, 60));

        lastname.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lastname.setForeground(new java.awt.Color(0, 102, 102));
        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, 60));

        name.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 102, 102));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 170, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botella-de-plastico.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 250));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 660, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimalista.jpeg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(240, 440));
        jLabel1.setMinimumSize(new java.awt.Dimension(240, 440));
        jLabel1.setPreferredSize(new java.awt.Dimension(240, 440));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        registrar();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        this.dispose();
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_jl_cerrarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField cedula;
    public static javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jl_cerrar;
    public static javax.swing.JTextField lastname;
    public static javax.swing.JTextField name;
    public static javax.swing.JPasswordField password;
    public static javax.swing.JTextField phone;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

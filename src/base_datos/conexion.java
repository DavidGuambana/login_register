package base_datos;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {

    public static String usuario = "root";
    public static String clave = "";
    public static String url = "jdbc:mysql://localhost:3306/practica_login";
    public static Connection con = null;

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "¡No se pudo conectar a la base de datos!", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}




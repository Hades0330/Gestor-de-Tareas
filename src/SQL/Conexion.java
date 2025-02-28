package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion() {
        Connection con = null;
        String url = "jdbc:sqlserver://localhost:1433;"
                   + "databaseName=San_Francisco_Asis;"
                   + "integratedSecurity=true;"
                   + "encrypt=false;trustServerCertificate=true;";

        try {
            con = DriverManager.getConnection(url);
            System.out.println("✅ Conexión establecida con autenticación de Windows.");
        } catch (SQLException ex) {
            System.out.println("❌ Error de conexión: " + ex.toString());
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = getConexion();
        if (con != null) {
            System.out.println("✔ Conexión exitosa.");
        } else {
            System.out.println("✖ No se pudo establecer conexión.");
        }
    }
}

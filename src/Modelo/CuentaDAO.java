package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CuentaDAO {
    private Connection con;
    private PreparedStatement ps;
    Conexion cn = new Conexion();

    public boolean RegistrarCuenta(Cuenta cuenta) {
        boolean registrado = false;
        String sql = "INSERT INTO cuenta (id, nombreCuenta, balanceinicial, agregado, fecha) VALUES (?, ?, ?, ?, ?)";
        
        try {
            con = cn.getConnection();
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, cuenta.getUsuarioId()); // Establecer el usuario_id
                ps.setString(2, cuenta.getNombreCuenta());
                ps.setDouble(3, cuenta.getBalanceInicial());
                ps.setDouble(4, cuenta.getAgregado());
                ps.setString(5, cuenta.getFecha());
                int filas = ps.executeUpdate();
                if (filas > 0) {
                    registrado = true;
                }
            } else {
                System.out.println("La conexión a la base de datos falló.");
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.toString());
        }
        return registrado;
    }
}

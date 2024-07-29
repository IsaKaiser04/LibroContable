package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String correo, String pass) {
        login l = new login();
        String sql = "SELECT * FROM usuario WHERE correo = ? AND pass = ?";
        
        try {
            con = cn.getConnection();
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, correo);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                if (rs.next()) {
                    l.setId(rs.getInt("id"));
                    l.setNombre(rs.getString("nombre"));
                    l.setCorreo(rs.getString("correo"));
                    l.setPass(rs.getString("pass"));
                }
            } else {
                System.out.println("La conexión a la base de datos falló.");
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.toString());
        }
        return l;
    }
}

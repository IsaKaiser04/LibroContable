package Modelo;

public class SessionManager {
    // Variable estática para almacenar el usuario_id de la sesión
    private static int usuarioId;

    // Método para establecer el usuario_id en la sesión
    public static void setUsuarioId(int id) {
        usuarioId = id;
    }

    // Método para obtener el usuario_id de la sesión
    public static int getUsuarioId() {
        return usuarioId;
    }
}

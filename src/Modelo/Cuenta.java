package Modelo;

public class Cuenta {
    private int id;
    private String nombreCuenta;
    private double balanceInicial;
    private double agregado;
    private String fecha;
    private int usuarioId;

    public Cuenta() {
    }

    public Cuenta(int id, String nombreCuenta, double balanceInicial, double agregado, String fecha, int usuarioId) {
        this.id = id;
        this.nombreCuenta = nombreCuenta;
        this.balanceInicial = balanceInicial;
        this.agregado = agregado;
        this.fecha = fecha;
        this.usuarioId = usuarioId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public double getBalanceInicial() {
        return balanceInicial;
    }

    public void setBalanceInicial(double balanceInicial) {
        this.balanceInicial = balanceInicial;
    }

    public double getAgregado() {
        return agregado;
    }

    public void setAgregado(double agregado) {
        this.agregado = agregado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}

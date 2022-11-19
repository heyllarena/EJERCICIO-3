public class Estacionamiento {
    private String nombre; 
    private String direccion; 
    private double precio;
    private String placa; 
    private int horasParqueado; 
    private String marca; 
    private String modelo;
    private double horaEntrada;
    
    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHorasParqueado() {
        return horasParqueado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double isHoraEntrada() {
        return horaEntrada;
    }

    public Estacionamiento() {
        this.nombre = "";
        this.direccion = "";
        this.precio = 0.00;
        this.placa = "";
        this.horasParqueado = 0;
        this.marca = "";
        this.modelo = "";
        this.horaEntrada = 0.00;
    }

    public Estacionamiento(String nombre, String direccion, double precio ,String placa, int horasParqueado, String marca, String modelo,
    double horaEntrada) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
        this.placa = placa;
        this.horasParqueado = horasParqueado;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
    }

}

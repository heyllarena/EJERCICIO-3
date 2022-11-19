public class EspacioParqueo {
    private double ancho; 
    private double largo; 
    private double altura; 
    private int techado;
    private int aereo;
    private boolean lugar;

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAltura() {
        return altura;
    }

    public int getTechado() {
        return techado;
    }

    public int getAereo() {
        return aereo;
    }

    public boolean isLugar() {
        return lugar;
    }

    public EspacioParqueo() {
        this.ancho = 0.00;
        this.largo =  0.00;
        this.altura =  0.00;
        this.techado = 0;
        this.aereo = 0;
        this.lugar = false;
    }

    public EspacioParqueo(double ancho, double largo, double altura, int techado, int aereo, boolean lugar) {
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
        this.techado = techado;
        this.aereo = aereo;
        this.lugar = lugar;
    }

    
}

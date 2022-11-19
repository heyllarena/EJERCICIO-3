import java.util.Scanner;
public class Vista {
    Scanner sc;
    public Vista(){
        sc=new Scanner(System.in);
    }
    public void Bienvenida(){
        System.out.println("Bienvenido a creaparqueos3000, presione enter para poder continuar: ");
        sc.nextLine();
    }
    public int Opciones(){
        System.out.println("1. Crear un nuevo parqueo\n2. Ingresar un carro \n3. Estadísticas \n4.Guardar archivo \n5. Salir");
        int menu = sc.nextInt();
        return menu;
    }
    //Opcion 2
    public String Nombre(){
        System.out.println("Ingrese el nombre del parqueo: "); // el usuario crea su parqueo con sus condiciones
        String nombre = sc.next();
        return nombre;
    }
    public String Direccion(){
        System.out.println("Ingrese la dirección del parqueo: ");
        String direccion = sc.next();
        return direccion;
    }
    public double Precio(){
        System.out.println("Ingrese el precio por hora del parqueo: ");
        double precio = sc.nextDouble();
        return precio;
    }
    public String Marca(){
        System.out.println("Ingrese la marca del vehículo:");
        String marca = sc.next();
        return marca;
    }
    public String Placa(){
        System.out.println("Ingrese la placa del carro:");
        String placa = sc.next();
        return placa;
    }
    public String Modelo(){
        System.out.println( "Ingrese el modelo del carro:");
        String modelo = sc.next();
        return modelo;
    }
    public int Horas(){
        System.out.println("Ingrese las horas en las que usara el parqueo:");
        int horas = sc.nextInt();
        return horas;
    }
    public double HoraEntrada(){
        System.out.println("Ingrese la hora de entrada: ");
        double horaEntrada = sc.nextDouble();
        return horaEntrada;
    }
    
    //espacio parqueo
    public double Ancho(){
        System.out.println("Ingrese el ancho del parqueo: ");
        double ancho = sc.nextDouble();
        return ancho;
    }
    public double Largo(){
        System.out.println("Ingrese el largo del parqueo: ");
        double largo = sc.nextDouble();
        return largo;
    }
    public double Altura(){
        System.out.println("Ingrese el altura del parqueo: ");
        double altura = sc.nextDouble();
        return altura;
    }
    public int Aereo(){
        System.out.println("el parqueo es aereo? (si:1/ no:2): ");
        int aereo = sc.nextInt();
        return aereo;
    }
    public int Techado(){
        System.out.println("el parqueo es techado? (si:1/ no:2): ");
        int techado = sc.nextInt();
        return techado;
    }



}

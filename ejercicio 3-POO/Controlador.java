import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedWriter; // importación de modulos

import javax.swing.text.View;
public class Controlador {
    Vista vista;
    Scanner sc;
    FileWriter fileWriter; 
    PrintWriter printWriter;
    boolean bandera=true;
    ArrayList<EspacioParqueo> espacioparqueo = new ArrayList<EspacioParqueo>();
    ArrayList<Estacionamiento> estacionamientos = new ArrayList<Estacionamiento>();
    int contador=0;
    int contador2=0;
    

    public Controlador(){
        vista = new Vista();    
        sc = new Scanner(System.in);
        
    }
    public void Menu(){

        while(bandera){
            vista.Bienvenida(); 
            int menu= vista.Opciones();         
        

            if(menu == 1){
                double ancho = 0.00;
                double largo = 0.00;
                double altura = 0.00;
                int aereo = 0;
                int techado = 0;
                ancho = vista.Ancho();
                largo = vista.Largo();
                altura = vista.Altura();
                aereo = vista.Aereo();
                techado = vista.Techado();
                boolean lugar= false;
                EspacioParqueo agregaParqueo = new EspacioParqueo(largo, ancho, altura, techado, aereo, lugar); 
                espacioparqueo.add(agregaParqueo);

                for (int i=0; i<espacioparqueo.size(); i++) {
                    System.out.println("Largo: "+espacioparqueo.get(i).getLargo() +" Ancho: "+  espacioparqueo.get(i).getAncho()+" Altura:"+espacioparqueo.get(i).getAltura()+" Techado: "+espacioparqueo.get(i).getTechado()+" Aereo: "+espacioparqueo.get(i).getAereo());
                }

            }
            
            if(menu == 2){
                if (espacioparqueo.size()<=contador){
                    System.out.println("No hay espacio suficiente para agregar");
                    contador2++;
                    System.out.println(contador2);

                }else if (espacioparqueo.size()>contador){
                    String nombre = "";
                    String direccion = "";
                    double precio = 0.00;
                    String marca = "";
                    String placa = "";
                    String modelo = "";
                    int horas = 0;
                    double horaEntrada = 0.00;

                    nombre= vista.Nombre();
                    direccion= vista.Direccion();
                    precio= vista.Precio();
                    placa= vista.Placa();
                    horas= vista.Horas();
                    marca= vista.Marca();
                    modelo= vista.Modelo();
                    horaEntrada= vista.HoraEntrada();
                    
                    Estacionamiento agregaEstacionamiento = new Estacionamiento(nombre, direccion, precio, placa, horas, marca, modelo, horaEntrada); 
                    estacionamientos.add(agregaEstacionamiento);
                    contador++;
                    System.out.println("contador: " + contador);
                    for (int i=0; i<estacionamientos.size(); i++) {
                        System.out.println("Nombre: "+estacionamientos.get(i).getNombre() +" Direccion: "+  estacionamientos.get(i).getDireccion()+" Precio:"+estacionamientos.get(i).getPrecio()+" Marca: "+estacionamientos.get(i).getMarca()+" Placa: "+estacionamientos.get(i).getPlaca()+" Modelo: "+estacionamientos.get(i).getModelo()+" Horas: "+estacionamientos.get(i).getHorasParqueado()+" Hora de entrada: "+estacionamientos.get(i).isHoraEntrada());
                    }
                }else{
                    System.out.println("Para poder ingresar un carro, primero debe de existir por lo menos 1 espacio");

                }               
                                
            }
            if(menu == 3){
                if (espacioparqueo.size()>0 && estacionamientos.size()>0){
                    double elemento=0;
                    for (int i=0; i<estacionamientos.size(); i++) {
                        double horaE = estacionamientos.get(i).isHoraEntrada();
                        elemento= elemento+horaE;
                    }
                    double media= elemento/estacionamientos.size();
                    System.out.println("El horario con más uso: "+ media);

                    int elemento2=0;
                    for (int i=0; i<estacionamientos.size(); i++) {
                        int tiempo = estacionamientos.get(i).getHorasParqueado();
                        elemento2= elemento2+tiempo;
                    }
                    int media2= elemento2/estacionamientos.size();
                    System.out.println("El tiempo promedio del programa es: "+ media2);

                    System.out.println("Número de parqueos rechazados: "+ contador2);
                    //que marca es la mas usada
                    ArrayList<String> array = new ArrayList<String>();
                    for (int i=0; i<estacionamientos.size(); i++) {
                        String marca=estacionamientos.get(i).getMarca();
                        array.add(marca);
                    }System.out.println("la marca que más se repite: "+ array.get(0));
                    //caracteristicas mas usadas 
                    int elemento3=0;
                    int elemento4=0;
                    for (int i=0; i<espacioparqueo.size(); i++) {
                        int techados = espacioparqueo.get(i).getTechado();
                        int aereos = espacioparqueo.get(i).getAereo();
                        elemento3= elemento3+techados;
                        elemento4= elemento4+aereos;
                    }
                    if (elemento3<elemento4){
                        System.out.println("La caracteristica que más se repite es techado ");
                    }else{
                        System.out.println("La caracteristica que más se repite es aereo ");
                    }
                }else{
                    System.out.println("Para poder ingresar un carro, primero debe de existir por lo menos 1 espacio y un carro");
                }
            }
            if(menu == 4){
                if (espacioparqueo.size()>0 && estacionamientos.size()>0){
                    File file;
                    FileWriter w;
                    BufferedWriter bw;
                    PrintWriter wr;
                    try{
                        file = new File("Archivo.txt");
                        boolean fileCreated = file.createNewFile(); 
                        w= new FileWriter(file,true); //true para escribir al final
                        bw= new BufferedWriter(w);
                        wr= new PrintWriter(bw);
                        String lista="";
                        double ancho = 0.00;
                        double largo = 0.00;
                        double altura = 0.00;
                        int aereo = 0;
                        int techado = 0;

                        for (int i=0; i<espacioparqueo.size(); i++) {
                            ancho = espacioparqueo.get(i).getAncho();
                            largo = espacioparqueo.get(i).getLargo();
                            altura = espacioparqueo.get(i).getAltura();
                            aereo = espacioparqueo.get(i).getAereo();
                            techado = espacioparqueo.get(i).getTechado();
                            boolean lugar= true;
                            lista=(ancho+","+ largo+","+  altura+","+  aereo+","+  techado+","+lugar);
                            wr.append(lista+"\r\n");
                        }wr.close();

                        if (fileCreated){
                            System.out.println("Se creó el archivo");

                        }else{
                            System.out.println("No se pudo crear");
                        }
                    
                    }catch(Exception e){
                        System.out.println("No se pudo crear"+ e);
                    }
                }else{
                    System.out.println("Para poder guardar un archivo, primero debe de existir por lo menos 1 espacio y un carro");
                } // validacion
                
            }
            if(menu == 5){
                System.out.println("Gracias por usar el programa");
                break; //sale del programa
            }
                    
        }

    }
}


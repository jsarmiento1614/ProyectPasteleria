/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betaproyect;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class SelecOrden {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
         int salirDo=1;//para salime del do
         String opcion=null;
         String tipo;
         String tamano;
         int precio;
         public Pasteles call;//declaro a call como pasteles para llamarlo desde la otra clase.
         
        public void SelecOrden(){
        Scanner teclado=new Scanner(System.in);
         
         do{         
                  System.out.print("\033[34mSeleccione su orden conforme la siguiente tabla               S=>Salir\n");
                  System.out.print("_____________________________________________________________________\n");
                  System.out.printf("\033[33m%-20s%-20s%-20s%-20s\n","║Tipo Pastel","Pequeño","Mediano","Grande  ║");
                  System.out.print("║___________________________________________________________________║\n");
                  System.out.printf("%-20s%-20s%-20s%-20s\n","║Postre","150","250","350     ║");
                  System.out.print("║___________________________________________________________________║\n");
                  System.out.printf("%-20s%-20s%-20s%-20s\n","║Normal","300","500","700     ║");
                  System.out.print("║___________________________________________________________________║\n");
                  System.out.print("Tipo de Pastel:\n");
                  opcion=teclado.nextLine();
                  if(opcion.equalsIgnoreCase("S")){
                     System.out.println("\033[34mSaliste del sistema");
                     break;
                     
                  }else{    
                  }
                  System.out.print("Tamaño del Pastel:\n");
                  String opcion2=teclado.nextLine();
                  if (opcion.equalsIgnoreCase("postre") && opcion2.equalsIgnoreCase("pequeno")){
                      //System.out.println("Ha elegido un Postre pequeño con valor de 150");
                      tipo=opcion;
                      tamano=opcion2;
                      precio=150;
                      call=new Pasteles(tipo ,tamano, precio);
                      break;
                  }else if (opcion.equalsIgnoreCase("postre") && opcion2.equalsIgnoreCase("mediano")){ 
                         tipo=opcion;
                         tamano=opcion2;
                         precio=250;
                         call=new Pasteles(tipo ,tamano, precio);
                         break;
                  }else if (opcion.equalsIgnoreCase("postre") && opcion2.equalsIgnoreCase("grande")){
                            tipo=opcion;
                            tamano=opcion2;
                            precio=350;
                            call=new Pasteles(tipo ,tamano, precio);
                            break;
                  }else if (opcion.equalsIgnoreCase("normal") && opcion2.equalsIgnoreCase("pequeno")){
                            tipo=opcion;
                            tamano=opcion2;
                            precio=300;
                            call=new Pasteles(tipo ,tamano, precio);
                            break;
                  }else if (opcion.equalsIgnoreCase("normal") && opcion2.equalsIgnoreCase("mediano")){ 
                           tipo=opcion;
                            tamano=opcion2;
                            precio=500;
                            call=new Pasteles(tipo ,tamano, precio);
                            break;
                  }else if (opcion.equalsIgnoreCase("normal") && opcion2.equalsIgnoreCase("grande")){
                            tipo=opcion;
                            tamano=opcion2;
                            precio=700;
                            call=new Pasteles(tipo ,tamano, precio);
                            break;
                  }else{
                       System.out.println("\033[31mah introducido el dato "+opcion+" o " +opcion2+" incorrectamente, vuelva a intentarlo...");
                  }
         }while(salirDo!=2);
    }
}  



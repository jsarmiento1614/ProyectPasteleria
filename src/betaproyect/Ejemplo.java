/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betaproyect;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Ejemplo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Clientes arrayClientes[]=new Clientes[3];
        Scanner teclado=new Scanner(System.in);
        String DiaPedido;
        System.out.println("Que dia desea recibir su pedido");
        DiaPedido=teclado.nextLine();
        Fecha [] arregloFecha = new Fecha [2];
        arregloFecha[0] = new Fecha("DiaPedido");
        arregloFecha[1] = new Fecha("DiaPedido");
        
        
        //arregloFecha[0].setCliente(1, cliente);
       
        Clientes []c =arregloFecha[1].getArrayCliente();
        if (c[0] == null){
            System.out.println("No hay");
        }
        else{
            System.out.println("Si  hay");
        }
        
        String nombreCliente;
        String telefonoCliente;
        String direccionCliente;
        String horaEntrega;
        for (int i=0;i<arrayClientes.length;i++){
        System.out.println("Ingrese Los Datos Generales de Su compra");
        System.out.println("Ingrese Su Nombre Completo");
        nombreCliente=teclado.nextLine();
        System.out.println("Ingrese Su Telefono");
        telefonoCliente=teclado.nextLine();
        System.out.println("Ingrese Su Direccion");
        direccionCliente=teclado.nextLine();
        System.out.println("Ingrese la Hora de Entrega del Pastel");
        horaEntrega=teclado.nextLine();
        arrayClientes[i] = new Clientes(nombreCliente, telefonoCliente, direccionCliente, horaEntrega);
        
        
        arregloFecha[0].setCliente(0, arrayClientes[i]);
        
        System.out.println("Ingrese Los Datos de su pastel");
        String tipo;
        String tamano ;
        int precio;
        System.out.println("Ingrese Tipo de Pastel");
        tipo=teclado.nextLine();
        System.out.println("Ingrese Tamano");
        tamano=teclado.nextLine();
        System.out.println("Ingrese precio pastel");
        precio=teclado.nextInt();
        
        Pasteles pasteles = new Pasteles(tipo, tamano, precio);
        arrayClientes[i].setPastel(pasteles);
        
        
        
        System.out.println("Ingrese Los Datos de Dia de Entrega");
        String diaEntrega;
        int cantidadPasteles;
        System.out.println("Ingrese Dia de Entrega");
        diaEntrega=teclado.nextLine();
        System.out.println("Ingrese cantidad de Pasteles");
         cantidadPasteles=teclado.nextInt();
        
        Pedido pedido = new Pedido(diaEntrega, cantidadPasteles);
        arrayClientes[i].setPedido(pedido);
       
        }
        
       
/*        System.out.println("Nombre es " +arregloFecha[0].getCliente(0).getNombreCliente());
        System.out.println("Tipo de pastel "+ arregloFecha[0].getCliente(0).getPastel().getTipo());
        System.out.println("Cantidad de pasteles: "+ arregloFecha[0].getCliente(0).getPedido().getCantidaPasteles());
  */     
        
        //System.out.println(c[0].getNombreCliente());
        
        }
    
}

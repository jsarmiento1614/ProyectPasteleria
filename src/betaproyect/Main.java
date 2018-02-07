/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betaproyect;

/**
 *
 * @author Docente
 */

public class Main {
        
     public static void main(String[] args){
     SelecOrden callOrden =new SelecOrden();
     callOrden.SelecOrden();
     Pasteles call=new Pasteles();

     System.out.println("\033[34m***Su pedido se ha registrado con Exito***");
     System.out.println("\033[33mPor favor copie y guarde el codigo generado de su pedido");
     System.out.println("_______________________________________________________");
     //llamada de la clase que genera el codigo de pedido aleatoriamente.
     generar callGenerar =new generar();
     callGenerar.GeneradorCodigo();
     Clientes codigo=new Clientes();

     System.out.println("El dia de Entrega es: ");
     System.out.println("El tipo de pastel es: "+callOrden.call.getTipo());
     System.out.println("El tamaño del pastel es: "+callOrden.call.getTamano());
     System.out.println("El precio del pastel es: "+callOrden.call.getPrecio()); 
     System.out.println("_______________________________________________________");
     System.out.println("\033[33m¿Desea Cancelar su compra ahora? S/N");
     
     
     
    }
            
}

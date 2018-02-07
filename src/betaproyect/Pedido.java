/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betaproyect;

/**
 *
 * @author Administrador
 */
public class Pedido {
    private String diaEntrega;
    private int cantidadPasteles;
    
           
            
    Pedido (String diaEntrega, int cantidadPasteles){
        this.diaEntrega = diaEntrega;
        this.cantidadPasteles = cantidadPasteles;
          
    }
    
    public String getDiaEntrega(){
        return diaEntrega;
    }
    public int getCantidaPasteles(){
        return cantidadPasteles;
    }
    
}

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
public class Pasteles {
    
    private String tipo;
    private String tamano;
    private int precio;
    
    Pasteles(String tipo, String tamano ,  int precio){
    
    this.tipo = tipo;
    this.tamano = tamano;
    this.precio = precio;
}
    public String getTipo(){
        return tipo;
    }
    public String getTamano(){
        return tamano;
    }
    public int getPrecio(){
        return precio;
    }
    Pasteles(){
        
    }
}

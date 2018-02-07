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
public class Fecha {
    private String dia;
    private Clientes [] cliente;

    public Fecha(String dia) {
        this.dia = dia;
        cliente = new Clientes[2];
    }
    
    public void setCliente(int pos, Clientes cliente){
        this.cliente[pos] = cliente;
    }
    
    public Clientes getCliente(int pos){
        return cliente[pos];
    }
    
    public Clientes[] getArrayCliente(){
        return cliente;
    }
    
    
}

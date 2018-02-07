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
public class Clientes {
    private String nombreCliente;
    private String telefonoCliente;
    private String direccionCliente;
    private String horaEntrega;
    private Pasteles pastel;
    private Pedido pedido;
    private int codigoGenerado;
    
    Clientes(String nombreCliente,String telefonoCliente,String direccionCliente, String horaEntrega){
         this.nombreCliente = nombreCliente;
         this.telefonoCliente = telefonoCliente;
         this.direccionCliente = direccionCliente;
         this.horaEntrega = horaEntrega;
        
    }
    Clientes(int codigoGenerado){
        this.codigoGenerado=codigoGenerado;
    }

    Clientes() {
        
    }
    
    public void setPastel(Pasteles pastel){
        this.pastel = pastel;
    }
    
    public Pasteles getPastel(){
        return pastel;
    }
    
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
    public Pedido getPedido(){
        return pedido;
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    public String getTelefonoCliente(){
        return telefonoCliente;
      
    }
    public String getDireccioCliente(){
        return direccionCliente;
        
    }
    public String getHoraEntega(){
        return horaEntrega;
    }
    public int getCodigoGenerado(){
        return codigoGenerado;
    }
}

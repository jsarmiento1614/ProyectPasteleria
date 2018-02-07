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

import java.util.Random;
public class generar {
  public Clientes codigo;
  int codigoGenerado;
  public void GeneradorCodigo () {
    //genero el codigo que resivira el usuario aleatoriamente usando randon.
    Random rnd = new Random(); 
    System.out.println("Su codigo de pedido es:");
    for (int i = 0; i < 1; i++) {
        System.out.print(rnd.nextInt());
        //codigoGenerado=rnd.nextInt();
        codigo=new Clientes(codigoGenerado);    
    }
    System.out.println("");
  } 
}
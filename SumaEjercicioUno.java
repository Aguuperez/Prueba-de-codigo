/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseUnoyDos;

import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class SumaEjercicioUno{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String numeroEscrito;
       String numeroEscritoDos;
        
        System.out.println("ingrese el primer numero entero");
        numeroEscrito=leer.next();
         int numero= Integer.parseInt(numeroEscrito);
        
        System.out.println("ingrese el segundo numero entero");
        numeroEscritoDos=leer.next();
        int numeroDos=Integer.parseInt(numeroEscritoDos);
        
        int resultado= numero+numeroDos;
        System.out.println("La suma total es " + resultado);
  
        
    }
    
}

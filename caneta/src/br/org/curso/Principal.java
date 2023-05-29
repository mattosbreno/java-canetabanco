package br.org.curso;

import java.util.Scanner;

/**
 *
 * @author polar
 */
public class Principal {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Breno Mariano", 'M', 19);
        Cliente cliente2 = new Cliente("Jacqueline Almeida", 'F', 40);
        
        Conta conta1 = new Conta("0000-1", cliente1, 40000.0, "b1234");
        Conta conta2 = new Conta("0000-2", cliente2, 27000.0, "j1234");
        
        System.out.println("--------------------------------------------------------");
        System.out.println(conta1.mostrarInfo());
        System.out.println(conta2.mostrarInfo());
        System.out.println("\n\n"); 
        System.out.println(conta1.transferir(17000.00, conta2));
        System.out.println("\n\n");
        System.out.println("--------------------------------------------------------");
        System.out.println(conta1.mostrarInfo());
        System.out.println(conta2.mostrarInfo());   
    }
}
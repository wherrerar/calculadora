/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculos;

import java.util.Scanner;

/**
 *
 * @author WilangelSalsa
 */
public class Calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Ingresa Valor 1: ");
    int Valor1 = in.nextInt();
        System.out.println("Ingresa Valor 2: ");
    int Valor2 = in.nextInt();
    
    int Resultado = Valor1+Valor2;
    
        System.out.println("El Resultado de la suma es: " + Resultado);
    
    }
    
}

/*
INSTRUCCIONES: Pedir dos números y mostrarlos ordenados de mayor a menor.
*/
package ejerciciosdepractica;

import java.util.Scanner;

public class EjercicioOrdenarDosNumeros {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le damos la bienvenida al usuario
        System.out.println("BIENVENIDO AL PROGRAMA DE ORDENAR DOS NUMEROS");
        
        // Pedimos los numeros al usuario
        System.out.print("Ingresa el primer numero: ");
        int primerNumero = teclado.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int segundoNumero = teclado.nextInt();
        
        // Ordeamos los numeros
        if(primerNumero > segundoNumero){
            System.out.println("1. " + primerNumero + "\n2. " + segundoNumero);
        } else if(segundoNumero > primerNumero) {
            System.out.println("1. " + segundoNumero + "\n2. " + primerNumero);            
        } else {
            System.out.println("Ambos numeros son iguales: " + primerNumero + " = " + segundoNumero);
        }
        
    }
    
}

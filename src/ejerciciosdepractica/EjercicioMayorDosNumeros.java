/*
INSTRUCCIONES: Pedir dos números y decir cual es el mayor.
*/
package ejerciciosdepractica;

import java.util.Scanner;

public class EjercicioMayorDosNumeros {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le damos la bienvenida al usuario
        System.out.println("BIENVENIDO AL PROGRAMA PARA SABER CUAL NUMERO ES MAYOR");
        
        // Pedimos los dos numeros
        System.out.print("Ingresa el primer numero: ");
        int primerNumero = teclado.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int segundoNumero = teclado.nextInt();
        
        // Mostramos que numero es mayor
        if(primerNumero > segundoNumero){
            System.out.println("Primer numero: " + primerNumero + " es mayor que Segundo Numero: " + segundoNumero);
        } else if(segundoNumero > primerNumero){
            System.out.println("Segundo numero: " + segundoNumero + " es mayor que Primer Numero: " + primerNumero);
        } else {
            System.out.println("Ambos numeros son iguales: " + primerNumero + " = " + segundoNumero);
        }
    }
    
}

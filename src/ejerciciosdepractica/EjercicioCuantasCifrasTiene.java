/*
INSTRUCCIONES: Pedir un número y decir cuantas cifras tiene.
*/
package ejerciciosdepractica;

import java.util.Scanner;


public class EjercicioCuantasCifrasTiene {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario un número
        System.out.print("Ingresa un numero: ");
        int numero = teclado.nextInt();
        
        // Convertimos el número en un String para poder contarlo
        String strNumero = Integer.toString(numero);
        
        // Contamos la longitud de la palabra y esa sera la cantidad de digitos que tiene
        System.out.println("El numero: " + numero + " tiene " + strNumero.length() + " cifras");
        
    }  
}

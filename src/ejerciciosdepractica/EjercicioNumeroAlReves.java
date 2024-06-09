/*
INSTRUCCIONES: Pedir un número y mostrarlo con las cifras al revés.
*/
package ejerciciosdepractica;

import java.util.Scanner;


public class EjercicioNumeroAlReves {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le damos la bienvenida al usuario
        System.out.println("BIENVENIDO AL PROGRAMA PARA MOSTRAR UN NUMERO AL REVES");
        
        // Pedimos el numero al usuario
        System.out.print("Ingresa un numero: ");
        String numero = teclado.next();

        // Declaramos la variable que almacenará el numero al reves
        String numReves = "";
        
        // Usamos un ciclo for para recorrer todo el string
        for(int i = 1; i <= numero.length(); i++){
            numReves += numero.charAt(numero.length() + (i * -1));
        }
        
        // Mostramos el numero al reves
        System.out.println("Numero: " + numero + " al reves es: " + numReves);
    }   
}

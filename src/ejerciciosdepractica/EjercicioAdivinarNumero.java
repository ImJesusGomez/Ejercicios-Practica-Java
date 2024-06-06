/*
INSTRUCCIONES: Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
*/

package ejerciciosdepractica;

import java.util.Random;
import java.util.Scanner;

public class EjercicioAdivinarNumero {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        // Declaramos un numero aleatorio que sera el que el usuario debe adivinar
        int numeroAleatorio = random.nextInt(101);
        
        // Variable que nos ayudará en el ciclo while
        boolean continuar = true;
        
        // Ciclo while que se repita hasta que el usuario adivine el numero
        while(continuar == true){
            System.out.print("Ingresa un numero: ");
            int numeroUsuario = teclado.nextInt();
            
            if(numeroUsuario > numeroAleatorio){
                System.out.println("Menor");
            } else if(numeroUsuario < numeroAleatorio){
                System.out.println("Mayor");
            } else{
                System.out.println("Haz adivinado el numero!!");
                continuar = false;
            }
        }
    }
}

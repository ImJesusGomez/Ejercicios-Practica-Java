/*
INSTRUCCIONES: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
*/

package ejerciciosdepractica;

import java.util.Scanner;

public class EjercicioNumeroParImpar {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le damos la bienvenida al usario
        System.out.println("PROGRAMA PARA SABER SI UN NUMERO ES IMPAR O PAR");
        
        // Declaramos la variable a comparar para saber si es par o impar
        int numero = 1;
        
        // Usamos un ciclo while que compruebe el valor y se repita hasta que el usuario ingrese 0
        while(numero != 0){
            System.out.println("Ingresa un numero:");
            numero = teclado.nextInt();
            
            if(numero % 2 == 0){
                System.out.println("Numero: " + numero + " es par.");
            } else{
                System.out.println("Numero: " + numero + " es impar.");
            }
        }   
    }
}

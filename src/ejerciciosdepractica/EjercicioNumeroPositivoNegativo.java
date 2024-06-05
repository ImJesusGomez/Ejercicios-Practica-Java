/*
INSTRUCCIONES: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
un 0.

*/

package ejerciciosdepractica;

import java.util.Scanner;


public class EjercicioNumeroPositivoNegativo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("PROGRAMA PARA SABER SI UN NUMERO ES POSITIVO O NEGATIVO");

        
        int numero = 1;
        
        while(numero != 0){
            System.out.println("Ingresa un numero: ");
            numero = teclado.nextInt();
            
            if(numero > 0){
                System.out.println("Numero: " + numero + " es positivo");
            } else if(numero < 0){
                System.out.println("Numero: " + numero + " es negativo");
            } else{
                System.out.println("" + numero + " no es positivo ni negativo");
            }
        }
        
    }
    
}

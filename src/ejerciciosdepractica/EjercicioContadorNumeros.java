/*
INSTRUCCIONES: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
*/

package ejerciciosdepractica;

import java.util.Scanner;

public class EjercicioContadorNumeros {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le damos la bienvenida al usuario
        System.out.println("PROGRAMA DE CONTADOR DE NUMEROS (termina hasta que ingresa un numero negativo)");
        
        // Declaramos una variable que nos ayudará en el ciclo while y la variable de contador de numeros
        boolean continuar = true;
        int contadorNumeros = 0;
        
        
        // Usamos un ciclo while que se repita y cuente los numeros
        while(continuar == true){
            System.out.print("Ingresa un numero: ");
            int numero = teclado.nextInt();
            
            if(numero > 0){
                continuar = true;
            } else{
                continuar = false;
            }
            
            contadorNumeros += 1;
        }
        
        System.out.println("Se han introducido: " + (contadorNumeros - 1) + " numeros");
    }
}

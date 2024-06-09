/*
INSTRUCCIONES: Pedir un número y decir si es capicúa.
*/
package ejerciciosdepractica;

import java.util.Scanner;

/**
 *
 * @author Microsoft Windows 10
 */
public class EjercicioNumeroCapicua {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le damos la bienvenida al usuario
        System.out.println("BIENVENIDO AL PROGRAMA PARA SABER SI UN NUMERO ES CAPICUA");
        
        // Pedimos el numero al usuario
        System.out.print("Ingresa un numero: ");
        String numero = teclado.next();

        // Declaramos la variable que almacenará el numero al reves
        String numReves = "";
        
        // Usamos un ciclo for para recorrer todo el string
        for(int i = 1; i <= numero.length(); i++){
            numReves += numero.charAt(numero.length() + (i * -1));
        }
        
        if(numero.equalsIgnoreCase(numReves)){
            System.out.println("Numero: " + numero + " SI es capicua");
        } else {
            System.out.println("Numero: " + numero + " NO es capicua");
        }
    }
}

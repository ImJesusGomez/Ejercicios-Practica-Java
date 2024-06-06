/*
INSTRUCCIONES: Pedir dos números y decir si uno es múltiplo del otro.
*/
package ejerciciosdepractica;

import java.util.Scanner;

public class EjercicioNumeroMultiplo {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le pedimos al usuario los números
        System.out.print("Ingresa el primer numero: ");
        int primerNumero = teclado.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int segundoNumero = teclado.nextInt();
        
        if(primerNumero % segundoNumero == 0){
            System.out.println("Segundo numero: " + segundoNumero + " ES multiplo de Primer numero: " + primerNumero);
        } else {
            System.out.println("Segundo numero: " + segundoNumero + " NO ES multiplo de Primer numero: " + primerNumero);
        }
    }
    
}

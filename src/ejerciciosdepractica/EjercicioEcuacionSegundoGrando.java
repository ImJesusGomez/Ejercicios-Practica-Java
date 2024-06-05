/*
INSTRUCCIONES:
1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
*/


package ejerciciosdepractica;

import java.util.Scanner;

public class EjercicioEcuacionSegundoGrando {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Le mostramos al usuario en lo que consiste el programa
        System.out.println("CALCULADORA DE ECUACIONES DE SEGUNDO GRANDO POR FORMULA GENERAL\nIngresa los coeficientes");        
        
        // Preguntamos y declaramos las variables
        System.out.print("A: ");
        double a = teclado.nextDouble();
        System.out.print("B: ");
        double b = teclado.nextDouble();
        System.out.print("C: ");
        double c = teclado.nextDouble();
        
        // Mostramos la ecuación
        System.out.println("" + a + "x^2  " + b + "x  " + c + " = 0");
        
        // Declaramos una variable para saber cuántas soluciones tiene   
        double comprobarSolucion = Math.pow(b, 2) - 4 * (a * c);
        
        
        // Calculamos el resultado
        if(comprobarSolucion > 0){
            System.out.println("Ecuacion tiene dos soluciones");
            double xUno = ((-1 * b) + (Math.sqrt(Math.pow(b, 2) - 4 * (a * c)))) / (2 * a);
            double xDos = ((-1 * b) - (Math.sqrt(Math.pow(b, 2) - 4 * (a * c)))) / (2 * a);
            System.out.println("Soluciones: X1 = " + xUno + " y X2 = " + xDos);

        } else if(comprobarSolucion == 0){
            System.out.println("Ecuacion tiene una solucion");
            double x = ((-1 * b) + (Math.sqrt(Math.pow(b, 2) - 4 * (a * c)))) / (2 * a);
            System.out.println("Solucion: X = " + x);

        } else{
            System.out.println("La ecuacion no tiene soluciones reales");
        }
    }
}

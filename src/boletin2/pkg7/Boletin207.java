/* Obtenemos renda mensual que se debe pagar por un prestamo, tecleando nomina
 interes anual (expresado en %) y el numero de años 
 por los que se concede el préstamo. Interes anual debe estar expresado en
 tanto por ciento mensual y el numero de años en meses. */
package boletin2.pkg7;

import java.util.Scanner;

public class Boletin207 {

    public static void main(String[] args) {
        // Codigo del programa
        //n=nomina i=interes t=años total.
        float n, i, t, total;
        Scanner dato = new Scanner(System.in);
        System.out.println("Nomina");
        n = dato.nextFloat();
        System.out.println("Interés Anual %");
        i = dato.nextFloat();
        System.out.println("Nº de Años");
        t = dato.nextFloat();

        total = n * i * t / 1200;

        System.out.println("Renta= " + total + "/mes");
    }

}

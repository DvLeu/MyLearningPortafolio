package ejerciciosTarea;

import java.util.Arrays;
import java.util.Scanner;

public class tarea05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Dime de que tamanio sera tu arreglo : ");
        int tama = read.nextInt();
        double total = 0;
        double [] arreglo = new double[tama];
        for (int p=0; p<arreglo.length;p++) {
            System.out.println("Introduce el valor en la posicion" + " "+  (p) + " " + "del arreglo ");
            arreglo[p]= read.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
        }

        System.out.println("El promedio del arreglo"+ " " + Arrays.toString(arreglo) + " es: " + (total/ arreglo.length ));

    }
}

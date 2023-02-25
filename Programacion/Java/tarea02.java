package ejerciciosTarea;

import java.util.Scanner;
import java.util.Arrays;

public class tarea02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Dime de que tamanio sera tu arreglo : ");
        int tama = read.nextInt();
        int [] arreglo = new int[tama];
        for (int p=0; p<arreglo.length;p++) {
            System.out.println("Introduce la posicion" + " "+  (p) + " " + "del arreglo ");
            arreglo[p]= read.nextInt();
        }
        System.out.println("Dime que numero quieres buscar dentro del arreglo : ");
        int cont = read.nextInt();
        boolean check = Arrays.asList(arreglo).contains(cont);
        if (check == true){

            System.out.println("El numero " + cont + " No esta en el arreglo ");
        }else if (check == false){

            System.out.println("El numero " + cont + " Se encuentra en el arreglo ");
        }
    }
}

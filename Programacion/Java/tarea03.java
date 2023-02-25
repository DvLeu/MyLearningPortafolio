package ejerciciosTarea;

import java.util.Arrays;
import java.util.Scanner;

public class tarea03 {
    public static int findIndex(int arr[], int t)
    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Dime de que tamanio sera tu arreglo : ");
        int tama = read.nextInt();
        int [] my_array = new int[tama];
        for (int p=0; p<my_array.length;p++) {
            System.out.println("Introduce la posicion" + " "+  (p) + " " + "del arreglo ");
            my_array[p]= read.nextInt();
        }
        System.out.println("Dime que numero quieres buscar dentro del arreglo : ");
        int cont = read.nextInt();
        boolean check = Arrays.asList(my_array).contains(cont);
        if (check == true){

            System.out.println("El numero " + cont + " No esta en el arreglo ");
        }else if (check == false){

            System.out.println("El numero " + cont + " Se encuentra en el arreglo " + "Y se encuentra en posicion " + + findIndex(my_array, cont ));

        }
    }
}
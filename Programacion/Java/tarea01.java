package ejerciciosTarea;
import java.util.Arrays;
import java.util.Scanner;
public class tarea01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Dime de que tamanio sera tu arreglo : ");
        
            int tama = read.nextInt();

            int [] arreglo = new int[tama];
                for (int p=0; p<arreglo.length;p++) {
                    System.out.println("Introduce la posicion" + " "+  (p + 1) + " " + "del arreglo ");
                    arreglo[p]= read.nextInt();
                }
                            for (int prin: arreglo) {
                            System.out.println(prin);
                            }
                                    System.out.println( "El arreglo es : " + Arrays.toString(arreglo));
    }
    
}

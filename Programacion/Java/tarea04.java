package ejerciciosTarea;

import java.util.Scanner;

public class tarea04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Dime de que tamanio sera tu arreglo en x : ");
        int x = read.nextInt();
        System.out.println("Dime de que tamanio sera tu arreglo en y : ");
        int y = read.nextInt();
        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Inserte el valor en cartesiano " + "(X" +( i+1 )+ "," +  " Y" + (j + 1 ) + ")");
                matrix[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        }
    }

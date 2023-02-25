/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        pila obj = new pila();
        int opc=0;
        JOptionPane.showMessageDialog(null, "Bienvenido el examen de pilas : David Leon Salas ");

        do {

            // Se llama el menu para el usuario.

            opc = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar dato \n 2.Eliminar dato \n 3.Mostrar pila \n 4.Cerrar pila \n 5.Cerrar programa"));

            //Switch en caso de que la seleccion se llamara a cada uno de los metedos de pila
            switch (opc) {

                case 1:obj.push();break;

                case 2:obj.pop();break;

                case 3:obj.mostrar_pila();break;

                default:System.exit(0);break;
            }// fin del sw


        } while (opc!=4);






    }

}

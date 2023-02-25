    import javax.swing.*;
    import java.util.Arrays;
    import java.util.Scanner;

    /**
     *
     * @author PC
     */
    public class pila {

        Scanner leer = new Scanner(System.in);
        int pila[] = new int [5];
        int pilaacomodada[]  = new int [5];
        int tope = -1;



        //METODO PARA INSERTAR UN DATO A LA PILA
        public void push(){

            if(tope == pila.length-1) {
                JOptionPane.showMessageDialog(null, "La pila se encuentra llena\n");
                }

            else{
                tope+=1;
                pila[tope] = Integer.parseInt(JOptionPane.showInputDialog("Inserte dato\n"));

            }

        }

        public void pop(){

            if(tope == -1) {
                JOptionPane.showMessageDialog(null, "La pila se encuentra vacia\n");
            }

            else{
                pila[tope] = 0;
                JOptionPane.showMessageDialog(null, "Se elimino un dato de la pila\n");

                tope-=1;
            }

        }


        public void mostrar_pila(){

            for(int i=tope;i>-1;i--){
                pilaacomodada[i] = pila[i];


            }
            JOptionPane.showMessageDialog(null, Arrays.toString(pilaacomodada));


        }



    }
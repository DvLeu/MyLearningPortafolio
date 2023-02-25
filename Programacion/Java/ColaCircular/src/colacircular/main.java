package colacircular;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        Scanner leer =new Scanner(System.in);
        int opc=0;
        boolean seguir=true;

        //Lectura del tamano de la cola
        
        System.out.println("Bienvenido a la cola circular dinamica]");
        System.out.println("Porfavor inserte un tamanio de para la cola");
        colarcircular obj = new colarcircular(leer.nextInt());
       
        
        // MENU DE OPCIONES PARA LA COLA
        
        do { 
        System.out.println("Elija una opcion a realizar...");
        System.out.println("1.Agregar Dato a la cola \n 2.Borrar Dato en la cola \n 2.Borrar Dato en la cola \n 3.Llenado pre-realizado para demostracion \n 4.Cerrar");

        
        opc = leer.nextInt();
        
        switch(opc) {
            case 1:
                System.out.println("Inserte el valor que desea agregar");
                obj.agregarDato(leer.nextInt());
                obj.mostrarCola(); 
                break;
                
            case 2:
                obj.eliminarDato();
                obj.mostrarCola();                 
                break;
            case 3:
                  obj.agregarDato(1);
                  obj.agregarDato(2);
                  obj.agregarDato(3);
                  obj.agregarDato(4);
                  obj.agregarDato(5);
                  obj.agregarDato(6);
                  obj.agregarDato(7);
                  obj.agregarDato(8);
                  obj.eliminarDato();
                  obj.agregarDato(9);
                  obj.eliminarDato();
                  obj.eliminarDato();
                  obj.eliminarDato();
                  obj.agregarDato(10);
                  obj.agregarDato(11);
                  obj.agregarDato(12);
                  obj.mostrarCola();           
                break;
            case 4:
                System.out.println("END");
                seguir = false;                
                break;
            default:
                System.out.println("Opcion invalida");
        }
        
        } while (seguir==true);


    }// fin del main
    
}// fin de la clase

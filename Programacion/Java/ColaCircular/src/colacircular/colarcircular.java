
package colacircular;
public class colarcircular {
    
    private int tamano;
    private int posicionActual;
    private int posicionInicial;
    private int cola[];
    private int numeroDatos;

    // Constructor para inicializar los valores de la cola
    
    public colarcircular(int tamano){
    
    this.tamano = tamano;
    cola =new int[this.tamano];
    
    this.numeroDatos =0;
    this.posicionActual=0;
    this.posicionInicial=0;
    }
    
    public void agregarDato(int dato){
    
        if (!colaLlena()) {
                       
            cola[posicionActual] = dato;
            if (posicionActual<tamano-1) { posicionActual++;}
            else{posicionActual=0;}         
            
            numeroDatos++;
        }
        else{System.out.println("La cola se encuentra llena");}
    }
    
    public void eliminarDato(){
    
        if (!colaVacia()) {
            
            if (posicionInicial<tamano) {
                posicionInicial++;
            }
            else{posicionInicial=0;}
            System.out.println("Dato eliminado");
            numeroDatos--;
        }
    
        else{System.out.println("La cola se encuentra Vacia");}
    }
    
    
    
    private boolean colaVacia(){return (numeroDatos==0);}
    
    private boolean colaLlena(){return (numeroDatos==tamano);}
    
    
    
    public void mostrarCola(){
        
        if (posicionActual>posicionInicial) {
            
            for(int i=posicionInicial;i<=posicionActual;i++){
                System.out.println(cola[i]);
            }
            
        } else {
            
            for(int i = posicionInicial;i<tamano;i++){System.out.println(cola[i]);}
            for(int i =0;i<+posicionActual;i++){System.out.println(cola[i]);}
            
        }
        
        
        System.out.println("-------------------------------------------------");
    }

}

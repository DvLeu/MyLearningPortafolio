#include<iostream>
using namespace std;

int main(){
    int numero, dato = 5;
    cout<<"Digite un numero : ";
    cin>>numero;

    // == Es para comprobar si es exactamente igual en comparacion
    // != Es para comprobar si es diferente a ___
    // > mayor que
    // < menor que 
    // El else pued ser definido como el caso contrario al if sin decision 
    if (numero != dato) 
    {
        cout<<"El numero es diferente a  5 ";
    }else{
        cout<<"El numero es 5";
    }
    
    return 0;
}
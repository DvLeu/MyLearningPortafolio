
#include<iostream>
using namespace std;
int main(){
    //Declaracion de variables todas de tipo int 
    int n1,n2, suma = 0, resta = 0, multiplicacion = 0;
    cout<<"Dime tu numero 1 : ";
    cin>>n1;
    cout<<"Dime tu numero 1 : ";
    cin>>n2;
    //Operaciones Aritmeticas realizadas
    //suma
    suma = n1 + n2 ;
    //resta
    resta = n1 - n2;
    //multiplicacion 
    multiplicacion = n1 * n2;
    //Impresiones de cada uno de las operaciones 
    cout<<"\n suma : "<<suma;
    cout<<"\n resta : "<<resta;  
    cout<<"\n multiplicacion : "<<multiplicacion;



    return 0;

}
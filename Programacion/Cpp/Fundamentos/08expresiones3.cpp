#include<iostream>
using namespace std;
int main(){
float practica, teorica, participacion, notafinal = 0;
    cout<<"Digite practica : "; cin>>practica;
    cout<<"Digite teorica : "; cin>>teorica;
    cout<<"Digite participacion : "; cin>>participacion;
    //reutilizar variables

    practica *= 0.30; //practica = practica*0.30;
    teorica *= 0.60;
    participacion *= 0.10;
    //suma de variables 
    notafinal = practica+participacion+teorica;
    cout<<"\nLa nota final es "<<notafinal;


    return 0;
}
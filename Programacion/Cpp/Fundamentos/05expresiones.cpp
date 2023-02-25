#include<iostream>
using namespace std;
int main(){
    //Declarar la variables 
    float a, b , resultado=0;
    cout<<"Digite a : "; cin>>a;
    cout<<"Digite b : "; cin>>b;
    //Operaciones aritmeticas
    resultado = (a/b) + 1;
    //Quitar decimales
    cout.precision(2);
    cout<<"\n El resultado es "<<resultado<<endl;




    return 0;

}
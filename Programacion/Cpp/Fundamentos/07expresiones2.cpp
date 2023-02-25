#include<iostream>
using namespace std;

int main(){
    //Declarar variables 
    float a, b, c, d ,e , f, resul = 0;
    cout<<"Digite a : "; cin>>a;
    cout<<"Digite b : "; cin>>b;
    cout<<"Digite c : "; cin>>c;
    cout<<"Digite d : "; cin>>d;
    cout<<"Digite e : "; cin>>e;
    cout<<"Digite f : "; cin>>f;
    //expresion 
    resul = (a + (b/c))/ (d + (e/f));
    //quitar decimales 
    cout.precision(2);
    //Impresion de resultado
    cout<<"\n El resultado es "<<resul<<endl;
    return 0;

}
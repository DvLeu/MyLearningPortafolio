#include<iostream>
using namespace std;
int main(){
    int x,y,aux;
    cout<<"Digite x : "; cin>>x;
    cout<<"Digite y : "; cin>>y;
    /*
    Explicacion grafica 

    x = 10 ---> y = 10
    y = 5 --- > x = 5
    */
   aux = x;
   x = y;
   y = aux;
   cout<<"\n El nuevo valor de x es "<<x<<endl;
   cout<<"\n El nuevo valor de y es "<<y<<endl;



    return 0;

}
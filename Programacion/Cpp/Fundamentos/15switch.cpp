#include<iostream>
using namespace std;
int main(){
    int numero;
     cout<<"Digitar numero entre 1-5 : ";
     cin>>numero;
     //Declaracion de switch
     switch (numero){
     case 1:  cout<<"Es el numero 1 "; break;//Break es para romper y que solo se imprima este caso
     case 2:  cout<<"Es el numero 2 "; break;
     case 3:  cout<<"Es el numero 3 "; break;
     case 4:  cout<<"Es el numero 4 "; break;
     case 5:  cout<<"Es el numero 5 "; break;
     //Default todo fuera del switch y no dentro de los casos.
     default: cout<<"No esta en el rango de 1 - 5"; break;
     }

    return 0;
}
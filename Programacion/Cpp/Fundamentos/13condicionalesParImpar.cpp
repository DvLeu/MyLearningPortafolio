#include<iostream>
using namespace std;
int main(){
    int numero;
    cout<<"Digitar un numero ";
    cin>>numero;
    if (numero == 0)
    {
        cout<<"El numero es 0 ";
    }
    else if (numero%2==0)//Divide numero entre dos y sacar residuo de la divison
    {
        cout<<"Numero Par ";
    }else{
        cout<<"Numero impar ";
    }
    

    return 0;
}
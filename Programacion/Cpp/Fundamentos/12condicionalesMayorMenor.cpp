#include <iostream>
using namespace std;
int main()
{
    int n1, n2;
    cout << "Digite 2 numeros ";
    cin >> n1 >> n2; // Guardar n1 y n2

    if (n1 == n2) //== igual 
    {
        cout << "Ambos numeros son iguales: " << n1;
    }
    else if (n1 > n2) // n1 mayor que n2 
    {
        cout << "El mayor es: " << n1;
    }
    else //n2 mayor que n1 
    {
        cout << "El mayor es: " << n2;
    }

    return 0;
}
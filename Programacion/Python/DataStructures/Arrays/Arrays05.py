#Para eliminar elementos
# de un array, se puede utilizar el
# método pop() con un índice como argumento:

import array as arr

# Crear un array de enteros con valores iniciales
my_array = arr.array('i', [1, 2, 3, 4, 5])

# Eliminar el segundo elemento del array
my_array.pop(1)

# Imprimir el array completo
print(my_array)  # salida: array('i', [1, 3, 4, 5])
#Prueba New UI PYCHARM
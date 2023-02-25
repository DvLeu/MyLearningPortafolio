#También se pueden modificar los elementos del array utilizando su índice:


import array as arr

# Crear un array de enteros con valores iniciales
my_array = arr.array('i', [1, 2, 3, 4, 5])

# Modificar el segundo elemento del array
my_array[1] = 10

# Imprimir el array completo
print(my_array)  # salida: array('i', [1, 10, 3, 4, 5])

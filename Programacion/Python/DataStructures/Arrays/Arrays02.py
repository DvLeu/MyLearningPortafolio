#En este ejemplo,
# 'i' indica que los elementos del array
# serán enteros. Otras opciones incluyen 'f' para números de punto flotante y 'b' para bytes.\
#También se puede crear un array con valores iniciales utilizando una lista como argumento:


import array as arr

# Crear un array de enteros con valores iniciales
my_array = arr.array('i', [1, 2, 3, 4, 5])

# Imprimir el array completo
print(my_array)  # salida: array('i', [1, 2, 3, 4, 5])

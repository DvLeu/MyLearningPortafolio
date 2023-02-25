#En Python, un array se puede implementar utilizando
# la biblioteca incorporada de array.
# Aquí hay un ejemplo de cómo crear
# un array de enteros y agregar elementos:
import array as arr

# Crear un array de enteros vacío
my_array = arr.array('i')

# Agregar elementos al array
my_array.append(1)
my_array.append(2)
my_array.append(3)
my_array.append(4)
my_array.append(5)

# Imprimir el array completo
print(my_array)  # salida: array('i', [1, 2, 3, 4, 5])



my_list = [] #Creacion de una lista vacia.


#Lista con elementos :
numbers = [1, 2, 3, 4, 5]
fruits = ['manzana', 'banana', 'naranja', 'pera']
mixed = [1, 'hola', True, 3.14, ['otra', 'lista']]


# Acceder a los elementos de una lista mediante su índice (los índices comienzan en 0):
numbers = [1, 2, 3, 4, 5]
print(numbers[0]) # 1
print(numbers[2]) # 3

#Modificar un elemento de la lista mediante su índice:
numbers = [1, 2, 3, 4, 5]
numbers[2] = 10
print(numbers) # [1, 2, 10, 4, 5]


#Agregar elementos a la lista al final:
numbers = [1, 2, 3, 4, 5]
numbers.append(6)
print(numbers) # [1, 2, 3, 4, 5, 6]


#Agregar elementos a la lista en una posición específica:
numbers = [1, 2, 3, 4, 5]
numbers.insert(2, 10)
print(numbers) # [1, 2, 10, 3, 4, 5]



#Eliminar el último elemento de la lista:

numbers = [1, 2, 3, 4, 5]
numbers.pop()
print(numbers) # [1, 2, 3, 4]


#Eliminar un elemento de la lista mediante su índice:
numbers = [1, 2, 3, 4, 5]
numbers.pop(2)
print(numbers) # [1, 2, 4, 5]


#Ordenar una lista:
numbers = [3, 5, 1, 4, 2]
numbers.sort()
print(numbers) # [1, 2, 3, 4, 5]


#Obtener la longitud de una lista:
numbers = [1, 2, 3, 4, 5]
print(len(numbers)) # 5

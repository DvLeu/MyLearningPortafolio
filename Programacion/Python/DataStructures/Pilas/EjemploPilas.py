#Crear una pila vacía:
stack = []

#Agregar elementos a la pila:
stack.append(1)
stack.append(2)
stack.append(3)
print(stack) # [1, 2, 3]


#Eliminar el elemento superior de la pila:
stack = [1, 2, 3]
stack.pop()
print(stack) # [1, 2]

#Acceder al elemento superior de la pila sin eliminarlo:
stack = [1, 2, 3]
top_element = stack[-1]
print(top_element) # 3


#Verificar si la pila está vacía:
stack = []
if not stack:
    print("La pila está vacía")


#Obtener el tamaño de la pila:
stack = [1, 2, 3]
size = len(stack)
print(size) # 3

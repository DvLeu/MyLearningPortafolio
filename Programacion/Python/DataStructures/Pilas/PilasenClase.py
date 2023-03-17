
#Implementar una pila mediante una clase en Python:


class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return not bool(self.items)

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[-1]

    def size(self):
        return len(self.items)


#En este ejemplo, la clase Stack tiene los métodos
# necesarios para agregar y eliminar elementos de la pila,
# verificar si está vacía, obtener el tamaño y acceder al elemento superior sin eliminarlo.
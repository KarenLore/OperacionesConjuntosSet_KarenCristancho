# 🚀 Taller de Programación en Java: Uso de Set

## Ejercicio 4: Operaciones con Conjuntos

### 📌 Descripción
Este programa en Java permite al usuario ingresar dos conjuntos de números enteros y realizar operaciones como la unión, intersección y diferencia entre ellos utilizando `HashSet`.

### 🛠️ Tecnologías utilizadas
- Java
- Scanner para entrada de usuario
- HashSet para almacenamiento y manipulación de conjuntos

### 📋 Funcionalidades
1. El usuario ingresa la cantidad de elementos para dos conjuntos y luego los números correspondientes.
2. Los números son almacenados en dos `HashSet<Integer>`.
3. Se calculan y muestran las siguientes operaciones:
   - **Unión:** Combina ambos conjuntos sin duplicados.
   - **Intersección:** Muestra los elementos comunes en ambos conjuntos.
   - **Diferencia:** Muestra los elementos que están en el primer conjunto pero no en el segundo.

### 🚀 Ejecución del programa
Para ejecutar el programa, sigue estos pasos:
1. Compila el archivo `OperacionesConjuntos.java`:
   ```bash
   javac OperacionesConjuntos.java
   ```
2. Ejecuta el programa:
   ```bash
   java OperacionesConjuntos
   ```
3. Ingresa los datos solicitados y observa los resultados de las operaciones con conjuntos.

### 📌 Ejemplo de ejecución
#### Entrada:
```
Ingrese la cantidad de elementos del primer conjunto: 3
Ingrese los números:
1
2
3
Ingrese la cantidad de elementos del segundo conjunto: 3
Ingrese los números:
2
3
4
```

#### Salida esperada:
```
Primer conjunto: [1, 2, 3]
Segundo conjunto: [2, 3, 4]

Unión: [1, 2, 3, 4]
Intersección: [2, 3]
Diferencia (Conjunto 1 - Conjunto 2): [1]
```

### 📌 Notas adicionales
- `HashSet` no mantiene el orden de los elementos.
- Se garantiza que los conjuntos no contengan elementos duplicados.

---
✍️ **Autor:** 
**Karen Cristancho**


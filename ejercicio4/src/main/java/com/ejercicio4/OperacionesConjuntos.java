// Taller de Programación en Java: Uso de Set
// 🚀 Ejercicio 4: Operaciones con Conjuntos
package com.ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OperacionesConjuntos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Set<Integer> conjunto1 = new HashSet<>();
            Set<Integer> conjunto2 = new HashSet<>();

            // 1. Pedir al usuario dos conjuntos de números enteros.
            System.out.print("Ingrese la cantidad de elementos del primer conjunto: ");
            int cantidad1 = scanner.nextInt();
            System.out.println("Ingrese los números:");
            for (int i = 0; i < cantidad1; i++) {
                conjunto1.add(scanner.nextInt());
            }

            System.out.print("Ingrese la cantidad de elementos del segundo conjunto: ");
            int cantidad2 = scanner.nextInt();
            System.out.println("Ingrese los números:");
            for (int i = 0; i < cantidad2; i++) {
                conjunto2.add(scanner.nextInt());
            }

            // 2. Almacenar los números en dos HashSet<Integer> .
            System.out.println("\nPrimer conjunto: " + conjunto1);
            System.out.println("Segundo conjunto: " + conjunto2);

            // 3. Calcular y mostrar la unión
            Set<Integer> union = new HashSet<>(conjunto1);
            union.addAll(conjunto2);
            System.out.println("\nUnión: " + union);

            // 3. Calcular y mostrar la intersección
            Set<Integer> interseccion = new HashSet<>(conjunto1);
            interseccion.retainAll(conjunto2);
            System.out.println("Intersección: " + interseccion);

            // 3. Calcular y mostrar la diferencia (conjunto1 - conjunto2)
            Set<Integer> diferencia = new HashSet<>(conjunto1);
            diferencia.removeAll(conjunto2);
            System.out.println("Diferencia (Conjunto 1 - Conjunto 2): " + diferencia);
        }
    }
}

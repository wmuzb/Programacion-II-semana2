package com.mycompany.registrar_notas;

import java.util.Scanner;

public class Registrar_Notas {

// Función para calcular el promedio de tres notas
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Función booleana que determinar si el estudiante aprueba
    public static boolean Aprobado(double promedio) {
        return promedio >= 61;
    }

    // Procedimiento para mostrar el resumen de estudiantes
    public static void Resumen(String[] nombres, double[] promedios, String[] estados, int total) {
        System.out.println("\nResumen de estudiantes:");
        System.out.println("------------------------");
        //se realiza el contador
        for (int i = 0; i < total; i++) {
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Promedio: " + promedios[i]);
            System.out.println("Estado: " + estados[i]);
            System.out.println(); // Línea en blanco para separar
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar cantidad de estudiantes no mayor a 5
        System.out.print("Ingrese la cantidad de estudiantes (máximo 5): ");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        if (cantidad < 1 || cantidad > 5) {
            System.out.println("Debe Ingresar entre 1 y 5 estudiantes.");
            return;
        }

        // Declaración de arreglos
        String[] nombres = new String[cantidad];
        double[] promedios = new double[cantidad];
        String[] estados = new String[cantidad];

        // Ciclo para ingresar datos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i + 1));

            System.out.print("Nombre: ");
            nombres[i] = entrada.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = entrada.nextDouble();
            entrada.nextLine(); // Limpiar buffer

            double promedio = calcularPromedio(nota1, nota2, nota3);
            promedios[i] = promedio;
            estados[i] = Aprobado(promedio) ? "Aprobado" : "No aprobado";
        }

        // Mostrar resumen
        Resumen(nombres, promedios, estados, cantidad);

        entrada.close();
    }
}



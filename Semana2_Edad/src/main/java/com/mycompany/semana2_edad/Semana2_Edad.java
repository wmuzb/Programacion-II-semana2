
package com.mycompany.semana2_edad;

import java.util.Scanner; // Importamos la clase Scanner para leer datos del usuario

public class Semana2_Edad {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese su nombre: "); //Se solicita ingreso de nombre
      String nombre = scanner.nextLine();
      
      System.out.print("Ingrese su año de nacimiento: "); //Se solicita ingresar el año de nacimiento.
        int añonacimiento = scanner.nextInt(); //variable del año de nacimiento
        int edad = 2025 - añonacimiento; //Se realiza la funcion para concer la edad
        
        System.out.println("Hola " + nombre + ", su edad aproximada es de: " + edad + " años."); //Se imprime el resultado de los datos

        scanner.close();
        
  
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo4ejercicio4;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo4ejercicio4 {
    public static void mostrarDatos(String nombre, int edad){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese el nombre: " );
    String nombre = teclado.nextLine();
    System.out.println("Ingrese la edad: ");
    int edad = teclado.nextInt();
    
    mostrarDatos(nombre,edad);
    
    }
    
}

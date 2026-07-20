/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo4ejercicio5;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo4ejercicio5 {
    public static void operaciones(double a, double b){
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b ));
     
    }

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese el primer numero");
    double a = teclado.nextInt();
    System.out.println("Ingrese el segundo numero");
    double b = teclado.nextInt();
    operaciones(a, b);
    }
    
}

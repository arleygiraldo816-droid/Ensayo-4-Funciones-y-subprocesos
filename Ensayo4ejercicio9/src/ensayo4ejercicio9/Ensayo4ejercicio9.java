/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo4ejercicio9;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo4ejercicio9 {
    public static double calcularPromedio(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese el primer numero");
    double n1 = teclado.nextDouble();
    System.out.println("Ingrese el segundo numero");
    double n2 = teclado.nextDouble();
    System.out.println("Ingrese el tercer numero");
    double n3 = teclado.nextDouble();
    double promedio = calcularPromedio(n1, n2, n3);
    System.out.println("El promedio es: " + promedio);
    if (promedio >= 7){
        System.out.println("El estudiante aprobo");
    } else{
        System.out.println("El estudiante no aprobo");
    }
    }
    
}

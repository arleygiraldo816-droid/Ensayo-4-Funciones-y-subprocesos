/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayoejercicio8;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayoejercicio8 {
    public static double calcularArea(double base, double altura){
        return base*altura;  
    }
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese la base: ");
    double base = teclado.nextDouble();
    System.out.println("Ingrese la altura: ");
    double altura = teclado.nextDouble();
    double area = calcularArea(base, altura);
    System.out.println("La area es: " + area);
    }
    
}

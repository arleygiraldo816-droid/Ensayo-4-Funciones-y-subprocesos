/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo4ejercicio11;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo4ejercicio11 {
    public static boolean esPar (int numero){
        return numero % 2 == 0;
        }
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese un numero");
    int numero = teclado.nextInt();
    boolean resultado = esPar(numero);
    if (resultado){
        System.out.println("EL numero es par");
    } else {
        System.out.println("EL numero es impar");
    }
    }
}

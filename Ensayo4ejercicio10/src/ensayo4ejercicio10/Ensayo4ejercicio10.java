/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo4ejercicio10;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Scanner;
public class Ensayo4ejercicio10 {
    public static int mayor(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingresa el primer numero");
    int a = teclado.nextInt();
    System.out.println("Escribe el segundo numero");
    int b = teclado.nextInt();
    int numMayor = mayor(a, b);
    System.out.println("El numero mayor es: " + numMayor );
    }
    
}

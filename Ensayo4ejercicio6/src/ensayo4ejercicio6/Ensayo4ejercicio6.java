/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensayo4ejercicio6;

/**
 *
 * @author Arley Giraldo
 */
import java.util.Random;
public class Ensayo4ejercicio6 {
    public static int obtenernumero(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(100) + 1;
        
    }

    public static void main(String[] args) {
    int numero = obtenernumero();
    System.out.println("Numero: " + numero);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Richa
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    entrada.useLocale(Locale.US);
    
    double x;
    double y;
    
    System.out.println("Ingrese el valor de X");
    x = entrada.nextDouble();
    
    System.out.println("Ingrese el valor de Y");
    y = entrada.nextDouble();
    
    if (x>0 && y>0) {
        System.out.println("cuadrante 1");
    }
    if (x>0 && y<0) {
        System.out.println("cuadrante 2");
    }
    if (x<0 && y<0) {
        System.out.println("cuadrante 3");
    }
    if (x<0 && y>0) {
        System.out.println("cuadrante 4");
    }
    
    }
 
}

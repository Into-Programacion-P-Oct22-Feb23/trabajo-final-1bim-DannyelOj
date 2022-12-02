/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Richa
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    entrada.useLocale(Locale.US);
    
    int a;
    int b;
    int c;
    
    System.out.println("Ingrese el primer numero");
    a = entrada.nextInt();
    
    System.out.println("Ingrese uel segundo numero");
    b = entrada.nextInt();
    
    System.out.println("Ingrese el tercer numero");
    c = entrada.nextInt();
    
    if (a == b || a == c) {
        
        System.out.println("Error: los datos son iguales");
    }else{
        if (b == c && b == c) {
            System.out.println("Error: los datos son iguales");
        }
    }
    if (a>b && a>c){
        System.out.println(a);    
    }
    if (b>a && b>c){
        System.out.println(b);    
        
    }
    if (c>a && c>b){
        System.out.println(c);           
    }
    
    }
    
     
    
    
}

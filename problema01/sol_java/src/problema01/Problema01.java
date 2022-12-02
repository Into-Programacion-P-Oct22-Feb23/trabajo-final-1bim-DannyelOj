/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Richa
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    entrada.useLocale(Locale.US);
        
    double anguloA;
    double anguloB;
    double anguloC;
    
    System.out.println("Ingrese el primer angulo");
    anguloA = entrada.nextDouble();
    
    System.out.println("Ingrese el segundo angulo");
    anguloB = entrada.nextDouble();
    
    System.out.println("Ingrese el tercer angulo");
    anguloC = entrada.nextDouble();
    
    if (anguloA == 90){
        System.out.println("Triangulo rectangulo");
           
    }
    else{
        
        if(anguloB > 90 && anguloC < 180){
           System.out.println("Triangulo Obtuso"); 
        }
        else {
            System.out.println("Triangulo Acutangulo");
        }
    } 
    }
    
    }
   

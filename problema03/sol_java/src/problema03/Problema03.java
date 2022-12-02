/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Richa
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int tipoEmpleado;
        double horasTrabajadas;
        double total = 0;
        
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas = entrada.nextDouble();
        
        System.out.println("Ingrese el tipo de empleado");
        tipoEmpleado = entrada.nextInt();
        
        if (tipoEmpleado == 1){
            total = horasTrabajadas * 1.5;
        }else{
            if (tipoEmpleado == 2){
                total = horasTrabajadas * 2;
            }else{
                if(tipoEmpleado == 3){
                    total = horasTrabajadas * 2.5;
                }else{
                    if(tipoEmpleado == 4){
                        total = horasTrabajadas * 3;
                    }
                }
            }
        }
        System.out.println("-------------------------------------");
        System.out.printf("El sueldo a pagar es:%.1f\n", total);
    }
    
}


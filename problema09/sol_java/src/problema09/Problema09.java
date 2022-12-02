/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Richa
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int positivos = 0;
        int terminoPos = 12;
        int negativos = 0;
        int terminoNeg = -11;
        int contador = 1;
        int numero;
        String mensaje = "";
        String serie = "S1 = 12-11+24-22+36-33+48-44";
        
        System.out.print("""
                         Ingrese el numero de terminos que imprimir:
                         """ + serie + "\n--> ");
        numero = entrada.nextInt();

        if (numero <= 8) {
            while (contador <= numero) {
                if (numero == 1) {
                    mensaje = mensaje + terminoPos;
                } else if (contador % 2 == 1) {
                    positivos = positivos + terminoPos;
                    mensaje = mensaje + "+" + Integer.toString(positivos);
                } else if (contador % 2 == 0) {
                    negativos = negativos + terminoNeg;
                    mensaje = mensaje + Integer.toString(negativos);
                }
                contador = contador + 1;
            }
        } else {
            System.out.println("El numero ingresado exede el limite de "
                    + "datos de la serie.");
        }
        System.out.println(mensaje);

    }

}
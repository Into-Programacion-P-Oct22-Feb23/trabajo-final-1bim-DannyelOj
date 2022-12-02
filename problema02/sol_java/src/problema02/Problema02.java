/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Richa
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int trajes;
        double unitario;
        double subTotal = 0;
        double total = 0;
        double descuento = 0;
        String mensaje = "";
        System.out.println("Ingrese la cantidad de trajes");
        trajes = entrada.nextInt();
        System.out.println("Ingrese el precio unitario del traje");
        unitario = entrada.nextDouble();
        if (trajes == 1) {
            subTotal = unitario * trajes;
            descuento =  unitario * 0.20;
            total = subTotal - descuento;
        } else {
            if (trajes == 2) {
                descuento = 0.25;
                subTotal = unitario * trajes;
                descuento =  unitario * 0.25;
                total = subTotal - descuento;
            } else {
                if (trajes == 3) {
                    descuento = 0.40;
                    subTotal = unitario * trajes;
                    descuento =  unitario * 0.40;
                    total = subTotal - descuento;
                } else {
                    if (trajes > 3) {
                        descuento = 0.50;
                        subTotal = unitario * trajes;
                        descuento =  unitario * 0.50;
                        total = subTotal - descuento;
                    }
                }
            }
        }
        System.out.println("------------------------------");
        System.out.printf("""
                          Trajes comprados:%d
                          El precio unitario es de:%.1f
                          Subtotal:%.1f
                          Descuento:%.1f
                          Total:%.1f
                          """, trajes, unitario, subTotal, 
                          descuento, total);
    }
}

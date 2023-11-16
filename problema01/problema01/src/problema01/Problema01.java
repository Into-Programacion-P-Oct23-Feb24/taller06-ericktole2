/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double numero1;
        double numero2;
        double resultado;
        String operacion;

        System.out.println("que tipo de operacion quieres");
        operacion = entrada.nextLine();

        operacion = operacion.toLowerCase();

        System.out.println("Ingrese el numero 1 ");
        numero1 = entrada.nextDouble();

        System.out.println("Ingrese el numero 2 ");
        numero2 = entrada.nextDouble();

        if (numero1 > numero2) {
            switch (operacion) {
                case "+":
                    resultado = numero1 + numero2;
                    System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                    break;
                default:
                    //System.out.println("opcion incorrecta");

                    switch (operacion) {
                        case "-":
                            resultado = numero1 - numero2;
                            System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                            break;
                        default:
                            //System.out.println("opcion incorrecta");

                            switch (operacion) {
                                case "/":
                                    resultado = numero1 / numero2;
                                    System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                                    break;
                                default:
                                    //System.out.println("opcion incorrecta");

                                    switch (operacion) {
                                        case "*":
                                            resultado = numero1 * numero2;
                                            System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                                            break;
                                        default:
                                        
                                    }
                            }

                    }

            }
        }else{ 
             System.out.printf("El resultado es incorrecto");
            
        }
    }
}

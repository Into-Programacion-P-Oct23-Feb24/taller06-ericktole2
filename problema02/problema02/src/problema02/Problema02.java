/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double tipo1;
        double tipo2;
        double tipo3;
        double tipo4;
        double resultado;
        double comision;
        double valor;
        String operacion;

        System.out.println(" Que tipo de veiculo tiene. \n1: vehículo "
                + "liviano particular\n"
                + "2: vehículo grande particular\n"
                + "3: taxi\n"
                + "4: bus urbano");
        System.out.println("Que tipo de veiculo tienes");
        operacion = entrada.nextLine();

        System.out.println("Cual es el valor de su veivulo");
        valor = entrada.nextDouble();

        switch (operacion) {
            case "1":
                comision = (valor * 0.01) / 100;
                resultado = comision + 2;
                System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                break;
            default:
                switch (operacion) {
                    case "2":
                        comision = (valor * 0.02) / 100;
                        resultado = comision + 2.5;
                        System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                        break;
                    default:
                        switch (operacion) {
                            case "3":
                                comision = (valor * 0.04) / 100;
                                resultado = comision + 1.5;
                                System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                                break;
                            default:
                                switch (operacion) {
                                    case "4":
                                        comision = (valor * 0.05) / 100;
                                        resultado = comision + 2.2;
                                        System.out.printf("El resultado de la operacion es:%.2f\n", resultado);
                                        break;
                                    default:

                                }

                        }

                }
        }
    }
}

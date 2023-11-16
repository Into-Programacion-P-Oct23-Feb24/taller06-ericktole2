/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema3 {

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
        double tipo5;
        double resultado;
        double newsueldo;
        double sueldo;
        String operacion;
        String nombre;

        System.out.println("Cual es su nombre");
        nombre = entrada.nextLine();
        System.out.println("Que tipo de empleado es: 1,2 ,3, 4 o 5 ");
        operacion = entrada.nextLine();
        System.out.println("Cual es el sueldo que usted gana");
        sueldo = entrada.nextDouble();
        switch (operacion) {
            case "1":
                tipo1 = 1;
                resultado = (sueldo * 5) / 100;
                newsueldo = resultado + sueldo;

                System.out.printf("Empleado con nombre:\n%s\n "
                        + "Con tipo de empleo :\n%s\n Con un sueldo de:%.2f\n "
                        + "su incremento de sueldo es:\n%s\nSu nuevo sueldo es:%.2f", nombre,
                        tipo1, sueldo, resultado, newsueldo);
                break;
            default:
                switch (operacion) {
                    case "2":
                        tipo2 = 2;
                        resultado = (sueldo * 0.07) / 100;
                        newsueldo = resultado + sueldo;
                        System.out.printf("Empleado con nombre:\n%s\n "
                                + "Con tipo de empleo :\n%s\n Con un sueldo de:%.2f\n "
                                + "su incremento de sueldo es:\n%s\nSu nuevo sueldo es:%.2f", nombre,
                                tipo2, sueldo, resultado, newsueldo);
                        break;
                    default:
                }
                switch (operacion) {
                    case "3":
                        tipo3 = 3;
                        resultado = (sueldo * 9) / 100;
                        newsueldo = resultado + sueldo;

                        System.out.printf("Empleado con nombre:\n%s\n "
                                + "Con tipo de empleo :\n%s\n Con un sueldo de:%.2f\n "
                                + "su incremento de sueldo es:\n%s\nSu nuevo sueldo es:%.2f", nombre,
                                tipo3, sueldo, resultado, newsueldo);
                        break;
                    default:
                }
                switch (operacion) {
                    case "4":
                        tipo4 = 4;
                        resultado = (sueldo * 12) / 100;
                        newsueldo = resultado + sueldo;

                        System.out.printf("Empleado con nombre:\n%s\n "
                                + "Con tipo de empleo :\n%s\n Con un sueldo de:%.2f\n "
                                + "su incremento de sueldo es:\n%s\nSu nuevo sueldo es:%.2f", nombre,
                                tipo4, sueldo, resultado, newsueldo);
                        break;
                    default:
                }
                switch (operacion) {
                    case "5":
                        tipo5 = 5;
                        resultado = (sueldo * 15) / 100;
                        newsueldo = resultado + sueldo;
                        System.out.printf("Empleado con nombre:\n%s\n "
                                + "Con tipo de empleo :\n%s\n Con un sueldo de:%.2f\n "
                                + "su incremento de sueldo es:\n%s\nSu nuevo sueldo es:%.2f", nombre,
                                tipo5, sueldo, resultado, newsueldo);
                        break;
                    default:
                }
        }

    }
}

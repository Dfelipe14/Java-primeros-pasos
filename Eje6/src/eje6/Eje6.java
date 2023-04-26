//Implementar un programa que le pida dos nÃºmeros enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.
package eje6;

import java.util.Scanner;

public class Eje6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese dos numeros enteros");

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        if (num1 < num2) {
            System.out.println("El mayor de los ingresados es: " + num2);
        } else {
            System.out.println("El mayor de los ingresados es: " + num1);

        }

    }

}

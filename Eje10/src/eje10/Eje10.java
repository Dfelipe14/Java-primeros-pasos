//Realizar un programa que lea 4 nÃºmeros (comprendidos entre 1 y 20) e imprima el nÃºmero
//ingresado seguido de tantos asteriscos como indique su valor.
package eje10;

import java.util.Scanner;

public class Eje10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, num1, num2, num3 = 0;

        System.out.println("Ingresar 4 numeros del 1 al 20");

        num = leer.nextInt();
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();

        System.out.println("");
        System.out.print(num);
        for (int i = 1; i <= num; i++) {
            System.out.print("* ");

        }
        System.out.println("");
        System.out.print(num1);
        for (int i = 1; i <= num1; i++) {
            System.out.print("* ");

        }
        System.out.println("");
        System.out.print(num2);
        for (int i = 1; i <= num2; i++) {
            System.out.print("* ");

        }
          System.out.println("");
        System.out.print(num3);
        for (int i = 1; i <= num3; i++) {
            System.out.print("* ");

        }
    }

}
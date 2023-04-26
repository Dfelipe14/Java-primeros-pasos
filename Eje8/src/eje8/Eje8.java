//Escriba un programa que valide si una nota estÃ¡ entre 0 y 10, sino estÃ¡ entre 0 y 10 la nota se
//pedirÃ¡ de nuevo hasta que la nota sea correcta.
package eje8;

import java.util.Scanner;

public class Eje8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int nota;
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = leer.nextInt();

        }
        System.out.println("Nota correcta");
    }

}

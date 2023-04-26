//Escribir un programa que pida una frase y la muestre toda en mayÃºsculas y despuÃ©s toda
//en minÃºsculas. Nota: investigar la funciÃ³n toUpperCase() y toLowerCase() en Java.

package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;
        System.out.println("Escribir una frase ");
        frase = leer.nextLine();

        frase = frase.toUpperCase();
        System.out.println("frase expresada en mayuscula:" + frase);

        frase = frase.toLowerCase();
        System.out.println("frase expresada en minuscula:" + frase);
    }

}


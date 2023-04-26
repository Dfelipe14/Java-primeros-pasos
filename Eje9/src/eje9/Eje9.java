//Escriba un programa que lea 20 nÃºmeros. Si el nÃºmero leÃ­do es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturÃ³ el numero cero". El programa deberÃ¡ calcular y mostrar el
//resultado de la suma de los nÃºmeros leÃ­dos, pero si el nÃºmero es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break.
package eje9;

import java.util.Scanner;

public class Eje9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num, suma;
        num = 0;
        suma = 0;
        do {
            System.out.println("Ingrese 20 numeros ");

            num = leer.nextInt();
            suma = suma + num;
        } while (num != 0);
        System.out.println("La suma de los numeros ingresado es; " + suma);
    }

}

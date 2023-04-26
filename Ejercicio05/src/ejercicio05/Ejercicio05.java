//Escribir un programa que lea un nÃºmero entero por teclado y muestre por pantalla el
//doble, el triple y la raÃ­z cuadrada de ese nÃºmero. Nota: investigar la funciÃ³n Math.sqrt().

package ejercicio05;

import java.util.Scanner;


public class Ejercicio05 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num1, Doble, Triple;
        Double Raiz;

        System.out.println("Ingresar un numero entero");
        num1 = leer.nextInt();

        Doble = num1 * 2;
        Triple = num1 * 3;
        Raiz = Math.sqrt(num1);

        System.out.println("Doble:"+Doble);
        
        
        System.out.println("Doble: " + (num1 * 2) + " Triple: " + (num1 * 3) + " Raiz 2: " + (Math.sqrt(num1)));
    }
    
}

//Crear un programa que dado un numero determine si es par o impar.

package ejercicio06;

import java.util.Scanner;


public class Ejercicio06 {


    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero entero");
        num1=leer.nextInt();
        
        if (num1%2==0) {
            System.out.println("Es Par");
        } else {
            System.out.println("No es Par");
        }
    }
    
}

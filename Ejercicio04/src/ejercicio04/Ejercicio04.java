//Dada una cantidad de grados centÃ­grados se debe mostrar su equivalente en grados
//Fahrenheit. La fÃ³rmula correspondiente es: F = 32 + (9 * C / 5).

package ejercicio04;

import java.util.Scanner;


public class Ejercicio04 {


    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
        int num1;
        
        float form;
        System.out.println("Ingresar una cantidad de grados Celsius que seran expresados en grados fahrenheit");
        
        num1=leer.nextInt();
        
        form= 32+(9*num1/5);
        
        System.out.println("El valor es: " +form);
    }
    
}

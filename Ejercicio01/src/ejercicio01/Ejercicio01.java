
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos nÃºmeros enteros por teclado y calcule la suma de lo
        //dos. El programa deberÃ¡ despuÃ©s mostrar el resultado de la suma
        Scanner leer=new Scanner(System.in);
        int num1=0,num2=0, suma=0;
        float a;
        String b;
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt();
     
        System.out.println("Ingrese el segundo");
        num2=leer.nextInt();
        System.out.println("Suma Sin usar la variable SUMA: "+(num1+num2));
        suma=num1+num2;
        System.out.println("SUMA(variable)"+suma);       
        
    } 
 } 
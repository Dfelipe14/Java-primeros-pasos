//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
Scanner leer=new Scanner (System.in);
        
String nombre;
        System.out.println("Ingrese el nombre");
        nombre=leer.nextLine();
        
        System.out.println("El nombre es: " +nombre);
    }
    
}

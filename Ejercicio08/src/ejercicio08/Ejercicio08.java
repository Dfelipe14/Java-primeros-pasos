//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberÃ¡ de imprimir un mensaje por
//pantalla que diga â€œCORRECTOâ€�, en caso contrario, se deberÃ¡ imprimir â€œINCORRECTOâ€�.
//Nota: investigar la funciÃ³n Lenght() en Java.

package ejercicio08;

import java.util.Scanner;


public class Ejercicio08 {


    public static void main(String[] args) {
    
        
        Scanner leer=new Scanner(System.in);
    
        String frase;
        System.out.println("Solo puede ingresar frases o palabras de 8 caracteres de largo");
        
        frase=leer.nextLine();
        
        if (frase.length()==8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}

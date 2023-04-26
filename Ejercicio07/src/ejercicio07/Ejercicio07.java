//Crear un programa que pida una frase y si esa frase es igual a â€œeurekaâ€� el programa
//pondrÃ¡ un mensaje de Correcto, sino mostrarÃ¡ un mensaje de Incorrecto. Nota: investigar
//la funciÃ³n equals() en Java.

package ejercicio07;

import java.util.Scanner;


public class Ejercicio07 {


    public static void main(String[] args) {
    
        Scanner leer=new Scanner(System.in);
        
        String frase;
        
        System.out.println("Adivine la frase");
        
        frase=leer.nextLine();
        frase=frase.toLowerCase();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
    }
    
}

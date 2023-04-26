//Escriba un programa en el cual se ingrese un valor lÃ­mite positivo, y a continuaciÃ³n solicite
//nÃºmeros al usuario hasta que la suma de los nÃºmeros introducidos supere el lÃ­mite inicial.
package ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {

 
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        int limite,suma;
        System.out.println("Ingrese un valor limite");
        
        limite=leer.nextInt();
        suma=0;
                
        while(suma<=limite){
        System.out.println("Ingrese un numero");
        suma+=leer.nextInt();
            System.out.println("Suma "+suma);
    }
    }
    
}


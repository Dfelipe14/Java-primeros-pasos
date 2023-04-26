//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
//define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

package eje13;

import java.util.Scanner;


public class Eje13 {

    
    public static void main(String[] args) {
Scanner leer=new Scanner(System.in);

        int[] equipo;
        int num = 0;
        equipo= new int[num];

        System.out.println("Ingresar el tamaño del equipo");
        
        num=leer.nextInt();
        System.out.println("Nombres: ");
        
        for (int i = 0; i <= num; i++) {
            String nombre=leer.nextLine();
            
        }
    }
    
}

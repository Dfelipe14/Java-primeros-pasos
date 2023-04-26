//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dibujaremos un cuadrado ingresar la distancia por lados con un numero ");

        int num;
        num = leer.nextInt();
        if (num>0 && num<50) {

            //Parte Superior
            for (int i = 0; i <= num - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
            //Medio del cuadrado
            for (int i = 0; i < num-2; i++) {
                System.out.print("*");
               for (int j = 0; j <= num ; j++) {
                   System.out.print(" ");
                }
                System.out.println("*");
            }

            //Parte inferior
            for (int i = 0; i <= num - 1; i++) {
                System.out.print("* ");
                
            }
            
        }else
            System.out.println("Error, el tamaño va de 1 a 50");
    }
}

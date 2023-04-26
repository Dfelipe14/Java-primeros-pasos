package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        boolean bandera;
        String respuesta;
        bandera = true;
        do {
            System.out.println("Ingrese dos numeros enteros");

            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("Ingrese una opcion: ");
            System.out.println("1= Suma ");
            System.out.println("2= Resta ");
            System.out.println("3= Multiplicar ");
            System.out.println("4= Dividir ");
            System.out.println("5= Salir ");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("multiplicar: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("dividir: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("salir: ");
                    System.out.println("Desea confirmar salir ?\n presione S");
                    
                    respuesta=leer.next();
                    respuesta=respuesta.toLowerCase();
                    
                    if ("s".equals(respuesta)){ 
                         bandera = false;
                         System.out.println("");
                    } 

                    break;
            }
        } while (bandera);

    }
}

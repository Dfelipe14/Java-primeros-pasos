//Considera que estÃ¡s desarrollando una web para una empresa que fabrica motores (suponemos
//que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
//permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
//o Si el tipo de motor es 1, mostrar un mensaje indicando â€œLa bomba es una bomba de aguaâ€�.
//o Si el tipo de motor es 2, mostrar un mensaje indicando â€œLa bomba es una bomba de
//gasolinaâ€�.
//o Si el tipo de motor es 3, mostrar un mensaje indicando â€œLa bomba es una bomba de
//hormigÃ³nâ€�.
//o Si el tipo de motor es 4, mostrar un mensaje indicando â€œLa bomba es una bomba de pasta
//alimenticiaâ€�.
//o Si no se cumple ninguno de los valores anteriores mostrar el mensaje â€œNo existe un valor
//vÃ¡lido para tipo de bombaâ€�
package eje7;

import java.util.Scanner;

public class Eje7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;

        System.out.println("Ingresar el tipo de motor clasificado en numeracion del 1 a 4");

        numero = leer.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El tipo de motor 1: Es la bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("El tipo de motor 2: Es la bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("El tipo de motor 3: La bomba es una bomba de hormigÃ³n");
                break;
            case 4:
                System.out.println("El tipo de motor 4: La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor vÃ¡lido para tipo de bomba");
        }
    }

}

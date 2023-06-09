//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//vocales acentuadas) se mantienen sin cambios. 

//a=@ e=# i=$ o=% u=*

//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura “según” para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.


package ejerc11;

import java.util.Scanner;


public class Ejerc11 {

    public static void main(String[] args) {
        
         Scanner leer=new Scanner(System.in);
         
         System.out.println("ingresar una frase");
         
         String fraseVieja=leer.nextLine();
        
         reemplazoFrase(fraseVieja);
         
    }

    private static void reemplazoFrase(String fraseVieja) {
        int n=fraseVieja.length();
        String fraseNueva="";
        for(int i=0;i<n;i++){
            switch(fraseVieja.substring(i,i+1)){
                case "a":
                    fraseNueva+="@";
                    break;
                case "e":
                    fraseNueva+="#";
                    break;
                case "i":
                    fraseNueva+="$";
                    break;
                case "o":
                    fraseNueva+="%";
                    break;
                case "u":
                    fraseNueva+="*";
                    break;
                default:
                    fraseNueva+=fraseVieja.substring(i,i+1);
                    break;
                    
            }
            
        }
        System.out.println(fraseNueva);
    }
    
    
    
    }


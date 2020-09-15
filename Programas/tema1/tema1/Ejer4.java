//Pedir un número e indicar si es positivo o negativo.

package tema1;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        int num;
        Scanner numero=new Scanner (System.in);

        System.out.println("Introduce un número: ");
        num=numero.nextInt();
        
        if(num < 0)
             System.out.println("Negativo");
        else
            // suponemos que el 0 es positivo.
             System.out.println("Positivo");
         

    }
}
//Pedir el radio de un círculo y calcular su área.

package tema1;

public class Ejer2 {

    public static void main(String[] args) {
        double a,r; // área y radio
        
        System.out.print("Introduce el radio de un circulo: ");
        r=Entrada.real();
        
        a=Math.PI*(r*r); 
        System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
    }
}
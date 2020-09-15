//Pedir dos numeros y decir cual es mayor.

package tema1;

public class Ejer5 {
   public static void main(String[] args) {
    int n1,n2;
    
    System.out.print("Introduce un número: ");
    n1=Entrada.entero();
    System.out.print("Introduce otro número: ");
    n2=Entrada.entero();

    // si ambos números son iguales diría que n2 es mayor que n1
    if(n1>n2)
       System.out.println(n1 + " es mayor que " + n2);
    else
       System.out.println(n2 + " es mayor que " + n1);
        
    }
    
}
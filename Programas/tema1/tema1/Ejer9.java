//Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable, Sobresaliente.

package tema1;

public class Ejer9 {
    public static void main(String[] args) {
        int nota;
        System.out.print("Introduzca una nota: ");
        nota=Entrada.entero();
        
        if(nota>=0 && nota<5)
             System.out.println("INSUFICIENTE");
        else
             if(nota==5)
                 System.out.println("SUFICIENTE");
             else
                 if(nota==6)
                     System.out.println("BIEN");
                 else
                     if(nota==7 || nota==8)
                         System.out.println("NOTABLE");
                     else
                         if(nota==9 || nota==10 )
                             System.out.println("SOBRESALIENTE");
    }
    
}
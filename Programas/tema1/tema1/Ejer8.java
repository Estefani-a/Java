//Pedir un número entre 0 y 9.999, decir si es capicúa.

package tema1;

public class Ejer8 {
    public static void main(String[] args) {
        int num;
        int dm, um, c, d, u;
        
        // 9 9 . 9 9 9 a cada cifra la llamaremos:
        //dm um c d u: dm (decenas de millar), um:(unidades de millar)
        // c: (centenas), d: (decenas), u: (unidades)
        
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=Entrada.entero();
        
        // unidad
        u = num % 10;
        num = num / 10;
        
        // decenas
        d = num % 10;
        num = num / 10;
        
        // centenas
        c = num % 10;
        num = num / 10;
        
        // unidades de millar
        um = num % 10;
        num = num / 10;
        
        // decenas de millar
        dm = num;
        
        // el número será capicúa si las cifras son iguales dos a dos por los extremos
        
        if (dm == u && um == d)
             System.out.println ("el número es capicúa");
        else
             System.out.println ("el número NO es capicúa");
    }
    
}
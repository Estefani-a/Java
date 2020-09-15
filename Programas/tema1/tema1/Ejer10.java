//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que los meses tienen 30 días.

package tema1;

public class Ejer10 {
    public static void main(String[] args) {
        int dia,mes,año;
        
        System.out.print("Introduzca día: ");
        dia=Entrada.entero();
        System.out.print("Introduzca mes: ");
        mes=Entrada.entero();
        System.out.print("Introduzca año: ");
        año=Entrada.entero();
        
        if (dia >= 1 && dia <=30)
             if (mes >= 1 && mes <= 12)
                  if (año != 0)
                      System.out.println ("Fecha correcta");
                  else
                      System.out.println ("Año incorrecto");
             else
              System.out.println("Mes incorrecto");
        else
          System.out.println("Día incorrecto");
    }
}
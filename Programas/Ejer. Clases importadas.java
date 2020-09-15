package discos;
import java.util.Scanner;

/**
 * Disco digital para su uso por una companhia de 
 * "streamming". Se usa como ejemplo introductorio a 
 * algunos aspectos de Java.
 *
 * @author Elisa Viso.
 * @version 1.0, 09/11/15.
 */                           
public class Disco implements ServiciosDisco  {
  private static final short CD = 1;
  private static final short DVD = 2;
  private static final short BR = 3;
  private static final int ANHO1 = 1900; // Primer anho vÃ¡lido
  private static final int ANHOU = 2016; // Ultimo anho valido
  /* atributos de la clase */
  private final short TIPO_DISCO; // 1:CD, 2:DVD, 3:BR
  private final String NOMBRE;    // artista o pelicula
  private final int FECHA;        // fecha de grabacion
  private int permitidas;         // Maximo transmisiones permitidas
  private int activas;            // Transmisiones activas
  
  /** 
   * Constructor por omision. Interacciona con el usuario 
   * para pedirle los datos de inicializacion del disco.
   */
  public Disco()  {
    Scanner sc = new Scanner(System.in);  // Construccion del Scanner
    System.out.println("Que deseas grabar: "
                         + "(1) CD, (2) DVD, (3) BlueRay");
    System.out.print("Elige tipo de disco (1,2,3):--> ");
    TIPO_DISCO = (short)checaRangos(sc.nextShort(),CD,BR);
    sc.nextLine();
    System.out.print("Ahora dame " +
                       ( TIPO_DISCO == CD
                        ? "el nombre del cantante"
                        : TIPO_DISCO == DVD
                          ? "el nombre de la pelicula"
                          : "el nombre de la serie" ) 
                       + "-->");
    NOMBRE = checaCadena(sc.nextLine());
    System.out.print("Ahora toca el anho en que fue grabado "
                       + "(> 1900):-->");
    FECHA = checaRangos(sc.nextInt(),ANHO1,ANHOU);
    sc.nextLine();
    System.out.print("Dame ahora el numero de "
                       + "transmisiones permitidas (1-20) -->");
    permitidas = checaRangos(sc.nextInt(),1,20);
    sc.nextLine();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    System.out.println("Gracias");
    sc.close();
  }
  
  /**
   * Constructor a partir del tipo de disco, nombre y fecha
   * 
   * @param tipo si es CD, DVD o BR.
   * @param nombre del artista o pelicula.
   * @param fecha de grabacion.
   */
  public Disco ( short tipo, String nombre, int fecha)  {
    TIPO_DISCO = tipo;
    NOMBRE = nombre;
    FECHA = fecha;
  }
  
  /**
   * Constructor a partir del tipo de disco, nombre, fecha
   * y numero de transmisiones permitidas.
   * 
   * @param tipo si es CD, DVD o BR.
   * @param nombre del artista o pelicula.
   * @param fecha de grabacion.
   * @param permitidas el numero de transmisiones.
   */
  public Disco ( short tipo, String nombre, int fecha, int permitidas)  {
    TIPO_DISCO = tipo;
    NOMBRE = nombre;
    FECHA = fecha;
    this.permitidas = permitidas;
  }
  
  /**
   * Proporciona el tipo del disco.
   *
   * @return el tipo de disco entre 1 y 3
   */
  public short getTIPO_DISCO()   {
    return 0;
  }
  
  /**
   * Proporciona el nombre que tenga asociado el disco. Puede ser el
   * musico si se trata de un CD o la pelicula si se trata de un DVD
   * o Blue-Ray.
   *
   * @return nombre del musico si se trata de un CD o de la pelicula
   * si se trata de un DVD o Blue-Ray.
   */
  public String getNOMBRE()   {
    return null;
  }
  
  /**
   * Proporciona el anho en que fue grabado el disco.
   *
   * @return fecha de grabacion.
   */ 
  public int getANHO()   {
    return 0;
  }
  
  /**
   * Proporciona el numero de transmisiones permitidas.
   *
   * @return numero de transmisiones permitidas.
   */
  public int getPermitidas()   {
    return 0;
  }
  
  /**
   * Proporciona el numero de transmisiones activas.
   *
   * @return numero de transmisiones activas.
   */
  public int getActivas()   {
    return 0;
  }
  
  /**
   * Modifica el valor de transmisiones permitidas.
   *
   * @param permisos valor que se desea establecer
   */
  public void setPermitidas(int permisos) {
    
  }
  
  /**
   * Modifica el valor de transmisiones activas.
   *
   * @param activ valor que se desea establecer
   */
  public void setActivas(int activ)  {
    
  }
  
  /** Proporciona una cadena con los distintos campos ocupando un
    * lugar definido.
    *
    * 
    * @return La informacion del disco linealizada en forma de
    *         cadena, todos los discos con la misma informacion.
    */  
  public String toString()   {
    return null;
  }
  
  /**
   * Muestra de forma estatica el contenido de este disco.
   * 
   * @return una cadena con la informacion y que contiene saltos de
   *         linea.
   */
  public String muestraDisco(String titulo)  {
    return null;
  }
  
  /**
   * Otorga una transmision, contestando con la fecha y hora en que
   * la esta dando. Si no la puede dar, responde
   * negativamente. Actualiza el numero de transmisiones activas.
   *
   * @return Un mensaje diciendo si pudo o no otorgar la transmision.
   */
  public String daTransmision()   {
    return null;
  }
  
  /**
   * Actualiza el numero de transmisiones activas.
   */
  public boolean terminaTransmision()   {
    return false;
  }
  
  /**
   * Duplica a este disco, construyendo otro objeto con los mismos
   * valores, pero con identidad distintinta.
   *
   * @return un nuevo disco identico al que se le pide.
   */
  public ServiciosDisco copiaDisco( )   {
    return null;
  }
  
  /**
   * Verifica que el tipo de disco que se guarde sea el numero 
   * correcto.
   * @param tipo un numero entero.
   * @return un 1, 2 o 3, que son tipos correctos.
   */
  private short checaTipo(short tipo, short limI, short limS) {
    return tipo < limI
      ? limI
      : (tipo > limS
           ? limS
           : tipo);
  }
  
  /**
   * Verifica que el nombre de la artista o pelicula no sea 
   * una cadena vacia o una referencia nula.
   * @param cadena a verificar.
   * @return cadena corregida, en su caso.
   */
  private String checaCadena(String cadena) { 
    return cadena == null || cadena.length() == 0
      ? "No identificado"
      : cadena;
  }
  
  /**
   * Verifica que el anho de grabacion cumpla estar 
   * entre primerAnho y ultimoAnho.
   *
   * @param fecha, el anho de grabacion.
   * @param primerAnho el limite iferior valido.
   * @param ultimoAnho el limite superior valido.
   * @return un entero tal que primerAnho <= fecha <= ultimoAnho.
   */
  private int checaFecha(int fecha,int primerAnho, 
                         int ultimoAnho)  {
    return fecha < primerAnho
      ? primerAnho
      : fecha > ultimoAnho
        ? ultimoAnho
        : fecha;
  }
    
  /**
   * Verifica que el entero dado que se guarde este entre 
   * los rangos dados.
   *
   * @param que, un numero entero.
   * @param limI entero menor valido.
   * @param limS entero mayor valido.
   * @return un entero tal que limI <= entero <= limS.
   */
  private int checaRangos(int que,int limI, int limS)  {
    return que < limI
      ? limI
      : que > limS
        ? limS
        : que;
  }
  public static void main(String[] args){
    Disco uno = new Disco();
  }
}
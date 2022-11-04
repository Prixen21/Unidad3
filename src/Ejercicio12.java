/*Implementa un programa que determine la frecuencia de aparición de cada vocal en una cadena de caracteres introducida por teclado. Comenzará solicitando la cadena y, posteriormente,
 construirá un array con las frecuencias de cada vocal. Finalmente, imprimirá el array de frecuencias por pantalla.(NOTA: No debe ser sensible a mayúsculas/minúsculas).
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static String CADENA;
    public static void main(String[] args) {
        PideCadena();
        Muestra(CuentaVocales());
    }
    public static void PideCadena(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres: ");
        CADENA = sc.next();
    }
    public static int[] CuentaVocales(){
        int a= 0,e= 0,i= 0,o= 0,u= 0;
        for (int j = 0 ; j < CADENA.length(); j++){
            if(CADENA.charAt(j) == 65 || CADENA.charAt(j) == 97  )  a++;
            if(CADENA.charAt(j) == 69 || CADENA.charAt(j) == 101  ) e++;
            if(CADENA.charAt(j) == 73 || CADENA.charAt(j) == 105  ) i++;
            if(CADENA.charAt(j) == 79 || CADENA.charAt(j) == 111  ) o++;
            if(CADENA.charAt(j) == 85 || CADENA.charAt(j) == 117  ) u++;
        }
        int[] vocales = new int[5];
        vocales[0]=a;
        vocales[1]=e;
        vocales[2]=i;
        vocales[3]=o;
        vocales[4]=u;

        return vocales;
    }
    public static void Muestra(int[] vocales){
        System.out.printf("La cadena introducida tiene %d  a, %d e, %d i, %d o, %d u. " ,vocales[0], vocales[1], vocales[2], vocales[3], vocales[4]);
    }
}
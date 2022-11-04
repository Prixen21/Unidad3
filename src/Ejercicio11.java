import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        MuestraBinario(CalculaBinario(InvertirBinario(PideBinario())));
    }
    public static String PideBinario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un binario : ");
        return sc.next();
    }
    public static String InvertirBinario(String string){
        String invertido = new StringBuilder(string).reverse().toString();
        return invertido;
    }
    public static int CalculaBinario(String  binarioInvertido){
        int valor= 0;
        for (int i = binarioInvertido.length()- 1; i>=0 ; i--)
            if(binarioInvertido.charAt(i) == 49) valor = (int) (valor + (Math.pow(2 , i )));
        return valor;
    }
    public static void MuestraBinario(int valor){
        System.out.println("El binario introducido es en base decimal :"+ valor );
    }
}
/*Escribe un programa que pida 10 números por teclado y
 que luego muestre los números introducidos junto con
 las palabras “máximo” y “mínimo” al lado del
 máximo y del mínimo respectivamente. */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args ) {
        int[] numeros = new int[10];
        PideNumeros(numeros);
        MuestraArray(numeros , CalcularMaxyMinArray(numeros));
    }
    public static void PideNumeros(int[] array){
        Scanner sc =new Scanner(System.in);

        for (int i = 0;i <10; i++){
            System.out.println("Introduzca el número " + (i+1) +" : ");
            array[i] = sc.nextInt();
        }
    }
    public static int[] CalcularMaxyMinArray(int[] array){
        int max = 0;
        int min = 2147483647;

        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int[] MaxMin = new int[2];
        MaxMin[0]= min;
        MaxMin[1]= max;

        return MaxMin;
    }
    public static void MuestraArray(int[] array , int[] MaxMin) {
        int min = MaxMin[0];
        int max = MaxMin[1];
        System.out.println("números : ");

        for (int i = 0; i < 10; i++) {
            if (array[i] == max) {
                System.out.println(max + " Maximo");
            } else if (array[i] == min) {
                System.out.println(min + " Minimo");
            } else System.out.println(array[i]);
        }
    }
}
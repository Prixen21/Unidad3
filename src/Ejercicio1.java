/*Escribe un programa que lea 10 números por teclado y luego los muestre en orden inverso, es decir,
 el primero que se introduce es el último en mostrarse y viceversa.*/
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero;
        numero = new int[10];
        for (int i = 0;i <10; i++){
            System.out.println("Introduzca el número " + (i+1) +" : ");
            numero[i] = sc.nextInt();
        }

        for (int i = 9; i>=0 ; i--)
        System.out.print(numero[i] + "\t");
    }
}
//Escribe un programa que lea 15 números por teclado y los almacene en un array. Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
// el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array/
import java.util.Scanner;
public class Ejercicio7 {
    public static int[] ARRAY = new int[15];
    public static int[] ROTADOS = new int[15];
    public static void main(String[] args) {
        PideNumeros();
        RotaArray();
        MuestraArray();
    }
    public static void PideNumeros(){
        Scanner sc =new Scanner(System.in);
        for (int i = 0;i < ARRAY.length; i++){
            System.out.println("Introduzca el número " + (i+1) +" : ");
            ARRAY[i] = sc.nextInt();
        }
    }
    public static void RotaArray(){
        for (int i = 0; i <= ARRAY.length - 1 ; i++) {
            if(i== 14)ROTADOS[14]= ARRAY[0];
            else ROTADOS [i]= ARRAY[i+1];
        }
    }
    public static void MuestraArray(){
        for (int i : ROTADOS) {
            System.out.print(i + "\t\t");
        }
        System.out.println();
    }
}
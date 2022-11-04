/*Crea un programa que permita almacenar en un array un conjunto de 20 números enteros de valores comprendidos entre 0 y 99 generados aleatoriamente
 (utiliza el método Math.random()).*/
public class Ejercicio3 {

    public static void main(String[] args) {

        int[] numeros0a99 = new int[19];
        LlenaArray(numeros0a99);
        MuestraArray(numeros0a99);
    }

    public static int[] LlenaArray(int[] array) {

        for (int i = 0; i < 19; i++) {
            array[i] = (int) (Math.random() * 99);

        }
        return array;
    }
    public static void MuestraArray(int[] array) {

        System.out.println("Los elementos del array son: ");

        for (int num : array) {
            System.out.print("\t" + num);
        }
    }
}
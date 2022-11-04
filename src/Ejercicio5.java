/*
Define tres arrays de 20 números enteros cada uno, con nombres: numero, cuadrado y cubo.
Carga el array numero con valores aleatorios entre 0 y 100.
En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
En el array cubo se deben almacenar los cubos de los valores que hay en numero.
A continuación se muestra el contenido de los tres arrays dispuestos en tres columnas
.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        LlenaRandom(numero);
        LlenaCuadrado(cuadrado , numero);
        LlenaCubo(cubo,numero);
        MuestraArray(numero);
        MuestraArray(cuadrado);
        MuestraArray(cubo);
    }
    public static void LlenaRandom(int[] array) {
        for (int i = 0; i < 20; i++)
            array[i] = (int) (Math.random() * 101 );
    }
    public static void LlenaCuadrado(int[] cuadrados , int[] numeros ) {
        for (int i = 0; i < 20; i++)
            cuadrados[i] =  numeros[i] * numeros[i] ;
    }
    public static void LlenaCubo(int[] cubos , int[] numeros ) {
        for (int i = 0; i < 20; i++)
            cubos[i] =  numeros[i] * numeros[i] * numeros[i] ;
    }
    public static void MuestraArray(int[] array){
        for (int i : array) {
           if (i<1000) System.out.print(i + "\t\t");
           else System.out.print(i + "\t");
        }
        System.out.println();
    }
}

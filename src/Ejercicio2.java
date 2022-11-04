/*Define un array de 12 números y asigna valores a los elementos según la tabla que se muestra a continuación.
Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?.
Indica la respuesta en forma de comentario.*/

/*
Respuesta: Los valores que no han sido inicializados se muestran como 0
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arrayEjemplo = new int[12];
        arrayEjemplo[0] = 39;
        arrayEjemplo[1] = -2;
        arrayEjemplo[4] = 0;
        arrayEjemplo[6] = 14;
        arrayEjemplo[8] = 5;
        arrayEjemplo[9] = 120;

        for (int i = 0 ; i < arrayEjemplo.length; i++)
            System.out.println(arrayEjemplo[i]);
    }

}

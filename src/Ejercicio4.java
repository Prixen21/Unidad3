/* Define un array de 10 caracteres y asigna los valores a los elementos según la tabla que se muestra a continuación.
Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?.
 Indica la respuesta en forma de comentario. */
/*
Respuesta:
 Los caracteres muestran su codigo correspondiente en ASCII.
 Los valores que no han sido inicializados se muestran como 0.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arrayEjemplo = new int[10];
        arrayEjemplo[0] = 'a';
        arrayEjemplo[1] = 'x';
        arrayEjemplo[4] = '@';
        arrayEjemplo[6] = ' ';
        arrayEjemplo[7] = '+';
        arrayEjemplo[8] = 'Q';

        for (int i = 0 ; i < arrayEjemplo.length; i++)
            System.out.println(arrayEjemplo[i]);


    }
}

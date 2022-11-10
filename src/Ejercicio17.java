import java.lang.reflect.Array;

/*A partir de un vector de enteros positivos, implementa una solución (iterativa) de búsqueda binaria sobre el mismo en el que además de indicar en que posición se encuentra
un valor buscado (-1 si no se encuentra), indique también el número de intentos hasta encontrarlo/ no encontrarlo. Prueba con números aleatorios grandes y una elevada dimensión para el vector.
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int valor  = 3;
        Asignavalores(array);
        BuscaValor(array, valor);
    }
    public static void Asignavalores(int[] array){
      /*  for (int i = 0 ; i < array.length -1 ; i++){
            double aux = Math.random()*  10;
            array[i] = (int)aux;
            System.out.println(array[i]);
        }
        */
        array[0] = 123;
        array[1] = 863;
        array[2] = 632;
        array[3] = 452;
        array[4] = 639;
        array[5] = 13;
        array[6] = 573;
        array[7] = 920;
        array[8] = 400;
        array[9] = 391;
    }

    public static void BuscaValor(int[] array , int valor){
        valor = -1;
        for(int i = 0; i< array.length -1; i++){
            if(array[i] == valor) valor = array[i];
        }
        System.out.println("El valor se encuentra en la posición " + valor +" del array, se han necesitado " + valor + " intentos");
    }
}

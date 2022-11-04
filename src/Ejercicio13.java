/*Teniendo en cuenta los datos que aparecen más abajo, realiza los siguientes métodos (corresponden a las notas de 3 alumnos en 4 asignaturas):
Visualizar nota máxima, mínima y media de cada alumno. Visualizar nota máxima, mínima y media de cada asignatura. Visualizar nota máxima, mínima y media del curso.
A partir de una nota que se pedirá por teclado, visualizar qué alumnos la han obtenido y en qué asignaturas (aunque en el ejemplo no se cumple, tened en cuenta que una misma nota podría
aparecer repetida en distintas posiciones de la matriz…). DATOS:{ { 5.6, 9.5, 6.8, 7 },{ 7.9, 5.2, 5.7, 6.3 },{ 9.8, 8, 7.6, 8.5} }*/
public class Ejercicio13 {
    // alumnos [ Numero alumno] [Numero nota asignatura]
    public static double[][] ALUMNOS = new double[3][4];

    public static void main(String[] args) {
        Asignanotas();
    }
    public static void Asignanotas() {
        // asigna notas del primer alumno
        ALUMNOS[0][0] = 5.6;
        ALUMNOS[0][1] = 9.5;
        ALUMNOS[0][2] = 6.8;
        ALUMNOS[0][3] = 7;

        // asigna notas del segundo alumno
        ALUMNOS[1][0] = 7.9;
        ALUMNOS[1][1] = 5.2;
        ALUMNOS[1][2] = 5.7;
        ALUMNOS[1][3] = 3.3;

        // asigna notas del tercer alumno
        ALUMNOS[2][0] = 9.8;
        ALUMNOS[2][1] = 81;
        ALUMNOS[2][2] = 7.6;
        ALUMNOS[2][3] = 8.5;
    }
// crea un array auxiliar en el q se guarden las notas de los alumnos para posteriormente pasarlo al metodo de calcular max y min
    public static void MuestraMaxYMin(){

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
}
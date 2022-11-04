/*
Modifica el programa anterior para que se puedan guardar hasta 30 calificaciones. El programa pedirá calificaciones al usuario hasta que éste introduzca una nota negativa (o se llene el array).
El programa, además de lo requerido en el ejercicio anterior, mostrará la nota máxima llamando a un método que se encargue de encontrarla.
*/

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        double[] notas = new double[30];
        PideNotas(notas);
        MuestraArray(notas,CalculaMedia(notas, NumeroAlumnos(notas) ),NumAprobadosSuspensos(notas, NumeroAlumnos(notas)), NumeroAlumnos(notas));
    }
    public static void PideNotas(double[] array){
        Scanner sc =new Scanner(System.in);
        for (int i = 0;i < array.length; i++){
            System.out.println("Introduzca la nota del estudiante " + (i+1) +" : ");
            double aux =sc.nextDouble();
            if (aux >= 0 ) array[i] = aux;
            else return;
        }
    }
    public static int NumeroAlumnos (double [] array){

        int numeroAlumnos = 0;

        for (int i = 0 ; i < array.length; i++){
            if (array[i] > 0) numeroAlumnos++;

        }
        return numeroAlumnos;
    }
    public static double CalculaMedia(double[] array , int numeroAlumnos){
        double NotaTotal = 0 ;
        double NotaMedia;
        for (double i : array) {
            NotaTotal = i + NotaTotal;
        }
        NotaMedia = NotaTotal / numeroAlumnos;
        return NotaMedia;
    }
    public static int[] NumAprobadosSuspensos(double [] array, int numeroAlumnos){
        int[] AprobadosSuspensos = new int[2];
        int aprobados = 0 ;
        int suspensos = 0;
        for (int i = 0 ; i < numeroAlumnos  ; i++) {
            if (array [i] >= 5) aprobados++;
            else suspensos++;
        }
        AprobadosSuspensos[0] = aprobados;
        AprobadosSuspensos[1] = suspensos;
        return AprobadosSuspensos;
    }
    public static void MuestraArray(double[] array, double media, int[]NumAprobadosSuspensos, int numeroAlumnos){
        for (int i = 0; i < numeroAlumnos;){
            System.out.printf("La nota del estudiante %d es: %.2f ,la media del curso es: %.2f ,han habido %d aprobados y %d suspensos",(i +1 ), array[i] , media,  NumAprobadosSuspensos[0],NumAprobadosSuspensos[1] );
            System.out.println();
            i++;
        }
    }
}
/*
Implementa un programa que pida al usuario las calificaciones (double) de los 10 estudiantes de una clase y los guarde en un array.
Después, mostrará esas calificaciones (cada una en una línea), seguida de la media del curso y del número de aprobados y suspensos.
Se usará un método para calcular la nota media y otro para el número de suspensos.
*/

import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        PideNotas(notas);
        MuestraArray(notas,CalculaMedia(notas),NumAprobadosSuspensos(notas));
    }
    public static void PideNotas(double[] array){
        Scanner sc =new Scanner(System.in);
        for (int i = 0;i < array.length; i++){
            System.out.println("Introduzca la nota del estudiante " + (i+1) +" : ");
            array[i] = sc.nextDouble();
        }
    }
    public static double CalculaMedia(double[] array){
        double NotaTotal = 0 ;
        double NotaMedia;
        for (double i : array) {
            NotaTotal = i + NotaTotal;
        }
        NotaMedia = NotaTotal / 10;
        return NotaMedia;
    }
    public static int[] NumAprobadosSuspensos(double [] array){
        int[] AprobadosSuspensos = new int[2];
        int aprobados = 0 ;
        int suspensos = 0;
        for (double i : array) {
            if (i >= 5) aprobados++;
            else suspensos++;
        }
        AprobadosSuspensos[0] = aprobados;
        AprobadosSuspensos[1] = suspensos;
        return AprobadosSuspensos;
    }
    public static void MuestraArray(double[] array, double media, int[]NumAprobadosSuspensos){
        for (int i = 0; i < array.length;){
            System.out.printf("La nota del estudiante %d es: %.2f ,la media del curso es: %.2f ,han habido %d aprobados y %d suspensos",(i +1 ), array[i] , media,  NumAprobadosSuspensos[0],NumAprobadosSuspensos[1] );
            System.out.println();
            i++;
        }
    }
}

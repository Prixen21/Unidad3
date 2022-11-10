/*Teniendo en cuenta los datos que aparecen más abajo, realiza los siguientes métodos (corresponden a las notas de 3 alumnos en 4 asignaturas):
Visualizar nota máxima, mínima y media de cada alumno. Visualizar nota máxima, mínima y media de cada asignatura. Visualizar nota máxima, mínima y media del curso.
A partir de una nota que se pedirá por teclado, visualizar qué alumnos la han obtenido y en qué asignaturas (aunque en el ejemplo no se cumple, tened en cuenta que una misma nota podría
aparecer repetida en distintas posiciones de la matriz…). DATOS:{ { 5.6, 9.5, 6.8, 7 },{ 7.9, 5.2, 5.7, 6.3 },{ 9.8, 8, 7.6, 8.5} }*/
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        // alumnos [ Numero alumno] [Numero nota asignatura]
        double[][] alumnos = new double[3][4];
        Asignanotas(alumnos);
        MaxMinMediaAlumno(alumnos);
        MaxMinMediaAsignatura(alumnos);
        MaxMinMediaCurso(alumnos);
        ComprobarNota(alumnos);
    }
    public static void Asignanotas(double[][] matriz) {
        // asigna notas del primer alumno
        matriz[0][0] = 5.6;
        matriz[0][1] = 9.5;
        matriz[0][2] = 6.8;
        matriz[0][3] = 7;
        // asigna notas del segundo alumno
        matriz[1][0] = 7.9;
        matriz[1][1] = 5.2;
        matriz[1][2] = 5.7;
        matriz[1][3] = 6.3;
        // asigna notas del tercer alumno
        matriz[2][0] = 9.8;
        matriz[2][1] = 8;
        matriz[2][2] = 7.6;
        matriz[2][3] = 8.5;
    }
    public static void MaxMinMediaAlumno(double[][] matriz){
        double max = 0;
        double min =  2147483647;
        double media = 0;
        for (int f = 0; f<3 ; f++){
            for (int c = 0; c<4 ; c++) {
                if (matriz[f][c] > max) max = matriz[f][c];
                if (matriz[f][c] < min) min = matriz[f][c];
                media += matriz[f][c];
            }
            media /= 4;
            System.out.printf("Alumno %d: \nNota Maxima: %.2f \nNota Minima : %.2f \nNota Media : %.2f",(f + 1),max,min, media);
            System.out.println();
            System.out.println();
            media = 0;
             max = 0;
             min =  2147483647;
        }
    }
    public static void MaxMinMediaAsignatura(double[][] matriz){
        double max = 0;
        double min =  2147483647;
        double media = 0;
        for (int c = 0; c<4 ; c++){
            for (int f = 0; f<3 ; f++) {
                if (matriz[f][c] > max) max = matriz[f] [c];
                if (matriz[f][c] < min) min = matriz[f] [c];
                media += matriz[f][c];
            }
            media /= 3;
            System.out.printf("Asignatura %d: \nNota Maxima: %.2f \nNota Minima : %.2f \nNota Media : %.2f",(c + 1),max,min, media);
            System.out.println();
            System.out.println();
            media = 0;
            max = 0;
            min =  2147483647;
        }
    }
    public static void MaxMinMediaCurso(double[][] matriz){
        double max = 0;
        double min =  2147483647;
        double media = 0;
        for (int f = 0; f<3 ; f++){
            for (int c = 0; c<4 ; c++) {
                if (matriz[f][c] > max) max = matriz[f] [c];
                if (matriz[f][c] < min) min = matriz[f] [c];
                media += matriz[f][c];
            }
        }
        media /= 12;
        System.out.printf("Todo el curso: \nNota Maxima: %.2f \nNota Minima : %.2f \nNota Media : %.2f",max,min, media);
        System.out.println();
        System.out.println();
    }
    public static void ComprobarNota(double[][] matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la nota: ");
        double nota = sc.nextDouble();
        for (int f = 0; f<3 ; f++){
            for (int c = 0; c<4 ; c++) {
                if(matriz[f][c] == nota) {
                    System.out.printf("El alumno nº%d  en la asignatura nº%d ha sacado %.2f", (f + 1), (c + 1), nota);
                    System.out.println();
                }
            }
        }
    }
}
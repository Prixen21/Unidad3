/*En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos.Cada fila corresponde a las notas de 3 examenes
* y a la media de cada alumno.Se necesita un programa q permita al profesor cargar, en las 3 posiciones las notas y que
* en la última columna se calculen las medias. Una vez realizados los calculos se desea mostrar las 3 notas del alumno
* y la media*/
import java.util.Scanner;
public class e1 {
    public static void main(String[] args) {

        double[][] matriz = new double[4][4];
        AsignaValores(matriz);
        CalculaMedias(matriz);
        MuestraValores(matriz);
    }
    public static void AsignaValores(double[][] matriz ) {
        Scanner sc = new Scanner(System.in);
        for (int f = 0; f < 4; f++){
            for(int c = 0; c<3; c++){
                System.out.print("Nota del alumno nº" + (f + 1) + " en el examen nº"+ (c + 1) + ": ");
                matriz[f][c]= sc.nextDouble();
            }
        }
        System.out.println();
    }
    public static void CalculaMedias(double[][] matriz){
        double aux = 0 ;
        for(int f = 0; f <4; f++){
            for(int c = 0; c < 4; c++){
                if (c < 3) aux += matriz[f][c];
                else {
                    matriz[f][c] = (aux / 3 );
                }
            }
            aux = 0;
        }
    }
    public static void MuestraValores(double[][] matriz) {
        for(int f = 0; f<4; f++){
            System.out.println("Notas del alumno nº" + (f + 1) + ": ");
            for(int c = 0; c<3; c++){

                System.out.printf("Examen nº%d: %.2f", (c + 1 ), matriz[f][c]);
                System.out.println();

            }
            System.out.printf("Nota media: %.2f", matriz[f][3]);
            System.out.println();
            System.out.println();
        }
    }
}
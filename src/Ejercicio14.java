/*Realiza un método que devuelva cierto si la matriz de dimensiones NxN que se le pasa como argumento es simétrica.
 Una matriz A es simétrica si a(i,j) = a(j,i). Ejemplos de matrices simétricas en las imágenes*/
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de filas y columnas en la matriz: ");
        int fc = sc.nextInt();
        int [][] matriz = new int[fc][fc];
        LLenaMatriz(matriz);
        System.out.println(CompruebaSimetrica(matriz));
    }
    public static void LLenaMatriz(int[][] matriz){
        Scanner sc = new Scanner(System.in);
        for(int f=0 ; f< (matriz.length  ) ; f++){
            for(int c= 0 ; c< (matriz.length ) ; c++){
                System.out.println("Introduzca el valor de la fila nº" + (f+1) +" en la columna nº" + (c+1));
                matriz[f][c] = sc.nextInt();
            }
        }
    }
    public static boolean CompruebaSimetrica(int[][] matriz){
        for (int f = 0; f < (matriz.length  ) ; f++){
            for(int c = 0; c < (matriz.length  ); c++){
                if ( matriz[f][c] != matriz[c][f] ) {  return false;}
            }
        }
        return true;
    }
}
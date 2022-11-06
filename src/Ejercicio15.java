import java.util.Scanner;

/*Realiza un método que reciba una matriz de dimensiones NxN y almacene sobre ella su traspuesta.
 La matriz traspuesta es aquella que se obtiene cambiando ordenadamente las filas por las columnas.
 En la imagen aparece como ejemplo una matriz y su traspuesta.
*   2   3   0
*   1   2   0
*   3   5   6
*
*   2   1   3
*   3   2   5
*   0   0   6
*
* */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de filas y columnas en la matriz: ");
        int fc = sc.nextInt();
        int [][] matriz = new int[fc][fc];
        LLenaMatriz(matriz);
        CreaTraspuesta(matriz);

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
    public static void CreaTraspuesta(int [][] matriz){
        int[][] transpuesta = new int[matriz.length][matriz.length];
        for(int f=0 ; f< (matriz.length  ) ; f++) {
            for (int c = 0; c < (matriz.length); c++) {
                transpuesta[f][c] = matriz[c][f];
            }
        System.out.println();
        }
    }
}

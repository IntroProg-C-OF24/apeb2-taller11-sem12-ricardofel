package taller11.modulos.funciones;
//Autor: Ricardo Fabian Espinosa Largo
import java.util.Scanner;
import java.util.Random;
public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int filas = 0, columnas = 0;
        System.out.println("Ingresa las filas de la matriz");
        filas = tc.nextInt();
        System.out.println("Ingresa las columnas de la matriz");
        columnas = tc.nextInt();
        int matriz1[][] = new int [filas][columnas];
        int matriz2[][] = new int [filas][columnas];
        int matriz3[][] = new int [filas][columnas];
        llenarMatriz(matriz1, filas, columnas);
        System.out.println("MATRIZ ORIGINAL:");
        System.out.println(presentarMatriz(matriz1, filas, columnas));
        pares(matriz1, matriz2, filas, columnas);
        System.out.println("PARES:");
        System.out.println(presentarMatriz(matriz2, filas, columnas));
        impares(matriz1, matriz3, filas, columnas);
        System.out.println("IMPARES:");
        System.out.println(presentarMatriz(matriz3, filas, columnas));
        System.out.println("PROMEDIO DE LOS VALORES DE LA MATRIZ: " + promedio(matriz1, filas, columnas));
    }
    public static void llenarMatriz(int matriz[][], int limF, int limC){ //Metodo para llenar la matriz con numeros aleatorios
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++)
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);
        }
    }
    
    public static String presentarMatriz(int matriz[][], int limF, int limC){//Metodo para presentar la matriz en consola
        String cadena = "";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++)
                cadena += String.format("%d\t", matriz[ i][j]); 
            cadena += "\n";
        }
        return cadena;
    }
    
    public static void pares(int matriz1[][], int matriz2[][], int limF, int limC){//Metodo para seleccionar solo los valores pares de la matriz
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if ((matriz1[i][j]%2) == 0)
                    matriz2[i][j] = matriz1[i][j];
                else
                    matriz2[i][j] = 0;
            }
        }
    }
    
    public static void impares(int matriz1[][], int matriz3[][], int limF, int limC){//Metodo para seleccionar solo los valores impares de la matriz
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if ((matriz1[i][j]%2)!=0)
                    matriz3[i][j] = matriz1[i][j];
                else
                    matriz3[i][j] = 0;
            }
        }
    }
    
    public static double promedio(int matriz1[][], int limF, int limC){//Funcion para calcular el promedio de todos los valores de la matriz
        double promedio = 0;
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++)
                promedio += matriz1[i][j];
        }
        promedio = promedio/(limF*limC);
        return promedio;
    }
}

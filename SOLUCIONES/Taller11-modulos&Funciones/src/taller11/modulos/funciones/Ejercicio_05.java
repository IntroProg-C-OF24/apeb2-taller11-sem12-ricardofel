package taller11.modulos.funciones;
//Autor: Ricardo Fabian Espinosa Largo
import java.util.Scanner;
import java.util.Random;
public class Ejercicio_05 {
    public static void main(String[] args) {
        int filas = 5, col = 5;
        Scanner tc = new Scanner(System.in);
        int[][] matriza = new int [filas][col];
        int[][] matrizb = new int [filas][col];
        int[][] matrizc = new int [filas][col];
        int[][] matrizd = new int [filas][col];
        int[][] matrize = new int [filas][col];
        llenarmatriz(matriza);
        llenarmatriz(matrizb);
        System.out.println("MATRIZ 1");
        System.out.println(presentarmatriz(matriza));
        System.out.println("MATRIZ 2");
        System.out.println(presentarmatriz(matrizb));
        suma(matriza, matrizb, matrizc);
        System.out.println("SUMA:");
        System.out.println(presentarmatriz(matrizc));
        resta(matriza, matrizb, matrizd);
        System.out.println("RESTA:");
        System.out.println(presentarmatriz(matrizd));
        multiplicacion(matriza, matrizb, matrize);
        System.out.println("MULTIPLICACION:");
        System.out.println(presentarmatriz(matrize));
    }
    public static void llenarmatriz(int matriz[][]){//Metodo para llenar las matrices con numeros aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);
            }
        }
    }
    
    public static String presentarmatriz(int matriz[][]){ //Metodo para presentar las matrices en consola
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                cadena += String.format("%d\t", matriz[i][j]);
            }
            cadena += "\n";
        }
        return cadena;
    }
    public static void suma (int matriz1[][], int matriz2[][],int matriz3[][]){ //Metodo para sumar matrices
           for (int i = 0; i < matriz1.length; i++) {
               for (int j = 0; j < matriz1[0].length; j++) {
                   matriz3[i][j] = matriz1[i][j]+ matriz2[i][j];
               }
        }
    }
    public static void resta (int matriz1[][], int matriz2[][],int matriz4[][]){ //Metodo para restar matrices
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz4[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
    }
    public static void multiplicacion(int matriz1[][], int matriz2[][],int matriz5[][]){ //Metodo para multiplicar matrices
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    matriz5[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
        }
    }
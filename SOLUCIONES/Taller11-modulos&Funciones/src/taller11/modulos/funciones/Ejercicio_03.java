package taller11.modulos.funciones;
//Autor: Ricardo Fabian Espinosa Largo
import java.util.Scanner;
public class Ejercicio_03 {
    static int limite = 4; 
    static String[] promedio = new String [limite];
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
            double[] calificaciones = new double [limite];
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("INGRESA LA NOTA DEL ESTUDIANTE: " + (i+1));
                calificaciones[i] = tc.nextDouble();
            }
            cualitativo(calificaciones, promedio);
            presentarPromedio(promedio);
    }
    public static void cualitativo(double notas[], String promedio[]){ //Metodo para calcular el promedio cualitativo
        for (int i = 0; i < notas.length; i++) {
            if((notas[i]>=0)&(notas[i]<=5)){
                promedio[i] = "PROMEDIO REGULAR";
            }else{
                if((notas[i]>=5.1)&(notas[i]<=8)){
                promedio[i] = "PROMEDIO BUENO";
                }else{
                    if((notas[i]>=8.1)&(notas[i]<=9)){
                    promedio[i] = "PROMEDIO MUY BUENO";
                    }else{
                    promedio[i] = "PROMEDIO SOBRESALIENTE";
                    }   
                }   
            }
        }
    }
    public static void presentarPromedio(String promedio[]){ //Metodo para presentar cada promedio en consola
        for (int i = 0; i < promedio.length; i++) {
            System.out.println("El estudiante numero " + (i+1) + " tiene una nota " + promedio[i]);
        }
    }
}

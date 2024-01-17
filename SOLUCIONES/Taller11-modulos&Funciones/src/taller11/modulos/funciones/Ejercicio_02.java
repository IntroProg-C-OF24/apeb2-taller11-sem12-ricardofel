package taller11.modulos.funciones;
//Autor: Ricardo Fabian Espinosa Largo
import java.util.Scanner;
public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double x, y;
        String seguir = null;
        int seleccion;
        do{
            System.out.println("Selecciona que area deseas calcular");
            System.out.println("[1] -> Area de un cuadrado");
            System.out.println("[2] -> Area de un triangulo");
            System.out.println("[3] -> Area de un rectangulo");
            seleccion = tc.nextInt();
            switch(seleccion){
                case 1:
                    System.out.println("Ingrese el valor del lado del cuadrado: ");
                    x = tc.nextDouble();
                    System.out.println("EL AREA DEL CUADRDO ES: " + cuadrado(x));
                    break;
                case 2:
                    System.out.println("Ingrese el valor de la base del triangulo: ");
                    x = tc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triangulo: ");
                    y = tc.nextDouble();
                    System.out.println("EL AREA DEL TRIANGULO ES: " + triangulo(x, y));
                    break;
                case 3:
                    System.out.println("Ingrese el valor de la base del rectangulo: ");
                    x = tc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del rectangulo: ");
                    y = tc.nextDouble();
                    System.out.println("EL AREA DEL RECTANGULO ES: " + triangulo(x, y));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            System.out.println("Quieres seguir con el programa?");
            seguir = tc.next();
        }while(seguir.equals("si"));
    }
    
    public static double cuadrado(double num1){ //Funcion para calcular el area de una cuadrado
        double respt;
        respt = Math.pow(num1, 2);
        return respt;
    }

    public static double triangulo (double num1, double num2){ //Funcion para calcular el area de un triangulo
        double respt;
        respt =+ (num1*num2)/2;
        return respt;
    }

    public static double rectangulo(double num1, double num2){ //Funcion para calcular el area de un rectangulo
        double respt;
        respt = num1 * num2;
        return respt;
    }
}

package taller11.modulos.funciones;
//Autor: Ricardo Fabian Espinosa Largo
import java.util.Scanner;
public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int seleccion = 0;
        String nombre = null, cedula = null;
        double kilovatio, kilovatioCons, result1 = 0, result2 = 0, valorInmueble;
        System.out.println("INGRESA TU NOMBRE");
        nombre = tc.nextLine();
        System.out.println("INGRESA TU CEDULA");
        cedula = tc.nextLine();
        System.out.println("Selecciona que tramite deseas realizar");
        System.out.println("[1] -> Consultar valor de planilla de luz");
        System.out.println("[2] -> Consultar el valor del predio de un inmueble");
        seleccion = tc.nextInt();
        switch(seleccion){
            case 1:
                System.out.println("Ingrese el valor del kilovatio: ");
                kilovatio = tc.nextDouble();
                System.out.println("Ingrese el numero de kilovatios consumidos");
                kilovatioCons = tc.nextDouble();
                System.out.println("Cliente: " + nombre + " con cedula: #" + cedula + " debe cancelar el valor de: " + valorPlanillaLuz(kilovatio, kilovatioCons, result1));
                break;
            case 2:
                System.out.println("Ingrese el valor del inmueble: ");
                valorInmueble = tc.nextDouble();
                System.out.println("Cliente: " + nombre + " con cedula: #" + cedula + " debe cancelar el valor de: " + predioBienInmueble(valorInmueble, result2));
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
    public static double valorPlanillaLuz(double kilovatio, double kilovatioMes, double resultado1){//Funcion para calcular el valor de una planilla de luz
        resultado1 = kilovatio*kilovatioMes;
        return resultado1;
    }
    public static double predioBienInmueble(double inmueble, double resultado2){ //Funcion para calcular el valor del predio de un inmueble
        resultado2 = inmueble*0.02;
        return resultado2;
    }
}

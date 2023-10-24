package calculadoraarreglos;

import java.util.Scanner;

public class CalculadoraArreglos {

    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        int resultado;
        double[] arreglos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        do{
        System.out.println("Que operacion quieres hacer");
        System.out.println("1.Sumar");
        System.out.println("2.Multiplicar");
        System.out.println("3.Salir");

        opcion = calculadora.nextInt();

        switch (opcion) {
            case 1:
                double suma = 0;
                for (double elemento : arreglos) {
                    suma += elemento;
                }
                System.out.println("La suma es: " + suma);

                break;

            case 2:
                double multiplicacion = 1;
                for (double elemento : arreglos) {
                    multiplicacion *= elemento;
                }
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;

            case 3:
                System.out.println("Saliendo del programa");
                break;

            default:
                System.out.println("Opcion no valida");
        }
   
        
        } while(opcion!= 3);
    }
}
   
  
    



                
        
        
    
    


package Arrays;

import java.util.Random;
import java.util.Scanner;

public class BusquedaLineal {
    //Se va a buscar un numero ingresado por el usuario en un arreglo aleatorio de numeros de 0 a 9

    public static void main (String args[]){
        var consola = new Scanner(System.in);
        var generadorAleatorio = new Random();
        int[] numeros = new int[10], posiciones = new int[10];
        int tope = -1, numeroBuscado;

        //Generar numeros al azar en numeros
        for (int i=0;i<10;i++){
          numeros[i] = generadorAleatorio.nextInt(10)+1;
        }
        //Ingresar el numero
        System.out.print("Numero buscado >> ");
        numeroBuscado = consola.nextInt();

        for (int i=0;i<10;i++){
            if(numeros[i]==numeroBuscado){
                tope++;
                posiciones[tope]=i;
            }
        }
        //muestra el arreglo aleatorio
        System.out.print("Arreglo original: ");
        for (int x : numeros){
            System.out.print(" "+x);
        }
        //muestra el numero que ingreso el usuario
        System.out.println("\nNumero buscado: "+numeroBuscado);

        //muestra las pocisiones donde esta el numero de 0 a 9
        System.out.print("Posiciones: ");
        for (int i=0;i<=tope;i++){
            System.out.print(" "+posiciones[i]);
        }
    }
}

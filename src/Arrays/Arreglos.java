package Arrays;
import java.util.Arrays;
public class Arreglos {
    public static void main (String[] args) {
        int[] miArreglo = new int[12];
        int[] Arr2 = new int[12];
        //String[] frase1 = {"Hola","mundo","Java"};
        //String[] frase2 = {"Hola","mundo","Java"};

        int valor = 1;
        for (int i = 0; i < 12; i++) {
            miArreglo[i] = valor;
            Arr2[i] = valor;
            valor++;
        }

        if (Arrays.equals(miArreglo,Arr2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }
}

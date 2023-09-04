package Arrays;

public class JavaArray {
    public static void main (String[] args) {
        int[] miArreglo = new int[12];

        int valor = 1;
        for (int i = 0; i < 12; i++) {
            miArreglo[i] = valor;
            valor++;
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(miArreglo[i]+" ");
        }
    }
}

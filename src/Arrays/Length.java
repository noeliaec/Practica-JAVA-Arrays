package Arrays;
public class Length {
    public static void main (String args[]){
            //El args[] en el método main de Java es un parámetro especial que se utiliza para pasar argumentos de línea de comandos cuando se ejecuta un programa.

        System.out.println("Cantidad de argumentos= "+ args.length);
        System.out.print("Lista de argumentos: ");

            //for each
        for (String miVariable : args) {
            System.out.print(miVariable + " ");
        }

        int[] miArreglo = {10, 9, 8, 7, 6};

        for (int valor:miArreglo) {
            System.out.println(valor);
        }
    }
}

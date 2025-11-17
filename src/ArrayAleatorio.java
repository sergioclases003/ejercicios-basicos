import java.util.Scanner;

public class ArrayAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de elementos del array: ");
        int n = sc.nextInt();

        System.out.print("Introduce el valor mínimo: "); //valor mínimo
        double min = sc.nextDouble();

        System.out.print("Introduce el valor máximo: "); //valor máximo
        double max = sc.nextDouble();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) { 
            numeros[i] = min + (Math.random() * (max - min));  //generar entre 1 y 0
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("posición %d: %.2f%n", i, numeros[i]);  // %.2f son 2 decimales
        }

        sc.close();
    }
}
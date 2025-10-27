import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = num1 + num2;  //la suma con los 2 números que nos han dado (num1 y num2)

        System.out.println("La suma de " + num1 + " + " + num2 + " es = " + resultado);

        sc.close(); // cerramos el Scanner (buena práctica según el profe cerrar los inputs)
    }
}

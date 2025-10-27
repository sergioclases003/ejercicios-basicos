import java.util.Scanner;

public class TemperaturaConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;  //fórmula grados C a grados F

        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        sc.close();  //cerramos el scanner (buena práctica según el profe para evitar que siga abierto el input)
    }
}

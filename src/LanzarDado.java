import java.util.Random;

public class LanzarDado {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("----------------------------------------------------");

        for (int i = 1; i <= 10; i = i + 1) {
            int resultado = random.nextInt(6) + 1; // número entre 1 y 6
            System.out.println(" Lanzamiento " + i + ": " + resultado);
        }

        System.out.println("----------------------------------------------------");
    }
}

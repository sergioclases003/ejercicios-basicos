import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(10) + 1;    // generamos un número aleatorio entre 1 y 10
        System.out.println("");  // espero que futuro yo no hagas trampas 
        System.out.println("El número SECRETO ES............................................................................................................................................................................" + numeroSecreto);
        System.out.println("");

        int intento = 0;   // número que introduce el usuario, valor inicial será 0 (para inicializarla, QUE SINO SALE ERROR, prueba y verás con "int intento;")
        int veces = 0;     // cuántas veces ha intentado adivinar

        System.out.println("Adivina el número (entre 1 y 10):");

        // bucle HASTA que el user de con el correcto
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            veces++; // sumamos un intento

            // comprobación de si está cerca, y le decimos si es mayor o menor el intento
            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en " + veces + " intentos!");
            }
        }

        sc.close(); // cerramos el Scanner
    }
}

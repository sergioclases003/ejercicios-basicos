import java.util.Random;
import java.util.Scanner;

public class AmongUsGame {

    public static void main(String[] args) {
        
        String[] jugadores = {"Rojo", "Azul", "Verde", "Amarillo", "Negro", "Blanco"};
        Random random = new Random();  
        int indiceImpostor = random.nextInt(jugadores.length); 
        String impostor = jugadores[indiceImpostor];
        
        System.out.println("Jugadores en la partida:");
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("- " + jugadores[i]);
        }
        System.out.println("EL IMPOSTOR ES........................." + impostor);
        Scanner sc = new Scanner(System.in);
        System.out.print("\n¿Quién crees que es el impostor?: ");
        String eleccion = sc.nextLine();

        // comparar SI LO DICES BIEN
        if (eleccion.equals(impostor)) {
            System.out.println("\n¡Correcto! " + eleccion + " era el impostor.");
        } else {
            System.out.println("\nFallaste... " + eleccion + " no era el impostor.");
            System.out.println("El impostor real era: " + impostor);
        }
        
        sc.close();
    }
}

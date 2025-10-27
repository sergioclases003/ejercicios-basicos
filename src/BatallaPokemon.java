import java.util.Scanner;

public class BatallaPokemon {

	// Definir daño fijo por turno → por ejemplo: daño = 20
    public static final int DAÑO_BASE_POR_TURNO = 20;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // pido vida de tu pokemon (miHP)
        System.out.printf("Por favor, introduce los puntos de salud (HP) de tu Pokémon: ");
        int miHP = scanner.nextInt();
        
        // pido vida del rival (rivalHP)
        System.out.printf("Ahora, introduce los puntos de salud (HP) del Pokémon rival: ");
        int rivalHP = scanner.nextInt();
        
        System.out.println("\n----------- ¡Comienza la batalla! -----------");
        System.out.println("Tu Pokémon: " + miHP + " HP");
        System.out.println("Pokémon rival: " + rivalHP + " HP");
        System.out.println("Daño por turno: " + DAÑO_BASE_POR_TURNO + "\n");
        
        // un bucle while que se ejecuta mientras ambos Pokémon tienen vida
        while (miHP > 0 && rivalHP > 0) {
            
            System.out.println("¡Tu Pokémon ataca al rival!");
            rivalHP = rivalHP - DAÑO_BASE_POR_TURNO;
            
            // Comprobar si el rival se ha debilitado después de tu ataque
            if (rivalHP <= 0) {
                System.out.println("¡El Pokémon rival ha sido debilitado!");
                break; // Salir del bucle inmediatamente
            }
            
            System.out.println("¡El Pokémon rival te ataca!");
            miHP = miHP - DAÑO_BASE_POR_TURNO;
            
            // Mostrar HP actual de ambos
            System.out.println("-------------------------------------");
            System.out.println("Tu pokemon tiene " + miHP + " HP");
            System.out.println("El rival tiene " + rivalHP + " HP");
            System.out.println("-------------------------------------\n");
        }
        
        // resultado de la batalla una vez que el bucle termina
        if (rivalHP <= 0) {
            System.out.println("¡Tu Pokémon ha ganado!");
        } else {
            System.out.println("Has perdido...");
        }
        
        scanner.close();
    }
}

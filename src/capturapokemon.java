import java.util.Scanner;

public class capturapokemon {
    public static void main(String[] args) {
        String[] nombrespok = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIME 5 nombres de pokemons, se mostrarán en orden inverso \n");
        // preguntar por nombres de pokemons
        for (int i = 0; i < nombrespok.length; i++) {
            System.out.print("Nombre del Pokémon capturado " + (i + 1) + ": ");
            nombrespok[i] = scanner.nextLine();
        }

        // Mostrar en orden inverso
        System.out.println("\nPokémon capturados (en orden inverso):");
        for (int i = nombrespok.length - 1; i >= 0; i--) {
            System.out.println(nombrespok[i]);
        }
    }
}


/* PONER EN ORDEN INVERSO UN array 

int[] array = {1, 2, 3, 4, 5};
for (int i = array.length - 1; i >= 0; i--) {
    System.out.println(array[i]);
}

*/
import java.util.Scanner;

public class saludo {

    // Método público para saludar
    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Pedimos el nombre
        System.out.print("Dime tu nombre: ");
        String nombre = lector.nextLine();
        // Llamamos al método saludar
        saludar(nombre);

    }
}

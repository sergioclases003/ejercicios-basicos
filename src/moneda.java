import java.util.Scanner;
import java.util.Random;
public class moneda {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("¿Cuántas veces quieres tirar la moneda? ");


        int tiradas = lector.nextInt();
        Random miGeneradorAleatorio = new Random();
        for (int tiradaActual = 1; tiradaActual <= tiradas; tiradaActual++) {
        boolean siguientevalorTirado = miGeneradorAleatorio.nextBoolean();

        if (siguientevalorTirado) {
            //ha sido cara  
            System.out.print("\nLa tirada " + tiradaActual + " ha sido cara");
        } else {
            //no ha sido cara
            System.out.print("\nLa tirada " + tiradaActual + " ha sido cara");
        }
       }

    }
}

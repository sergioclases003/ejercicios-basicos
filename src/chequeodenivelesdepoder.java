import java.util.Scanner;

public class chequeodenivelesdepoder {
    public static void main(String[] args) {

        String[] saiyans = {"Goku", "Vegeta", "Gohan", "Broly", "Raditz"}; //sayians
        int[] poderes = {9000, 8500, 7000, 12000, 3000}; // poderes

        Scanner sc = new Scanner(System.in);
        String continuar = "si"; //se escribe si, continuar con el bucle 

        //while ignorando MAYUS con *equalsIgnoreCase()*
        while (continuar.equalsIgnoreCase("si")) {
            System.out.print("¿De qué Saiyan quieres conocer el poder? ");
            String nombre = sc.nextLine();
            
            boolean encontrado = false; // incializa en FALSE
            
            for (int i = 0; i < saiyans.length; i++) {
                if (saiyans[i].equalsIgnoreCase(nombre)) {
                    System.out.println("El poder de " + saiyans[i] + " es " + poderes[i]);
                    encontrado = true; // se ha encontrado
                    break;
                }
            }
        
            if (!encontrado) {  // si encontrado false, no esta en la lista de sayians, entonces decir que no tengo datos
            	System.out.println("No tengo datos");	
            }
        } 
    } 
} 

import java.util.Scanner;

public class MaquinaRefrescos {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
    	// pregunto por saldo
    	System.out.print("Dime tu saldo: ");
    	int saldo = sc.nextInt(); // leo por pantalla lo que escribe
    	
    	// pregunto por el precio del refresco
    	System.out.print("Dime el precio del refresco: ");
    	int precio = sc.nextInt();
    	
    	// mientras saldo menor que precio, saldo insuficiente
    	// y volver a pedir de nuevo más saldo
    	while (saldo < precio) {
    		System.out.println("Saldo insuficiente: ");
    		System.out.print("Introducir más saldo: ");
            int extra = sc.nextInt();   // leo el saldo extra
            
            // le sumo lo que le falta
            saldo = saldo + extra;
    	}
    	
    	int cambio = saldo - precio;
    	System.out.println("Tu cambio es: " + cambio + " euros");
    }
}

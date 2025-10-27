import java.util.Scanner;

public class PicadorDeBloques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos bloques quieres picar? ");
        int bloques = sc.nextInt();

        for (int i = 1; i <= bloques; i++) {

            System.out.println("picando bloques " + i + "...");
        }

    }
}

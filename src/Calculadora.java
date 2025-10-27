import java.util.Scanner;

public class Calculadora {

    public static int sumar(int a, int b) {  //suma
        return a + b;
    }

    public static int restar(int a, int b) {  //resta
        return a - b;
    }

    public static int multiplicar(int a, int b) { //multiplicación
        return a * b;  
    }

    public static double dividir(double a, double b) {  //en este caso usaremos double para tener decimales
        return a / b;                                   // pq sino java lo trunca y quita decimales
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");  //primer número
        int num1 = sc.nextInt();

        System.out.print("Segundo número: ");  //segundo número
        int num2 = sc.nextInt();

        System.out.print("Operación (+, -, *, /): ");  //elige tipo de operación
        String op = sc.next();

        double resultado = 0;  //variable resultado empieza siendo 0
        
        if (op.equals("+")) {                            // depende del tipo de operación que escoja el user
            resultado = sumar(num1, num2);	             // se hará la operación con los números q nos da (num1 y num2)
        } else if (op.equals("-")) {
            resultado = restar(num1, num2);
        } else if (op.equals("*")) {
            resultado = multiplicar(num1, num2);
        } else if (op.equals("/")) {
            resultado = dividir(num1, num2);
        } else {
            System.out.println("Operación no válida");  // si no seleccionas ni [+,-,*,/] mostramos mensaje error
        }

        System.out.println("Resultado: " + resultado);

        sc.close();  //cerramos el scanner (buena práctica según el profe para evitar que siga abierto el input)
    }
}

public class ObjetosMinecraft {

    public static void main(String[] args) {
        
        // Array de objetos en el inventario
        String[] inventario = {"espada", "pico", "manzana dorada", "bloques de piedra", "antorchas"};
        
        // Recorremos el array e imprimimos cada objeto
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("Tienes en tu inventario: " + inventario[i]);
        }
        
        // Mostramos cuántos objetos hay
        System.out.println("Número total de objetos en el inventario: " + inventario.length);
    }
}

public class PuntuacionesDeJuego {

    public static void main(String[] args) {
        
        int[] puntuaciones = {1200, 2380, 1750, 980, 2100, 1990};
        
        int total = 0;
        int mayor = puntuaciones[0]; // iniciamos con el primer valor

        for (int i = 0; i < puntuaciones.length; i++) {
            total += puntuaciones[i]; // sumamos cada puntuación
            
            if (puntuaciones[i] > mayor) { 
                mayor = puntuaciones[i];  // actualizamos el récord
            }
        }

        
        double media = (double) total / puntuaciones.length;  // la media
        
        // Mostramos resultados
        System.out.println("La puntuación total fue de: " + total + " puntos");
        System.out.println("La media de puntos por partida fue de: " + (int)media);
        System.out.println("Tu récord fue de " + mayor + " puntos en una partida.");
    }
}

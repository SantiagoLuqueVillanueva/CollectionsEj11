import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("aire", "air");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("cielo", "sky");
        diccionario.put("ordenador", "computer");
        diccionario.put("teclado", "keyboard");
        diccionario.put("raton", "mouse");
        diccionario.put("pantalla", "screen");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("puerta", "door");
        diccionario.put("ventana", "window");
        diccionario.put("coche", "car");

        ArrayList<String> seleccion = new ArrayList(diccionario.keySet());

        Random random = new Random();

        int aciertos = 0;
        int fallos = 0;

        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(seleccion.size());

            String palabraPregunta = seleccion.get(indiceAleatorio);

            seleccion.remove(palabraPregunta);

            String respuestaCorrecta = diccionario.get(palabraPregunta);

            System.out.print("\n" + (i + 1) + ". ¿Cómo se dice '" + palabraPregunta + "' en inglés?: ");

            String respuesta = System.console().readLine();

            if (respuesta.equals(respuestaCorrecta)) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("Incorrecto.");
                fallos++;
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Respuestas correctas: " + aciertos);
        System.out.println("Respuestas erróneas: " + fallos);
    }
}

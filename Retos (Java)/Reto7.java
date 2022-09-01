import java.util.HashMap;
import java.util.Map;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

public class Reto7 {
    
    public static void main(String[] args) {
        String frase = "Hola, me llamo Irina. Mi nombre completo es Irina de la Corte (IdlCM).";
        contarPalabras(frase);
    }

    public static void contarPalabras(String s){
        //paso 1: pasar a minúsculas y eliminar los signos de puntuación
        System.out.println(s);
        String aux = s.toLowerCase().replaceAll("\\p{Punct}", "");
        System.out.println(aux);
        if(!aux.isEmpty()){
            String[] a = aux.split(" ");
            System.out.println(a.length);
            Map<String, Integer> palabras = new HashMap<String, Integer>();
            for(String palabra : a){
                if(palabras.containsKey(palabra)){
                    palabras.put(palabra, palabras.get(palabra) + 1);
                }
                else{
                    palabras.put(palabra, 1);
                }
            }
            palabras.forEach((k, v) -> System.out.println(k + ": " + v));
      
        }
        else{
            System.out.println("0");
        }
    }
}

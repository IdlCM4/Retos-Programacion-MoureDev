import java.util.HashMap;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */
public class Reto9 {
   public static void main(String[] args) {
    System.out.println(morse("Irina de la Corte"));
   } 
   public static String morse(String texto){
    String codigoM = "";
    HashMap<String, String> alfabetoM = new HashMap<String, String>();
    alfabetoM.put("a", "._");
    alfabetoM.put("b", "_...");
    alfabetoM.put("c", "_._.");
    alfabetoM.put("ch", "____");
    alfabetoM.put("d", "_..");
    alfabetoM.put("e", ".");
    alfabetoM.put("f", ".._.");
    alfabetoM.put("g", "__.");
    alfabetoM.put("h", "....");
    alfabetoM.put("i", "..");
    alfabetoM.put("j", ".___");
    alfabetoM.put("k", "_._");
    alfabetoM.put("l", "._..");
    alfabetoM.put("m", "__");
    alfabetoM.put("n", "_.");
    alfabetoM.put("ñ", "__.__");
    alfabetoM.put("o", "___");
    alfabetoM.put("p", ".__.");
    alfabetoM.put("q", "__._");
    alfabetoM.put("r", "._.");
    alfabetoM.put("s", "...");
    alfabetoM.put("t", "_");
    alfabetoM.put("u", ".._");
    alfabetoM.put("v", "..._");
    alfabetoM.put("w", ".__");
    alfabetoM.put("x", "_.._");
    alfabetoM.put("y", "_.__");
    alfabetoM.put("z", "__..");
    alfabetoM.put("0", "_____");
    alfabetoM.put("1", ".____");
    alfabetoM.put("2", "..___");
    alfabetoM.put("3", "...__");
    alfabetoM.put("4", "...._");
    alfabetoM.put("5", ".....");
    alfabetoM.put("6", "_....");
    alfabetoM.put("7", "__...");
    alfabetoM.put("8", "___..");
    alfabetoM.put("9", "____.");
    alfabetoM.put(".", "._._._");
    alfabetoM.put(",", "__..__");
    alfabetoM.put("?", "..__..");
    alfabetoM.put("\"", "._.._.");
    alfabetoM.put("/", "_.._.");

    String aux = texto.toLowerCase();
    String[] a = aux.split(" ");
    String palabra;
    for (String s : a) {
        palabra = "";
        for(int i = 0; i < s.length(); i++){
            if((i + 1) < s.length() && s.charAt(i) == 'c' && s.charAt(i+1) == 'h'){
                palabra += alfabetoM.get("ch");
            }
            else{
                palabra += alfabetoM.get(s.charAt(i) + "");
            }
        }
        codigoM += palabra + "   ";
    }
    return codigoM;
   }
}

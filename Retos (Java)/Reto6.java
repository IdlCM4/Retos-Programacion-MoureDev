/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Reto6 {
    public static void main(String[] args){
        String cadena = "Hola Mundo";
        System.out.println(invertirCadena(cadena));  
    }

    public static String invertirCadena(String s){
        String res = "";
        for(int i = s.length() -1; i >=0; i--){
            res += s.charAt(i);
        }
        return res;
    }
}

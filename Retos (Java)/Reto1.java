/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
import java.util.Arrays;

public class Reto1
{

    public static boolean esAnagrama(String a, String b){
            //1) mirar si tienen el mismo tamaño
            if(a.length() != b.length()){
                return false;
            }
            
            //2) ordenar las letras, si son iguales son anagramas         
            char[] A = a.toCharArray(), B = b.toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);
            if(Arrays.equals(A, B)){
                return true;
            }
            else return false;
        }

    public static void main(String[] args) {
		System.out.println(esAnagrama("amor", "roma"));
        System.out.println(esAnagrama("pico", "oicp"));
        System.out.println(esAnagrama("amor", "romo"));
	}
}
/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */
public class Reto11 {
   public static void main(String[] args) {
    //cadenas("Irina", "Bossu");
    cadenas("Me gusta correr", "Me gusta andaj");
   }
   
   public static void cadenas(String s1, String s2){
    String a1 = s1.toLowerCase().replace(" ", ""), 
            a2 = s2.toLowerCase().replace(" ", ""),
            out1 = a1, out2 = a2;
    for (int i = 0; i < a1.length(); i++) {
        out2 = out2.replace(a1.substring(i, i+1), "");
    }
    for (int i = 0; i < a2.length(); i++) {
        out1 = out1.replace(a2.substring(i, i+1), "");
    }
    System.out.println(out1);
    System.out.println(out2);

   }
}

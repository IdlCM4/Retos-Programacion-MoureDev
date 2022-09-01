/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
public class Reto8 {

    public static void main(String[] args) {
        int decimal = 95;
        System.out.println(aBinario(decimal));
    }

    public static String aBinario(int num){
        String resul = "", r = "";
        int den = num, res = 0;
        while(den!=0){
            res = den%2;
            den/=2;
            r += res;
        }
        for(int i = r.length() - 1; i >= 0; i--){
            resul += r.charAt(i);
        }
        return resul;
    }
}

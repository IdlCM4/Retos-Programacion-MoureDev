/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */
public class Reto10 {
    public static void main(String[] args) {
        String e1 = "{ [ a * ( c + d ) ] - 5 }", 
                e2 = "{ a * ( c + d ) ] - 5 }";
        System.out.println(balanceada(e1));
        System.out.println(balanceada(e2));
    }

    public static boolean balanceada(String s){
        int parI = 0, parD = 0, llaveI = 0, llaveD = 0, corI = 0, corD = 0;
        String a = s.toLowerCase().replace(" ", "");
        for(int i = 0; i < a.length(); i++){
            switch(a.charAt(i)){
                case '(':
                    parI++;
                break;
                case ')':
                    parD++;
                break;
                case '[':
                    corI++;
                break;
                case ']':
                    corD++;
                break;
                case '{':
                    llaveI++;
                break;
                case '}':
                    llaveD++;
                break;
                default:
                break;
            }
        }
        if((parI == parD) && (llaveI == llaveD) && (corI == corD)){
            return true;
        }
        else return false;
    }
}

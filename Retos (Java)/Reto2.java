/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Reto2 {

    public static void fibonacci(){
        String s = "";
        double p1 = 0, p2 = 1; //pivotes
        for(int i = 0; i < 50; i++){
            s += p1 + ", ";
            double aux = p1 + p2; //recalcula fibonacci de esa secuencia
            //actualizo los pivotes
            p1 = p2; 
            p2 = aux;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
		fibonacci();
	}

}

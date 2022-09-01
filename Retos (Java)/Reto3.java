/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Reto3 {
   public static boolean esPrimo(int num){
    if(num > 1){
        int a = 2;
        boolean primo = true;
        while(primo && a < num){
            if(num%a == 0){
                primo = false;
            }
            else{
                a++;
            }
        }
        return primo;
    }
    else return false;
   } 

   public static void main(String[] args) {
    int a = 0, i = 0;
    while(a < 100){
        if(esPrimo(i)){
            System.out.println(i);
            a++;
        }
        i++; 
    }
    
    
    }
}

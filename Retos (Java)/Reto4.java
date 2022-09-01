/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Reto4 {
    

    public static void main(String[] args){
        /*Triangulo t = new Triangulo(6, 2);
        Cuadrado c = new Cuadrado(2);
        Rectangulo r = new Rectangulo(4, 9);
        
        System.out.println(t.area());
        System.out.println(c.area());
        System.out.println(r.area());
        */
    }


    interface Poligono{
        //public float base = 0, altura = 0;
        public float area();
    }

    class Triangulo implements Poligono{   
        public float base;
        public float altura;

        public Triangulo(float base, float altura){
            this.base = base;
            this.altura = altura;
        }

        public float area() {
            return base*altura/2;
        }
    }

    class Rectangulo implements Poligono{
        public float base;
        public float altura;
        
        public Rectangulo(float base, float altura){
            this.base = base;
            this.altura = altura;
        }

        public float area() {
            return base*altura;
        }
    }

    class Cuadrado implements Poligono{
        public float lado;
        
        public Cuadrado(float lado){
            this.lado = lado;
        }

        public float area() {
            return lado*lado;
        }
    }


    
}

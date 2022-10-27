package DIO;

public class Quadrilatero {
    //Método Main
    public static void main(String[] args) {
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);
    }


    //Quadrilátero
    public static void area(double lado) {
        System.out.println("Área do quadrado:" + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura)/2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }
}

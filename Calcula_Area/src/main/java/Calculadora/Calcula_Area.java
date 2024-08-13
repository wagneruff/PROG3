package Calculadora;

public class Calcula_Area {

    public static void main(String[] args) {
        Quadrado q = new Quadrado(4, 5);
        Triangulo t = new Triangulo(4, 5);
        double res = q.area();
        System.out.print(res);
        System.out.println();       
        res = t.area();
        System.out.println(res);
    }
}

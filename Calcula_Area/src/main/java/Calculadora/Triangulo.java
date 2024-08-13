
package Calculadora;


public class Triangulo extends Quadrado{
        
    Triangulo(double altura, double base){
        super(altura, base);
    }
    
    @Override
    public double area(){
        return (base*altura)/2;
        
    }
}

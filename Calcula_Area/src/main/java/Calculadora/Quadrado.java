
package Calculadora;


public class Quadrado {
    public double base;
    public double altura;
    
    public Quadrado(double a, double b) {
        this.altura=a;
        this.base=b;
    }
    
    public double area(){
        return (this.base*this.altura);            
    }
}

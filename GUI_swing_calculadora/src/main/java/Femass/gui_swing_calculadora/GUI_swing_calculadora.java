package Femass.gui_swing_calculadora;

public class GUI_swing_calculadora {

    // Private atributos
    private float num1;
    private float num2;

    // Public métodos
    public void setNum1(float n1) {
        this.num1 = n1;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum2(float n2) {
        this.num2 = n2;
    }

    public float getNum2() {
        return num2;
    }

    public float calcular(int opcao) {
        switch(opcao) {
            case 0:
                return soma();
            case 1:
                return subtracao();
            case 2:
                return multiplicacao();
            case 3:
                return divisao();
            default:
                throw new IllegalArgumentException("Opção inválida");
        }
    }

    public float calcular(int opcao, float n1, float n2) {
        setNum1(n1);
        setNum2(n2);
        return calcular(opcao);
    }

    // Private métodos
    private float soma() {
        return num1 + num2;
    }

    private float soma(float n1, float n2) {
        return n1 + n2;
    }

    private float subtracao() {
        return num1 - num2;
    }

    private float subtracao(float n1, float n2) {
        return n1 - n2;
    }

    private float multiplicacao() {
        return num1 * num2;
    }

    private float multiplicacao(float n1, float n2) {
        return n1 * n2;
    }

    private float divisao() {
        if(num2 == 0) throw new ArithmeticException("Divisão por zero não permitida");
        return num1 / num2;
    }

    private float divisao(float n1, float n2) {
        if(n2 == 0) throw new ArithmeticException("Divisão por zero não permitida");
        return n1 / n2;
    }
}

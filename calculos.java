class Calculos {
    
    private double resultado;
    
    public Calculos(int a, int b) {
        this.resultado = a + b;
    }
    
    public Calculos(double a, double b) {
        this.resultado = a + b;
    }
    
    public double getResultado() {
        return resultado;
    }
}



public class calculadora {
    public static void main(String[] args) {
        Calculos metodoSomaInt = new Calculos(1, 2);
        Calculos metodoSomaDouble = new Calculos(3.75, 2.25);


        System.out.println("Soma de inteiros: " + metodoSomaInt.getResultado());
        System.out.println("Soma de doubles: " + metodoSomaDouble.getResultado());
    }
}

package main;

public class Divide  implements Operation{
    @Override
    public double execute(double a, double b) {
        if(b == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}

package main.java.operations;

import main.java.core.Operation;

public class Divide  implements Operation {
    @Override
    public double execute(double... operands) {
        if(operands[1] == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return operands[0] / operands[1];
    }
}

package main.java.operations;

import main.java.core.Operation;

public class Add implements Operation {


    @Override
    public double execute(double... operands) {
        return operands[0] + operands[1];
    }
}

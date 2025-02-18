package main.java.operations;

import main.java.core.Operation;

public class Power implements Operation {
    @Override
    public double execute(double... operands) {
        return Math.pow(operands[0], operands[1]);
    }
}

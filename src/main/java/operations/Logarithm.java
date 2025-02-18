package main.java.operations;

import main.java.core.Operation;

public class Logarithm implements Operation {
    @Override
    public double execute(double... operands) {
        return Math.log(operands[0]) / Math.log(operands[1]);
    }
}

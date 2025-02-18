package main.java.operations;

import main.java.core.Operation;

public class SquareRoot implements Operation {
    @Override
    public double execute(double... operands) {
        return Math.sqrt(operands[0]);
    }
}

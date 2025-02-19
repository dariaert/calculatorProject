package main.java.core;

import java.util.Map;

public class ExpressionParser {

    private final Map<Character, Operation> operations;
    private final Memory memory;

    public ExpressionParser(Map<Character, Operation> operations, Memory memory) {
        this.operations = operations;
        this.memory = memory;
    }

    private int precedence(char op) {
        return switch (op){
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
}

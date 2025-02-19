package main.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Memory {

    private final HashMap<String, Double> variables = new HashMap<>();
    private final List<String> history = new ArrayList<>();

    public void saveResult(String expression, double result){
        history.add(expression + " = " + result);
    }

    public List<String> getHistory(){
        return history;
    }

    public void setVariables(String name, double value){
        variables.put(name, value);
    }

    public double getVariables(String name){
        return variables.getOrDefault(name, null);
    }

}

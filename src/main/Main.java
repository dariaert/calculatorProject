package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter operation (+, -, /, *): ");
        char op = sc.next().charAt(0);

        Operation operation;
        switch (op){
            case '+':
                operation = new Add();
                break;
            case '-':
                operation = new Subtract();
                break;
            case '/':
                operation = new Divide();
                break;
            case '*':
                operation = new Multiply();
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        try {
            double result = operation.execute(num1, num2);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }

    }
}
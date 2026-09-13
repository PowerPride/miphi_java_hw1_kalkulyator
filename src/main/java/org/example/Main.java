package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstOperand = scanner.nextDouble(); //считывает число
        char operation = scanner.next().charAt(0);
        double secondOperand = scanner.nextDouble(); //считывает число
        switch (operation) {
            case '+':
                System.out.println(firstOperand + secondOperand);
                break;
            case '-':
                System.out.println(firstOperand - secondOperand);
                break;
            case '*':
                System.out.println(firstOperand * secondOperand);
                break;
            case '/':
                if (secondOperand == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    System.out.println(firstOperand / secondOperand);
                }
                break;
        }
    }
}
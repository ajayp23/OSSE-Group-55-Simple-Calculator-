package com.osse.group55.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();
		if(operator == '/')
			number2=checkNumber(number2,input);

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

			// performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
				
			//fixed issue #6	
			default:
                System.out.println("Invalid operator!");
                break;	
        }

        input.close();
    }
}

public static Double checkNumber(Double number2, Scanner sc) {
        while(number2 == 0) {
            System.out.println("Enter non-zero number as Number 2");
            number2 = sc.nextDouble();
        }
        return number2;
    }
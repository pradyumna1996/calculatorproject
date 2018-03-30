/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorpractice.util;

import calculatorpractice.main.Calculator;
import java.util.Scanner;

/**
 *
 * @author Anuzaa_2
 */
public class CalculatorCover {

    Calculator calc = new Calculator();
    
    private Scanner input;
    double x, y;
    int ch;

    public CalculatorCover() {
    }

    public CalculatorCover(Scanner input) {

        this.input = input;
    }

    public void entry() {

        System.out.println("Enter The Value A:");
        x = input.nextDouble();
        System.out.println("Enter The Value of B:");
        y = input.nextDouble();

    }

    public void show() {

        System.out.println("Value of A and B are : " + x + "  " + y);
    }

    public void menu() {
        System.out.println("------Menu-----");
        System.out.println("Chooose Your Number: ");
        System.out.println("1. Add");
        System.out.println("2.Subtract");
        System.out.println("3.Exit");
        System.out.println("Your Choice is :");
        ch = input.nextInt();
    }

    public void process() {

        switch (ch) {

            case 1:
                System.out.print("Sum is: ");
                System.out.println(calc.add(x, y));
                break;
            case 2:
                System.out.println("Difference is:");
                System.out.println(calc.sub(x, y));
                break;
            case 3:
                System.exit(0);
                break;
        }

    }

}

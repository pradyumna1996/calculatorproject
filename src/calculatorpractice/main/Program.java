/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorpractice.main;

import calculatorpractice.util.CalculatorCover;
import java.util.Scanner;

/**
 *
 * @author Anuzaa_2
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        CalculatorCover cv= new CalculatorCover(input);
        cv.entry();
        cv.show();
        cv.menu();
        cv.process();
    }
    
}

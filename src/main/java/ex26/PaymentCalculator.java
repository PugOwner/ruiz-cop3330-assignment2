/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex26;

import java.util.Scanner;

public class PaymentCalculator {
    public static void main( String[] args ){
        // not needed: double months;          // Output
        double APR = .12;                // Input
                       // Output
        double balance = 5000.0;         // Input
        double monthlyPayments = 100.0; // Input
        //i = (APR/100.0)/365.0;
        //Scanner scanner = new Scanner(System.in);
        double n = calculateMonthsUntilPaidOff(.12, 5000, 100);
        System.out.println("It will take you about "+n+" to pay off this card.");

    }

    static double calculateMonthsUntilPaidOff(double APR, double balance, double monthlyPayments){
        double i = (APR)/365.0;
        /*System.out.println("What is your balance?");
        balance = scanner.nextDouble();
        System.out.println("What is the APR on the card (as a percent not a decimal)?");
        APR = scanner.nextInt();
        System.out.println("What is the monthly payment you can make?");
        monthlyPayments = scanner.nextDouble();*/

        return Math.ceil(-(1.0/30.0) * Math.log(1.0 + balance/monthlyPayments * (1.0 - Math.pow(1.0 + i, 30.0))) / Math.log(1.0 + i));
    }
}
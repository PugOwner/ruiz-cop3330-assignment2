/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex31;

import java.util.Scanner;

public class App {
    public static void main(String [] args){
        inputValidation();
    }

    static void inputValidation(){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age.");
        boolean condition = true;
        while(condition) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input.");
                System.out.println("What is the rate of return?");
                scanner.next();
            }
            else condition = false;
        }   age = scanner.nextInt();
        int restingHR;
        System.out.println("Enter your resting heart rate.");
        boolean condition1 = true;

        while(condition1) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input.");
                System.out.println("What is the rate of return?");
                scanner.next();
            }
            else condition1 = false;
        }   restingHR = scanner.nextInt();

        karvonenHeartRate(age, restingHR);
    }
    static void karvonenHeartRate(int age, double restingHR){

        System.out.println("\tIntensity |   Rate\n" +
                           "\t-------------------\n");
        for (int i = 55; i <=95; i+=5){
            double targetedHeartRate = (((220.0-age)-restingHR)*i/100)+restingHR;
            System.out.println("\t"+i+"% |\t"+targetedHeartRate);
        }
    }
}

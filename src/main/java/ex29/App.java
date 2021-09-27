/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex29;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        System.out.println(estimateTime());
    }
    static double estimateTime(){

        System.out.println("What is the rate of return?");
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);

        while(condition) {
            if (!scanner.hasNextDouble()|| scanner.equals(0)) {
                condition = true;
                System.out.println("Invalid input.");
                System.out.println("What is the rate of return?");
                scanner.next();
            }
            else condition = false;
        }
        double rate = scanner.nextDouble();
        return 72.0/rate;
    }
}
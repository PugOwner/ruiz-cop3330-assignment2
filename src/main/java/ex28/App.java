/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex28;

/*Flow Chart
 * Ask them for their dumb numbers in a loop
 * Store number in variable named sum, which has an initial value of zero
 * Keep doing this till the user is asked a total of five time for their input
 * Add all the values to find the total
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println(addingNumbers());
    }
    public static double addingNumbers(){
        double num1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter you dumb number");
            num1 = scanner.nextDouble();
            sum += num1;
        }
        return sum;
    }


}
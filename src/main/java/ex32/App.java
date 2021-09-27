/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex32;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String [] args){
        guessingGame1();
    }

    public static void guessingGame1(){
        Random random =new Random();
        int guessCounter = 0;
        int randomNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=0;

            while (true){
                try{
                     n = scanner.nextInt();
                }catch (Exception e){
                    System.out.println("Number not selected, reenter a number to continue.");
                    n = scanner.nextInt();
                }
                if (n>randomNumber){
                    System.out.println("Lower");
                    System.out.println("Lower\nNumber of guesses: "+guessCounter);
                }
                else if (n<randomNumber){
                    System.out.println("Higher\nNumber of guesses: "+guessCounter);
                }
                else {
                    System.out.println("Correct");
                    break;
                }
            }
    }
}

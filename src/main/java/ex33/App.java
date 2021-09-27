/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String [] args){
        eightBall();
    }
    static void eightBall(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(4)+1;
        System.out.println(randomNumber+"\n");
        String message1 = "Yes";
        String message2 = "No";
        String message3 = "Maybe";
        String message4 = "Ask again later.";
        String message;

        System.out.println("What is your question?");
        String question = scanner.next();

        boolean condition = true;
        while (condition) {
            if (randomNumber==1){
                message = message1;
            }else if (randomNumber==2){
                message = message2;
            }else if (randomNumber==3){
                message = message3;
            }else{
                message = message4;
            }
            System.out.println(message+"\n");
            System.out.println("redo?");
            String again = scanner.next();
            if (again.equalsIgnoreCase("yes")) {
                condition = true;
            }
            else if (again.equalsIgnoreCase("no")){
                condition = false;
            }
            else{
                System.out.println("invalid entry");
            }
            System.out.println("What is your question?");
            question = scanner.next();
        }
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
            winner();
    }
    static void winner() {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;
        while (true) {
            System.out.println("\nEnter a name");
            names.add(scanner.next());
            System.out.println("Press 'e' to exit and find the winner.");
            if (names.contains("e")){
                break;
            }
            counter++;
            }
            System.out.println("\nContestants: "+names);
            System.out.print("The winner is : "+names.get(random.nextInt(counter-1)+1)+1);

    }
}

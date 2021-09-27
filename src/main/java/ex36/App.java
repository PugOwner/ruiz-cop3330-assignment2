/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex36;

import java.util.ArrayList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        average();
    }

    static double average() {

        ArrayList<Integer> data = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);


        do { int i=0;
            for (int i=0; i<data.size(i);i++)
                double total =+ data[i];
        }

        while (true) {
            try{
                System.out.println("\nEnter a number");
                data.add(Integer.parseInt(scanner.next()));
                for (int num:data){
                    int sum =+ num;
                    System.out.println(sum);
                }
                System.out.println("Press 'e' to exit.");
                System.out.println(data);
                //System.out.println(sum);


            }catch (Exception e){
                System.out.println("You entered an non digit character. Enter 'x' to exit, or any other character to continue");
                String  x = scanner.next();
                if (x.equalsIgnoreCase("x")){
                    break;
                }
            }
        }
        return data;
    }
}



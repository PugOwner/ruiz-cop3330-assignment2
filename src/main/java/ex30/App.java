/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex30;

public class App {
    public static void main(String[] args) {
        multiplicationTable();
    }
    public static void multiplicationTable(){
        for (int i = 1;i<=12;i++)
        {
            for (int j=1;j<=12;j++)
            {
                System.out.print((i*j)+"\t");
            }
            System.out.println("");
        }
    }
}

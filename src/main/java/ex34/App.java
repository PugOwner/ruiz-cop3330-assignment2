/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex34;

import java.util.*;

public class App {

    public static void main(String [] args){
        employList();
    }

    static void employList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList eList = new ArrayList();
        eList.add("John Smith,");
        eList.add("Jackie Jackson");
        eList.add("Amanda Cullen");
        System.out.println("\n\tThere are five employees");
        for(Object str:eList)
            System.out.println(str);
        System.out.println("\n\tEnter element to remove");
        String remove = scanner.next();
        for (Iterator<String> iterator = eList.iterator(); iterator.hasNext();) {
            String employ = iterator.next();
            if (employ.equalsIgnoreCase(remove)){
                iterator.remove();
            }
        }
        System.out.println("\tNew list");
        for(Object str:eList)
            System.out.println(str);
    }
}
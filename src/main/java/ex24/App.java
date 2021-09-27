/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string.");
        String string1 = scanner.next();
        System.out.println("Enter the second string.");
        String string2 = scanner.next();

        if (isAnagram(string1, string2)){
            System.out.println("Anagram.");
        }
        else {
            System.out.println("Not an anagram.");
        }

    }

    static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()){
            return false;
        }
        // Changes string to array
        char array1[] = string1.toCharArray();
        char array2[] = string2.toCharArray();

        // Sorting
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (char c : array1)
            System.out.println(c);
        for (char c : array2)
            System.out.println(c);

        for (int i = 0; i < string1.length(); i++){
            System.out.println("Array 1: "+array1[i]+"\nArray 2: "+array2[i]);
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}


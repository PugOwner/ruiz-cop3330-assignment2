/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        password = scanner.next();
        passwordStrength(password);
    }
    static void passwordStrength(String password) {
        int detector = passwordValidator(password);
        String strength;

        if (detector == 1){
            strength = " very weak";
        }
        else if (detector == 2){
            strength = " weak";
        }
        else if (detector == 3){
            strength = " strong";
        }
        else if (detector == 4){
            strength = " very strong";
        }
        else{
            strength = "undetectable based on the three rules.";
        }
        System.out.println("The password is "+strength);
    }
    static int passwordValidator(String password) {
        int digitCount = 0;
        int letterCount = 0;
        int specialCount = 0;
        char character;

        int passwordLength = password.length();

        for (int i=0; i<passwordLength;i++){
            character = password.charAt(i);
            if(character >= 'a' && character <='z' || character >= 'A' && character <= 'Z'){
                letterCount++;
            }
            else if (character >='0' && character <= '9'){
                digitCount++;
            }
            else {
                specialCount++;
            }
        }
        int scale;
        if (digitCount<8 && letterCount == 0 && specialCount == 0 && passwordLength < 8){
            scale = 1;
        }
        else if (digitCount == 0 && letterCount >= 1 && specialCount == 0 && passwordLength < 8){
            scale = 2;
        }
        else if (digitCount >= 1 && letterCount >= 1 && specialCount == 0 && passwordLength >= 8){
            scale = 3;
        }
        else if (digitCount >= 1 && letterCount >= 1 && specialCount >= 0 && passwordLength >= 8)
            scale = 4;
        else scale = 0;

        return scale;
    }
}

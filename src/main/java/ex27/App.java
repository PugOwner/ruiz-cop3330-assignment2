/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex27;



import java.util.Scanner;

public class App {
    /*
    The first name must be filled in.
    The last name must be filled in.
    The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name.");
        String firstName = scanner.next();

        System.out.println("Enter the last name.");
        String lastName = scanner.next();

        System.out.println("Enter the ZIP code");
        String zipCode = scanner.next();

        System.out.println("Enter the employ ID");
        String ID = scanner.next();

        validateInput(firstName, lastName, zipCode, ID);
    }

    static void validateInput(String firstName, String lastName, String zipCode, String ID) {
        if (validateFirstName(firstName) == false||validateLastName(lastName)==false||validateZipCode(zipCode)==false||validate_employID(ID)==false)
            System.out.println("\t **  INVALID ENTRIES ** .\n" +
                                "The first name must be at least 2 characters long.\n"+
                                "The last name must be at least 2 characters long.\n" +
                                "The last name must be filled in.\n" +
                                "The employee ID must be in the format of AA-1234.\n" +
                                "The zipcode must be a 5 digit number.");
        else System.out.println("There are no errors found");
    }

    private static boolean validateFirstName(String firstName) {
        int fCount = 0;
        int firstNameLength = firstName.length();
        if (firstNameLength < 2)
            return false;
        for (int i = 0; i < firstNameLength; i++) {
            char firstN = firstName.charAt(i);
            if (firstN >= 'a' && firstN <= 'z' || firstN >= 'A' && firstN <= 'Z') {
                fCount++;
            }
        }
        if (fCount != firstNameLength)
            return false;
        return true;
    }

    private static boolean validateLastName(String lastName) {
        int lCount = 0;
        int lastNameLength = lastName.length();
        if (lastNameLength < 2)
            return false;
        for (int i = 0; i < lastNameLength; i++) {
            char lastN = lastName.charAt(i);
            if (lastN >= 'a' && lastN <= 'z' || lastN >= 'A' && lastN <= 'Z') {
                lCount++;
            }
        }
        if (lCount != lastNameLength) {
            return false;
        }
        return true;
    }

    private static boolean validateZipCode(String zipCode) {
        int zCount = 0;
        int zipCodeLength = zipCode.length();

        for (int i = 0; i < zipCodeLength; i++) {
            char lastN = zipCode.charAt(i);
            if (!Character.isDigit(lastN)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validate_employID(String ID) {
        int idLength = ID.length();
        if (idLength !=7){
            return false;
        }
        for (int i = 0; i < 2; i++) {
            char id = ID.charAt(i);
            if (!Character.isLetter(id)) {
                return false;
            }
            if (ID.indexOf("-") != 2) {
                return false;
            }
        }
        for (int i = 3; i<6; i++){
            char id = ID.charAt(i);
            if (!Character.isDigit(id))
                return false;
        }
        return true;
    }

}
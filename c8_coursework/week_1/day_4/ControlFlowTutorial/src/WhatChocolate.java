import java.util.Scanner;

public class WhatChocolate {
    public static void main(String[] args) {
        // Prompt user to input their favourite chocolate
        // Collect user input
        // if chocolate is bounty, print "Gross"
        // otherwise, print "Yum"

        //This is called pseudocode. saves errors, missing anything, gives you brownie points.


        // Prompt user to input their favourite chocolate
        System.out.println("What is your favourite chocolate?");

        // Collect user input
        Scanner reader = new Scanner(System.in);
        String favouriteChocolate = reader.nextLine();

        // if chocolate is bounty, print "Gross"
        // otherwise, print "Yum"
        if (favouriteChocolate.equals("Bounty")) {
            System.out.println("Gross!");
        }
        else if (favouriteChocolate.equals("Crunchie")) {
            System.out.println("The Best!");
        }
        else if (favouriteChocolate.equals("Dairy Milk")) {
            System.out.println("Meh.");
        }

        else {
            System.out.println("Yum!");
        }

        String result = favouriteChocolate.equals("Bounty") ? "Gross" : "Yum";
        System.out.println(result);
    }
}

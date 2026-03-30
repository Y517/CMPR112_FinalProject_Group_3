/*
Group_3
CMPR 112 - Spring 2026
May 09, 2026
Final Project
Collaboration:
Dobritsa Alexey, Ahmed Elnaggar, Jake Goldberg, Aaron Matalon
*/

package com.mycompany.finalprojecta;
import java.util.Scanner;
/**
 *
 * @author jg01699
 */
public class Finalprojecta {

    public static void main(String[] args) {
        System.out.println("***" + " Group_3 " + "***");
        System.out.println();
        System.out.println("***" + " Main Menu " + "***");
        System.out.println();
        System.out.println("Please select one of the following:");
        System.out.println();
         System.out.println("1: Display my availible credit");
         System.out.println("2: Add credits to my account" );
         System.out.println("3: Play the Guesing Game");
         System.out.println("4: Display my Statistics");
         System.out.println("5: Save my Statistics");
         System.out.println("6: To exit");
         
    Scanner newScanner = new Scanner(System.in); 
    
    int menuInput = newScanner.nextInt();
    
     switch (menuInput){
        case 1->
            System.out.println("Monday");
            
        case 2->
            System.out.println("Tuesday");
            
        case 3-> 
            System.out.println("Wednesday");
            
        default -> 
             System.out.println("Invalid");
     }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalprojectparttwo;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.PrintWriter;

/**
Group_3
CMPR 112 - Spring 2026
May 09, 2026
Final Project
Collaboration:
Dobritsa Alexey, Ahmed Elnaggar, Jake Goldberg, Aaron Matalon
 * @author jg01699
 */
public class FinalProjectPartTwo {

    final static double MAX_ALLOWED = 20;
  
    
   static void mainMenu(double balance,double amount,int correctGuesses,int missedGuesses,String playerName)
   throws IOException{ 
      
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
         boolean correct = true;
         if (menuInput > 0 && menuInput <= 6)
         {
             correct = true;
         }
          else
         {
             correct = false;
         }    
         
     //   do {
        switch (menuInput){
        case 1:
            System.out.println("=> Your available balance is: $ " + balance);
            break;
        case 2:
            System.out.println("Please enter the amount of Credits to add");
            amount = newScanner.nextDouble();
            
            if (amount >= MAX_ALLOWED){
            System.out.println("Please reenter the amount of Credits to add");
            balance = balance + amount;
            }
            break;
        case 3:
            System.out.println("Play  the game");
            
            break;
        case 4:
            
             System.out.println("Data and Time");
             System.out.println("Players Name");
             System.out.println("Availible Credit: ");
             System.out.println("Games Played: ");
             System.out.println("Correct Guesses: ");
             System.out.println("Missed Guesses: ");
             System.out.println("Money you Won: ");
             System.out.println("Money you Lost: ");
             
            break;
        case 5:
             System.out.println("Saving statistics");
             System.out.println(" ");
           
        File outFile = new File("statsFile.txt");
        FileWriter output = new FileWriter(outFile, true);
       PrintWriter out = new PrintWriter(output);
             out.println("Data and Time");
            // output.write("Players Name");
            // output.write("Availible Credit: ");
            // output.write("Games Played: ");
            // output.write("Correct Guesses: ");
            // output.write("Missed Guesses: ");
            // output.write("Money you Won: ");
            // output.write("Money you Lost: ");
             System.out.println("is it writing");
             
             output.close();
            break;
        case 6:
            System.out.println("Thank you for using Group_3's software. Good Bye!");
            System.exit(0);
            break;
        default: 
             System.out.println("Invalid input");
             
             break;
     } // } while(correct);
        
   
   }
   
   
    
    
    public static void main(String[] args) throws IOException {
   
   
    
    double balance = 0; 
    double amount = 0;
    int correctGuesses = 0;
    int missedGuesses = 0;
    String playerName = "";
    Random rand = new Random();
    int randomInt = rand.nextInt(100);
// Menu Statements
       

     mainMenu( balance, amount, correctGuesses, missedGuesses, playerName);
     
   
    
    
   
     
     
    }
}

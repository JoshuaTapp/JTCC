package chapter07;

import myLibrary.getInput;

import java.util.Scanner;

public class ChineseZodiacArray {

    public static void main(String args[]){

    String[] animals = {"monkey" , "rooster" , "dog" , "pig" , " rat" , "ox" , "tiger" , "rabbit" , "dragon" , "snake" , "horse" , "sheep" };

    System.out.print("Enter a year: ");
    Scanner input = new Scanner(System.in);

    int year = getInput.createInt();
    System.out.println(animals[year%12]);
    }

}

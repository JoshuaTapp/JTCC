package chapter12;

import myLibrary.getInput;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    public static void main(String arg[]){

        int[] array = new int[100];
        for(int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int input = sc.nextInt();

        try{
            System.out.println("The element is " + array[input]);
        }
        catch(ArrayIndexOutOfBoundsException er){
            System.out.println("Out of Bounds");
        }

    }
}

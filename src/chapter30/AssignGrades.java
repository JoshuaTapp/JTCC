/*
 * Created on 4/30/19 12:15 AM by Joshua Tapp
 * Student at John Tyler Community College
 */

/*
 * Created on 4/23/19 4:04 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

package chapter30;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AssignGrades {

    static int max;

    public static void main(String[] args){

        System.out.print("Enter number of students: ");
        Scanner input = new Scanner(System.in);

        int[] scores = new int[input.nextInt()];

        System.out.print("Enter " + scores.length + "scores: ");

        for (int i = 0; i < scores.length ; i++) { scores[i] = input.nextInt(); }

        max = IntStream.of(scores).max().getAsInt();

        for(int i = 0; i < scores.length;i++){
            int score = IntStream.of(scores[i]).findFirst().getAsInt();
            String grade = grader(score);
            System.out.println("Student " + i + " score is " +  score + " and grade is " + grade);
        }

    }
    public static String grader(int e){

        if(e >= max - 10)       {return "A";}
        else if(e >= max - 20)  {return "B";}
        else if(e >= max - 30)  {return "C";}
        else if(e >= max - 40)  {return "D";}
        else                    {return "F";}
    }
}

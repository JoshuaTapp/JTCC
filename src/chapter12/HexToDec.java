package chapter12;

import java.util.Scanner;

public class HexToDec {

    public static void main(String arg[]){

        System.out.print("Enter a hex number: ");
        Scanner sc = new Scanner(System.in);

        String hex = sc.nextLine();

        try{
            System.out.print("Decimal: " + HexToDec.HexToDecimal(hex));
        }catch(NumberFormatException ex){
            System.out.print(ex);
        }
    }

    public static int HexToDecimal(String hex){
        hex = hex.toLowerCase();
        int decimal = Integer.parseInt(hex.trim(), 16 );
        return decimal;
    }
}

package practice;

import java.util.Scanner;

public class ScannerEx {
    //read data from terminal
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = in.nextLine();
        System.out.println("you entered string; "+str);
    }

}

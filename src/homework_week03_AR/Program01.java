package homework_week03_AR;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        //define scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        m1(num);
    }

    //declare static method
    public static void m1(int num){
        //checking even or odd with ternary operator
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
    }

}

package step1;

import java.util.Scanner;

public class firstApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange\n"+"Banana\n"+"Apple\n");
    }

    public static void checkSumSign() {

        System.out.println("Check Sum. Positive or negative ?");

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        int a= in.nextInt();

        System.out.print("Input a number B: ");
        int b= in.nextInt();

        //in.close();

        int c = a + b;
        System.out.println("Sum:"+ c );

        if (c > 0) {
            System.out.print("Sum is positive");
        }
        if (c == 0) {
            System.out.print("Sum = null");
        }
        if (c < 0) {
            System.out.print("Sum is negative");
        }

    }

    public static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInter your number: ");
        int value = in.nextInt();

        if (value <= 0) {
            System.out.print("Red\n");
        }
        if (0 < value && value <= 100) {
            System.out.print("Yellow\n");
        }
        if (value > 100) {
            System.out.print("Green\n");
        }
    }

    public static void compareNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        int a= in.nextInt();

        System.out.print("Input a number B: ");
        int b= in.nextInt();

        if (a >= b) {
            System.out.print("A >= B");
        }
        else {
            System.out.print("A < B");
        }
    }
}

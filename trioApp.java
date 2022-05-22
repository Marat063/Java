package step3;

import java.util.Arrays;
import java.util.Scanner;

public class trioApp {
    public static void main(String args[]){

        //arrSwap();
        //arrHundred();
        //arrLes3();
        //arrLes4();
        arrLes5();

    }

    public static void arrSwap(){

        int[] arr = {0, 1, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));

        for(int o : arr){
            for (int i = 0; i < 3; i++){
                o= o + 1;
                if (o == 2){
                    o = o - 2;
                }
            }
            System.out.print(o + " ");
        }

    }

    public static void arrHundred(){
        int[] arrHun = new int [101];
        for (int i =1; i <= 100; i++){
            arrHun[i] = i;
            System.out.println("arr[" + i +"] = " + arrHun[i]);
        }
    }

    public static void arrLes3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));

        for(int o : arr){
            for (int i = 0; i < 3; i++){
                if(o < 6 ){
                    o = o * 2;
                }
            }
            System.out.print(o + " ");
        }

    }

    public static void arrLes4(){
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j){
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
                //table[i][j] = i;
                //System.out.print(table[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void arrLes5(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number args length: ");
        int len= in.nextInt();

        System.out.print("Input a number print in args: ");
        int initialValue= in.nextInt();

        int[] arr = new int [101];
        for ( int i =0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "; ");
        }
    }

}

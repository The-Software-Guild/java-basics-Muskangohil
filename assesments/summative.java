package assesments;

import java.util.Scanner;

public class summative {
    public static void main(String[] args) {


        int A[]= new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15};
        int B[]= new int[]{ 999, -60, -77, 14, 160, 301 };
        int C[]= new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.println("Sum of the 1st array: "+turn(A));
        System.out.println("Sum of the 2nd array: "+turn(B));
        System.out.println("Sum of the 3rd array: "+turn(C));

    }
    public static int turn(int[] arr){
        int sum =0;
        for (int i=0; i<arr.length;i++){
            sum += arr[i];

        }
        return sum;
    }
}

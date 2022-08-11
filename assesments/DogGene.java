package assesments;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DogGene {


    public static void main(String[] args) {
        Random rng = new Random();
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String res = "";

        int num1 = rng.nextInt(100 - sum);

        int sum1 = sum + num1;


        int num2 = rng.nextInt(100 - sum1); //+ sum1;
        int sum2 = sum1 + num2;

        int num3 = rng.nextInt(100 - sum2);

        String[] breeds = new String[]{"lambrador", "pug", "chihuahua"};

        System.out.println("please enter the your dogs name");
        res = scan.nextLine();
        System.out.println("The Report for the:" + res + " is as follows: \n" + breeds[0] +": "+ num1 +"\n"+breeds[1] +": "+ num2 +"\n"+breeds[2] +": "+ num3);


    }
}




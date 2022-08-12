package assesments;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class HeartRatecalc {
    public static void main(String[] args) {
        String rr = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your age: ");
         rr = scan.nextLine();
         int ans = -999;
         try {
             ans = Integer.parseInt(rr);

         }catch(NumberFormatException e){
            System.out.println("invalid response, try again");
        }

        if (ans != -999) {
            int maxHR = 220- ans;
            int MinTarget = (int) Math.round(maxHR *0.5);
            int MaxTarget = (int) Math.round(maxHR *0.85);

            System.out.println("Your maximum heart rate should be "+maxHR + " beats per minute\n" +
                    "Your target HR Zone is "+ MinTarget +"-"+MaxTarget +" beats per minute" );
        }else{
            int maxHR = 220- ans;
            int MinTarget = (int) Math.round(maxHR *0.5);
            int MaxTarget = (int) Math.round(maxHR *0.85);

            System.out.println("Your maximum heart rate should be "+maxHR + " beats per minute\n" +
                    "Your target HR Zone is "+ MinTarget +"-"+MaxTarget +" beats per minute" );

        }

    }


}


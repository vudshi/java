/**
 * Created by lsm on 4/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

/**
 * Game guess the number from 1 to 3
 *
 * @author Alex Smith
 * @version 1.0
 */
public class GuessNumber {
    public static void main(String[] args) throws Exception {
        // Constants
        final String STOP_GAME = "stop"; //the end by user wish
        final int MIN = 1; //min random value
        final int MAX = 3; //max random value
        // Messages
        final String END_GAME = "The end.";
        final String WELLCOME = "-= Guess number =-";
        final String ROOLS = "Guess number from 1 to 3 to win";
        final String START_GAME = "Enter number ";
        final String STEP_NEXT = "Next try." + START_GAME;
        final String STEP_WIN = "!! WIN !!";

        int iTarget;
        int iDummy;

        //init target
        iTarget = (int) (MAX * Math.random() + MIN);

        //welcome text
        System.out.println(WELLCOME);
        System.out.println(ROOLS);
        System.out.println(START_GAME);

        while (true) {
            //read line
            String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
            // check if user set stop or win
            if (input.equals(STOP_GAME)) {
                System.out.println(END_GAME);
                return;
            } else {
                iDummy = Integer.parseInt(input);
                // Win step
                if (iDummy == iTarget) {
                    System.out.println(STEP_WIN);
                    System.out.println(END_GAME);
                    return;
                }
            }
            //next try
            System.out.println(STEP_NEXT);

        }//while(true)
    }
}

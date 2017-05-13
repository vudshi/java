/**
 * Created by lsm on 4/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Text
 * {@code cursive}, {@code cursive 1}, {@code cursive 2}
 *
 * @author Alex Smith
 * @version 1.0
 */
public class Main {
    /**
     * @param args arguments in program
     * @throws Exception exception when
     */
    public static void main(String[] args) throws Exception {
        final int TWO = 2;
        int i;
        while (true) {

            String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (input.equals("exit")) {
                return;
            }
            int inputInteger;

            inputInteger = Integer.parseInt(input);

            /*if (inputInteger % TWO == 0) {
                int b = 1;
                inputInteger *= inputInteger;
                //System.out.println(a);
                //System.out.println(b);
            } else {
                inputInteger++;
            }*/

            switch (inputInteger % TWO) {
                case 0:
                    inputInteger *= inputInteger;
                    break;
                default:
                    inputInteger++;
                    break;
            }

            System.out.println(inputInteger);
        }
    }
}


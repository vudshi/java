import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lsm on 4/22/2017.
 */
public class Greatest {
    public static void main(String[] args) throws Exception {
        final String INTRO_GET_VALUES = "Enter a number of numbers";
        final String END_PRINT_MAX = "Max value is %d and min vslue is %d";
        final String END_PRINT_ERROR = "Unreadble string of numbers";
        final String PATTERN = "-?\\d+";
        Matcher m;
        int liDummy = 0, liMin, liMax, liNext;
        String lsDummy;

        System.out.println(INTRO_GET_VALUES);

        lsDummy = new BufferedReader(new InputStreamReader(System.in)).readLine();
        m = Pattern.compile(PATTERN).matcher(lsDummy.substring(liDummy));
        if (m.find()) {
            liMin = Integer.parseInt(m.group(0));
            liMax = Integer.parseInt(m.group(0));
            while (m.find()) {
                liDummy = liDummy + m.end(0);
                liNext = Integer.parseInt(m.group(0));
                liMin = (liNext < liMin) ? liNext : liMin;
                liMax = (liNext > liMax) ? liNext : liMax;
                m = Pattern.compile(PATTERN).matcher(lsDummy.substring(liDummy));
            }
            System.out.println(String.format(END_PRINT_MAX, liMax, liMin));
        } else {
            System.out.println(END_PRINT_ERROR);
        }

    }
}

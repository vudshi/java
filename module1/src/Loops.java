import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by lsm on 4/24/2017.
 */
public class Loops {
    public static void main(String[] args) throws Exception{
        final String INTRO_GET_VALUES = "Enter 3 number (Borders and step)";
        final String PATTERN = "-?\\d+";
        int liBound, liABound, liStep, liDirection;
        int laArr[] = new int[3];
        Matcher m;
        int liDummy = 0, i = 0;
        String lsDummy;


        System.out.println(INTRO_GET_VALUES);

        lsDummy = new BufferedReader(new InputStreamReader(System.in)).readLine();
        m = Pattern.compile(PATTERN).matcher(lsDummy.substring(liDummy));

        while (i <= laArr.length && m.find()) {
            laArr[i] = Integer.parseInt(m.group(0));
            liDummy=liDummy + m.end(0);
            i++;
        }

        liBound = laArr[0];
        liABound = laArr[1];
        liStep = laArr[2];
        liStep = (liStep == 0) ? 1 : liStep;

        liDirection = (liStep >> -1) + ((liStep >> -1) + 1); // convert 0 -> 1 and -1 -> -1

        if ((liBound > liABound && liDirection > 0) ||
                (liBound < liABound && liDirection < 0)
                ){
            liBound = liBound + liABound;
            liABound = liBound - liABound;
            liBound = liBound - liABound;
        }
        liABound = liABound * liDirection;

        //System.out.println(String.format("%d %d %d", liBound, liABound, liDirection));

        System.out.print("For :");
        for (i = liBound; i * liDirection<= liABound; i += liStep){
            System.out.print(String.format("%d,", i));
        }

        i = liBound;
        System.out.println("");
        System.out.print("Wile:");
        while (i * liDirection <= liABound) {
            System.out.print(String.format("%d,", i));
            i += liStep;
        }

        i = liBound;
        System.out.println("");
        System.out.print("Do  :");
        do {
            System.out.print(String.format("%d,", i));
            i += liStep;
        } while (i * liDirection <= liABound);
    }
}

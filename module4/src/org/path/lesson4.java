package org.path;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by lsm on 4/26/2017.
 */
public class lesson4 {
    public static void main(String[] args) {

        final String BASE_STRING = "first second third forth last";
        final String CENTRAL_STRING = "forth";
        final String DELIMETER = " ";

        //!!!!
        //StringTokenizer tokenizer = new StringTokenizer("111-222-333-444", "-");

         String strSource = null, strFirst = null, strLast = null, strCentral = null;// = new Scanner(System.in).nextLine();
         strSource = BASE_STRING;
         String strResult, strDummy;
         String strArr[];// = new String[5];

        strFirst = strSource.substring(0, strSource.indexOf(DELIMETER));
        strLast = strSource.substring(strSource.lastIndexOf(DELIMETER) + 1);
        strCentral = strSource.substring(strSource.indexOf(CENTRAL_STRING), strSource.indexOf(DELIMETER,strSource.indexOf(CENTRAL_STRING)));

        System.out.println(new String(strLast).concat(strCentral).concat(strFirst));
        System.out.println(new String(strCentral).concat(strFirst));
        System.out.println(new String(strSource.substring(0, 1).toUpperCase()).concat(strSource.substring(1)));

        System.out.println("--------------------------------------------");
        strArr = strSource.split(DELIMETER);

        System.out.println(new String(strArr[strArr.length -1]).concat(GetArrValByVal(strArr, CENTRAL_STRING)).concat(strArr[0]));
        System.out.println(new String(strArr[IndexOfByVal(strArr, CENTRAL_STRING)]).concat(strArr[strArr.length -1]));
        System.out.println(new String(strSource.substring(0, 1).toUpperCase()).concat(strSource.substring(1)));

        System.out.println("--------------------------------------------");
        StringBuilder  builder = new StringBuilder();
        builder.append(strArr[strArr.length -1]).append(strArr[IndexOfByVal(strArr, CENTRAL_STRING)]).append(strArr[0]);
        System.out.println(builder);
        builder.setLength(0);
        builder.append(GetArrValByVal(strArr, CENTRAL_STRING)).append(strArr[strArr.length -1]);
        System.out.println(builder);
        builder.setLength(0);
        builder.append(strSource);
        System.out.println(builder.substring(0, 1).toUpperCase().concat(builder.substring(1)));
        System.out.println("--------------------------------------------");
        // пользователь вводит строку, состоящую из нескольких слов,
        // first world middle words last word
        // 1. lw + cw + fw
        // 2. cw + lw
        // 3. Sentence case
        // 4. Переделать п. 1-3 на mutable string
        //System.out.println(strSource.indexOf(DELIMETER, 0));

        //Arrays.asList(strArr).clear();

        //System.out.println(Arrays.asList(strArr).contains(CENTRAL_STRING));

        int Dummy = 0, indx = 0, cnt = 0;
        int strLen = strSource.length();
        while (Dummy < strLen) {
            indx = strSource.indexOf(DELIMETER, Dummy);
            if(indx == -1) {
                Dummy = strLen;
                Arrays.asList(strArr).add(strSource.substring(Dummy));
            } else {
                Arrays.asList(strArr).add(strSource.substring(Dummy, indx));
                Dummy = indx + 1;
                cnt++;
            }
        }

        for (int l = 0; l < strArr.length - 1; l++) {
            System.out.println("array val " + strArr[l]);
        }
        /*while (Dummy < strLen) {
            indx = strSource.indexOf(DELIMETER, Dummy);
            if(indx == -1) {
                Dummy = strLen;
                strLast = strSource.substring(Dummy);
            } else {
                strDummy = strSource.substring(Dummy, indx);
                System.out.println(strDummy);
                if (cnt == 0) {
                    strFirst = strDummy;
                }
                if (strDummy.equals(CENTRAL_STRING)) {
                    strCentral = strDummy;
                }
                Dummy = indx + 1;
                cnt++;
            }
        }*/
        System.out.println(String.format("%s %s %s", strFirst, strCentral, strLast));
    }



    public static String GetArrValByVal(String[] pArr, String pStr) {
        int liDummy = IndexOfByVal(pArr, pStr);
        return (liDummy == -1) ? "" : pArr[liDummy];
    }

    public static int IndexOfByVal(String[] pArr, String pStr) {
        int result = 0;
        for(int i = 0; i < pArr.length; i++) {
            if(pArr[i].equals(pStr)) {
                result = i;
            }
        }
        return result;
    }
}

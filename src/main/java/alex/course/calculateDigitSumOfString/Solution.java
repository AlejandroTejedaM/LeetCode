package alex.course.calculateDigitSumOfString;

import java.util.ArrayList;

public class Solution {
    /*public static String divGroupsByString(String s) {
        if (s.length() == 0) {
            return "";
        } else {
            s = s.substring(0, s.length() - 1);
        }
        return divGroupsByString(s) + s;
    }*/

    public static String digitSum(String s, int k) {
        ArrayList<String> groups = new ArrayList<>();
        int numberOfGroups = (int) Math.ceil((double) s.length() / k);
        //Groups division
        String sFirstRound = s;
        for (int i = 0; i <= sFirstRound.length() - 1; i += k) {
            String group = "";
            if (groups.size() == numberOfGroups - 1) {
                group += s.substring(i, s.length() - 1 + 1);
            } else {
                group += s.substring(i, (i + k));
            }
            if(){

            }
        }
        //Calculate the digit sum
        sFirstRound = "";
        for (String a : groups) {
            int sum = 0;
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.charAt(i));
                sum += Integer.parseInt(String.valueOf(a.charAt(i)));
            }
            if (sum % k == 0) {

            } else {
                
            }
            sFirstRound += sum;
        }
        return sFirstRound;
    }

    public static void main(String[] args) {
        System.out.println(digitSum("111112223", 3));
    }
}

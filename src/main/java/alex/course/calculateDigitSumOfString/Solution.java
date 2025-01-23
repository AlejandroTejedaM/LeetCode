package alex.course.calculateDigitSumOfString;

import java.util.ArrayList;

public class Solution {

    public static String digitSum(String s, int k) {
        String groups = "";
        int numberOfGroups = (int) Math.ceil((double) s.length() / k);
        String stringRound = s;
        int i;
        int l;
        int j;
        for (i = 0; i <= stringRound.length() - 1; i += k) {
            String group = "";
            if(s.length() == k){
                return s;
            }
            var tamannio = groups.length();
            if (tamannio >= numberOfGroups - 1) {
                group += stringRound.substring(i, stringRound.length() - 1 + 1);
                System.out.println(group);
                int sum = 0;
                for (l = 0; l < group.length(); l++) {
                    sum += Integer.parseInt(String.valueOf(group.charAt(l)));
                }
                String sumString = String.valueOf(sum);
                if (!(sumString.length() < k)) {
                    for (j = 0; j <= sumString.length() - 1; j += k) {
                        groups += sumString.substring(j, (j + k));
                    }
                } else {
                    groups += sumString;
                }
            } else {
                group += stringRound.substring(i, (i + k));
                System.out.println(group);
                int sum = 0;
                for (l = 0; l < group.length(); l++) {
                    sum += Integer.parseInt(String.valueOf(group.charAt(l)));
                }
                String sumString = String.valueOf(sum);
                if (!(sumString.length() < k)) {
                    for (j = 0; j <= sumString.length() - 1; j += k) {
                        groups += sumString.substring(j, (j + k));
                    }
                } else {
                    groups += sumString;
                }
            }
            if (i + k > stringRound.length() && groups.length() > k) {
                i = -k;
                numberOfGroups = (int) Math.ceil((double) groups.length() / k);
                stringRound = "";
                stringRound = groups;
                groups = "";
            }
        }
        return groups;
    }

    public static void main(String[] args) {
        System.out.println(digitSum("01234567890", 2));
        //01 23 45 67 89 0
        //1 5 9 13 17 0
        //15 91 31 70
        //6 10 4 7
        //61 04 7
        //7 4 7
        //74 7
        //11 7
        //27
    }
}

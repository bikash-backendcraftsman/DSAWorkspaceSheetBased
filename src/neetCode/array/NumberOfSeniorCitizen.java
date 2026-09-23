package neetCode.array;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSeniorCitizen {
    public static void main(String[] args) {
        //String[] details = {"1313579440F2036","2921522980M5644"};
        //String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        String[] details = {"4444444444F6030","5555555555M7041","6666666666O4055","7777777777F6021"};
       int strictValidAge = countSeniors(details);
        System.out.println(strictValidAge);
    }

    private static int countSeniors(String[] details) {
        //edge case
        if(details.length == 0){
            return -1;
        }

        int count = 0;

        for(int i = 0;i<details.length;i++){
            String val = details[i];
            String substring = val.substring(11, 13);
            int ageValidation = Integer.parseInt(substring);
            if(ageValidation > 60){
                count++;
            }
        }
        return count;
    }
}

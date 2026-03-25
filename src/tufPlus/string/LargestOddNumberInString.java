package tufPlus.string;

public class LargestOddNumberInString {
    public static void main(String[] args) {
         String s = "0214638";
         String largetVal = getLargestOdddNumberInString(s);
        System.out.println(largetVal.toString());
    }

    private static String getLargestOdddNumberInString(String s) {
        if(s == null || s.length() == 0) return String.valueOf(-1);

        int intVal  = -1;
        //step : 1
        for(int i = s.length() - 1; i >= 0 ; i--){
            if((s.charAt(i) - '0' % 2) == 1){
                intVal = i;
                break;
            }
        }
        // No odd digit found
        if (intVal == -1) return "";

        String ans = s.substring(0,intVal + 1);
        int j = 0;
        while(j < ans.length() && ans.charAt(j) == '0'){
            j++;
        }
        return j == ans.length() ? "" : ans.substring(j);
    }
}

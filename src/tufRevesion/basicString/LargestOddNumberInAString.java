package tufRevesion.basicString;

public class LargestOddNumberInAString {
    public static void main(String[] args) {
        String s = "021436800"; //case 1 : 021436800 3542786
        String val = findLargestOddNumberInString(s);
        System.out.println(val);
    }

    private static String findLargestOddNumberInString(String s) {

        int n = s.length() - 1;
        while(n >= 0){
            if((s.charAt(n) - '0') % 2 == 1){
                String prefix = s.substring(0, n + 1);

             // Step 2: remove leading zeros
                int i = 0;
                while (i < prefix.length() && prefix.charAt(i) == '0'){
                    i++;
                }
                return  i == prefix.length() ? "" : prefix.substring(i);
            }
            n --;
        }
        return "";
    }
}

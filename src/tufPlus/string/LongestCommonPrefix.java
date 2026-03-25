package tufPlus.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strArray = {"flower","flow","flight"};

        String val = longestCommonPrefix(strArray);
        System.out.println(val);
    }

    private static String longestCommonPrefix(String[] str) {
        //edge cases
        if(str == null || str.length == 0){
            return "";
        }
    
        //take first string as reference
        String prefix = str[0];

        //iterate the prefix variable and and get the curerent character

        for(int i = 0;i<prefix.length();i++){

            char currentChar = prefix.charAt(i);

            // now 2nd loop will check if current character will match with other index of the string

            for(int j = 1 ;j<str.length;j++){

                if(i >= str[j].length() || str[j].charAt(i) != currentChar){
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix;
    }
}

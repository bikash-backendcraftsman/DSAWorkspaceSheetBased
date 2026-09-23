package neetCode.array;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
       int val =  lengthOfLastWord( s);
        System.out.println(val);
    }

    private static int lengthOfLastWord(String s) {
        //edge case
        if (s.length() == 0 || s == null) {
            return -1;
        }

        StringBuilder sb = new StringBuilder();
        String trim = s.trim();
        String val = null;
        for (int i = trim.length() - 1; i >= 0; i--) {
            if (trim.charAt(i) == ' ') {
                break;
            }
            StringBuilder append = sb.append(trim.charAt(i));
            val = append.toString();
        }
        return val.length();
    }
}

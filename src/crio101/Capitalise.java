package crio101;

public class Capitalise {
    public static void main(String[] args) {
        String str = "tomorrow is holiday";
       String collect =  extracted(str);
        System.out.println(collect);
    }

    private static String  extracted(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(i == 0 ||str.charAt(i -1) == ' '){
               if(c >= 'a' && c <= 'z'){
                    c = (char) (c - 32);
               }
            }
             builder.append(c);
        }
        return builder.toString();
    }
}

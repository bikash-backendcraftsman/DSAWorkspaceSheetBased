package crio101;

public class CountVowels {
    public static void main(String[] args) {
        String str = "APjjnneGMrCOhvtAlXUJhFGeFfvdvsiQfQXAhtmIqGahKXyWcPDxzqFtjFZbAenSpMScTMVdtSbYBxeCwFmxHvcJD";
      int count =  countVowelsInString(str);
        System.out.println(count);
    }

    private static int countVowelsInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Check for both lowercase and uppercase vowels
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }


}

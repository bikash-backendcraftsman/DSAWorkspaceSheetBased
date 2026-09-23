package neetCode.twoPointer;

public class MergeStringAlternatively {
    public static void main(String[] args) {
       String word1 = "abc";
       String word2 = "xyz";
       String val = mergeAlternately( word1,  word2);
        System.out.println(val);
    }

    private static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder builder = new StringBuilder();
        while(i < word1.length() && j < word2.length()){
            if((char) word1.charAt(i) < (char) word2.charAt(j) || (char) word1.charAt(i) == (char)  word2.charAt(j)){
                builder.append(word1.charAt(i));
                if((char) word2.charAt(j) > (char) word1.charAt(i) || (char) word1.charAt(i) == (char)  word2.charAt(j)){
                    builder.append(word2.charAt(j));
                }
            }else {
               if(word2.length() > word1.length() && j < i){
                   builder.append(word2.charAt(j));
               }
            }
            i++;
            j++;

            while(i < word1.length() && j < word2.length()){
                char ch1 = word1.charAt(i);
                char ch2 = word2.charAt(j);

                builder.append(ch1);
                builder.append(ch2);
            }

        }
        return builder.toString();
    }
}

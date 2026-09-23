package neetCode.twoPointer;

public class ValidWordAbbreviation {
   public static void main(String[] args) {
       String word = "apple";
       String abbr = "a2le";
       boolean val = validWordAbbreviation(word,abbr);
       System.out.println(val);
    }

    public static boolean validWordAbbreviation(String word, String abbr){
       if(word.isEmpty() || abbr.isEmpty()){
           return false;
       }

       int i = 0;
       int j = 0;

       while(i < word.length() && j < abbr.length()){
           if(!Character.isDigit(abbr.charAt(j))){
               if(word.charAt(i) != abbr.charAt(j))
                   return false;
               else {
                   i++;
                   j++;
               }
           }else {
               if(abbr.charAt(j) == '0'){
                   return false;
               }else{
                   int num = 0;
                   while(Character.isDigit(abbr.charAt(j))){
                       num = num * 10 +(abbr.charAt(j) - '0');
                       j++;
                   }
                   i+=num;
               }
           }
       }

       return i == word.length() && j == abbr.length();
    }
}

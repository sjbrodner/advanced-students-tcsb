/** This class contains useful functions for testing palindromesc class Palindrome {
*/

public class Palindrome {

        public boolean isPalindrome(String word){
                if(word.length() <=  1){
                        return true;
                }
                for(int i = 0; i < (word.length()/2); i++){
                        if(word.charAt(i) != word.charAt(word.length() - i - 1))
                                return false;
                }
                return true;
        }
}

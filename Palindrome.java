import java.util.Locale;

public class Palindrome {

    static boolean palindrome(String word){

        String reverse = reverse(word);
        System.out.println(reverse);
        return word.equalsIgnoreCase(reverse) ;
    }

    static public String reverse(String word){
        if (word == null || word.isEmpty()) {
            return word;
        } else {
            return word.charAt(word.length()-1) + reverse(word.substring(0, word.length()-1));
        }
    }
    public static void main(String[] args){
        System.out.println("Cat? " + palindrome("cat"));
        System.out.println("Dad? " + palindrome("dad"));
    }
}

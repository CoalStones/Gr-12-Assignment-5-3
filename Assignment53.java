package assignment53;
import java.util.Scanner;

public class Assignment53 {
    
    public static String palCheck(String sInput, String revWord, int wordLength, int charCount){
        if(wordLength>0){
            revWord+=sInput.charAt(charCount);
            charCount--; wordLength--;
            return palCheck(sInput,revWord,wordLength,charCount);
        }
        else return(revWord);
    }

    public static void main(String[] args) {
        Scanner noahSeer=new Scanner(System.in);
        System.out.println("Enter a word");
        String sInput=noahSeer.nextLine(),revWord=""; int wordLength=sInput.length(),charCount=wordLength-1;
        String sHolder=palCheck(sInput,revWord,wordLength,charCount);
        if(sInput.equals(sHolder))System.out.println(sInput+" is a palindrome");
        else System.out.println(sInput+" is not a palindrome");
    }
    
}

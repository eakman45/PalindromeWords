import java.util.Scanner;

public class Main {

    static String reverseString(String x){
        String myString ="";

        for(int i=x.length()-1;i>=0;i--){
            myString =myString+x.charAt(i);
        }
        System.out.println("Reversed version of your string is : "+ myString);
        return myString;
    }
    static boolean isPalindrome(String x,String y){
        if(x.equals(y)){
            System.out.println(x+" is palindrome.");
            return true;
        }else{
            System.out.println(x + " is not palindrome.");
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);

        System.out.println("Please enter your string. : ");
        String s = inputString.next();

        String y = reverseString(s);

        isPalindrome(s,y);

    }
}

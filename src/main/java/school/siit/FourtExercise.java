package school.siit;

public class FourtExercise {
    public static void Palindrome(int n){
        int palindrome = n;
        int reverse = 0;
        int remainder;

        while (palindrome != 0){
            remainder = palindrome % 10;
            reverse =  reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (n == reverse){
            System.out.println(n + " is a palindrome number");
        }else {
            System.out.println(n + " is not a palindrome number");
        }
    }
}

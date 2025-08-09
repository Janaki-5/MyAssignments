package PositiveAndNegative;

public class Palindrome {
	public static void main(String[] args) {
        int num = 121;   // input number
        int originalNum = num; // store original value
        int reverse = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;           // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            num = num / 10;                 // remove last digit
        }

        // Compare original and reversed
        if (originalNum == reverse) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
    }
}
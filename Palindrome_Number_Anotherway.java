package Leet_code_problem_solving;

import java.util.Scanner;

public class Palindrome_Number_Anotherway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(isPalindrome(number));
	}

	static boolean isPalindrome(int number) {
		if(number < 10 || number % 10 == 0) return false;
		
		int reverse = 0;
		while(number > reverse) {
			reverse = reverse*10 + number%10;
			number =  number / 10;
		}
		System.out.println(reverse);
		System.out.println(number);
		return (number == reverse || number == reverse/10);
		
	}
	
}

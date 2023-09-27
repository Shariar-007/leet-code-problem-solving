package Leet_code_problem_solving;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(isPalindrome(number));
	}
	
	static boolean isPalindrome(int number) {
		for(int i=0; i<String.valueOf(number).length()/2; i++) {
			if(String.valueOf(number) != null && String.valueOf(number).charAt(i) != String.valueOf(number).charAt(String.valueOf(number).length() -1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	
	

}

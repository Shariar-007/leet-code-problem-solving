package Leet_code_problem_solving;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		int[] numberArray = new int[number.length()];
		for(int i=0; i< number.length(); i++) {
			numberArray[i] = Character.getNumericValue(number.charAt(i));
		}
		System.out.println(java.util.Arrays.toString(plusOne(numberArray)));
	}
	
	
	 static int[] plusOne(int[] digits) {
		 for(int i=digits.length-1; i >= 0; i--) {
			 if(digits[i]<9) {
				 digits[i]++;
				 return digits;
			 } else {
				 digits[i] = 0;
			 }
		 }

		 digits = new int [digits.length + 1];
		 digits[0] = 1;
		 return digits;
	    }
}

package Leet_code_problem_solving;

import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number1 = sc.next();
		String number2 = sc.next();
		System.out.println(addBinary(number1,number2));
	}

	 static String addBinary(String a, String b) {
		 
		 StringBuilder sb = new StringBuilder();
		 int carry = 0;
		 int i = a.length() - 1;
		 int j = b.length() - 1;
		
		 while(i >= 0 || j >= 0) {
			 int sum = carry;
			 if(i>=0) sum += Character.getNumericValue(a.charAt(i));
			 
			 if(j>=0) sum += Character.getNumericValue(b.charAt(j));
			 
			 sb.append(sum%2);
			 carry = sum/2;
			 
			 i--;
			 j--;
		 }
		 
		 if(carry != 0) sb.append(carry);
		 return sb.reverse().toString();
	    }
}

package Leet_code_problem_solving;

import java.util.Arrays;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String romanNumber = sc.next();
		System.out.println(romanToInt(romanNumber));

	}

	public static int romanToInt(String s) {
		String[] romanDigits = s.trim().split("");
		int number = 0;
		for(int i=0; i<romanDigits.length;i++) {
			if(romanDigits[i].equals("I") && (i+1) < romanDigits.length) {
				if(romanDigits[i+1].equals("V") || romanDigits[i+1].equals("X")) {
					number -= romanMaping(romanDigits[i]);
				} else {
					number += romanMaping(romanDigits[i]);
				}
			} else if(romanDigits[i].equals("X") && (i+1) < romanDigits.length) {
				if(romanDigits[i+1].equals("L") || romanDigits[i+1].equals("C")) {
					number -= romanMaping(romanDigits[i]);
				} else {
					number += romanMaping(romanDigits[i]);
				}
			} else if(romanDigits[i].equals("C") && (i+1) < romanDigits.length) {
				if(romanDigits[i+1].equals("D") || romanDigits[i+1].equals("M")) {
					number -= romanMaping(romanDigits[i]);
				} else {
					number += romanMaping(romanDigits[i]);
				}
			} else {
				number += romanMaping(romanDigits[i]);
			}
		}
        return number;
    }
	
	static int romanMaping(String str) {
		if(str.equals("I")) return 1;
		if(str.equals("V")) return 5;
		if(str.equals("X")) return 10;
		if(str.equals("L")) return 50;
		if(str.equals("C")) return 100;
		if(str.equals("D")) return 500;
		if(str.equals("M")) return 1000;
		return -1;
	}
}

package Leet_code_problem_solving;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String item;
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		int i = 0;
		while(i < N) {
			String item = sc.next();
			al.add(item);
			i++;
		}
		
		System.out.println(wordsOfAmericanKeyboards(al));
	}

	static ArrayList<String> wordsOfAmericanKeyboards(ArrayList<String> passedArrayList) {
		String firstRow = "qwertyuiop";
		String secondRow = "asdfghjkl";
		String thirdRow = "zxcvbnm";
		ArrayList<String> output = new ArrayList<String>();
		
		for(int i=0; i<passedArrayList.size(); i++) {
			boolean flag = true;
			for(int j=0; j<passedArrayList.get(i).length(); j++) {
				if(!firstRow.contains(String.valueOf(Character.toLowerCase(passedArrayList.get(i).charAt(j))))) {
					flag = false;
				}
			}
			if(flag) {
				output.add(passedArrayList.get(i));
			}
			
			if(!flag) {
				flag = true;
				for(int j=0; j<passedArrayList.get(i).length(); j++) {
					if(!secondRow.contains(String.valueOf(Character.toLowerCase(passedArrayList.get(i).charAt(j))))) {
						flag = false;
					}
				}
				if(flag) {
					output.add(passedArrayList.get(i));
				}
			}
			
			if(!flag) {
				flag = true;
				for(int j=0; j<passedArrayList.get(i).length(); j++) {
					if(!thirdRow.contains(String.valueOf(Character.toLowerCase(passedArrayList.get(i).charAt(j))))) {
						flag = false;
					}
				}
				if(flag) {
					output.add(passedArrayList.get(i));
				}
			}
		}
		return output;
	}
	
	
//	static String[] wordsOfAmericanKeyboards(String[] words) {
//		String firstRow = "qwertyuiop";
//		String secondRow = "asdfghjkl";
//		String thirdRow = "zxcvbnm";
//		ArrayList<String> output = new ArrayList<String>();
//		
//		for(int i=0; i<words.length; i++) {
//			boolean flag = true;
//			for(int j=0; j<words[i].length(); j++) {
//				if(!firstRow.contains(String.valueOf(Character.toLowerCase(words[i].charAt(j))))) {
//					flag = false;
//				}
//			}
//			if(flag) {
//				output.add(words[i]);
//			}
//			
//			if(!flag) {
//				flag = true;
//				for(int j=0; j<words[i].length(); j++) {
//					if(!secondRow.contains(String.valueOf(Character.toLowerCase(words[i].charAt(j))))) {
//						flag = false;
//					}
//				}
//				if(flag) {
//					output.add(words[i]);
//				}
//			}
//			
//			if(!flag) {
//				flag = true;
//				for(int j=0; j<words[i].length(); j++) {
//					if(!thirdRow.contains(String.valueOf(Character.toLowerCase(words[i].charAt(j))))) {
//						flag = false;
//					}
//				}
//				if(flag) {
//					output.add(words[i]);
//				}
//			}
//		}
//		
//		String[] newOutput = new String[output.size()];
//		for(int i=0; i< output.size(); i++) {
//			newOutput[i] = output.get(i);
//		}
//		return newOutput;
//	}
}

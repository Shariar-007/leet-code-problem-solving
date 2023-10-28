package Leet_code_problem_solving;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"ab","a"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	
	public static String longestCommonPrefix(String[] strs) {
		int matchingFlag = 0;
		String matchingWord = smallest(strs);
		int count = 0;
        for(int i = 0; i< matchingWord.length(); i++) {
        	for(int j = 0; j< strs.length; j++) {
        		if(strs[j].charAt(i) != matchingWord.charAt(i)) {
        			matchingFlag = 1;
        			break;
        		}
        	}
        	if(matchingFlag == 1) {
        		break;
        	}
        	count++;
        }
        return matchingWord.substring(0, count);
    }
	
	public static String smallest(String words[]) {
	    if (words == null || words.length < 1) {
	        return "";
	    }
	    String smallest = words[0];
	    for (int i = 1; i < words.length; i++) {
	        if (words[i].length() < smallest.length()) {
	            smallest = words[i];
	        }
	    }
	    return smallest;
	}// smallest

}

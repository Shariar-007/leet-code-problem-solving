package Leet_code_problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,1,0,2,3};
		System.out.println(Arrays.toString(twoSum(numbers, 5)));
		
	}
	
     static int[] twoSum(int[] nums, int target) {
    	int[] output = new int[2];
        for(int i=0; i < nums.length; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		if(nums[i] + nums[j] == target) {
        			output[0] = i;
        			output[1] = j;
        			return output;
        		}
        	}
        }
	   return output;
    }

}

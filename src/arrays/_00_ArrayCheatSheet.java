package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		int[] nums = new int[5];
		//2. print the third element in the array
		System.out.println(nums[2]);
		//3. set the third element to a different value
		nums[2]=20;
		//4. print the third element again
		System.out.println(nums[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=4;
		}
		//6. make an array of 50 integers
		int[] num = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		
		
		for(int i = 0; i<50; i++) {
			int x=rand.nextInt(90);
			num[i]= x;
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int largestNum = num[0];
		for(int i = 0; i<50; i++) {
		System.out.println(num[i]);
			if(num[i] > largestNum) {
			largestNum=num[i];
		
		}
			
		}
		System.out.println(largestNum);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	
	}
}

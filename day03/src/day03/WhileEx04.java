package day03;

import java.util.Arrays;

public class WhileEx04 {

	public static void main(String[] args) {
		// 배열과 반복문

		
		int[] arr= {1,3,5,7, 9,11};
		
		System.out.println(Arrays.toString(arr));
		
		int i= 0;
		
		int sum=0;
		while (i<arr.length) { 
			
			System.out.println(i);
			
			
			sum+=arr[i];
			//i를 합으로 바꾸기
			arr[i]= sum;
			System.out.println(arr[i]);
			i++;
			
			System.out.println(Arrays.toString(arr));

			
		}
		
		

		
		
		
		
		
	}

}

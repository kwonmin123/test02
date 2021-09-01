package day03;

public class EnhancedForEx01 {

	public static void main(String[] args) {
		// 배열이나 배열과 유사한 구조에서 사용하는 for
		
		
		
		int [] arr= {1,2,3,4,5,6,6};
//		
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}

		
		for(int a : arr) {
			System.out.println(a);
			
		}

		System.out.println("______________");
		String[] arr2= {"월","화","수","목","금","토","일"};

		for(String a:arr2) {System.out.println(a);}
		
		System.out.println("______________");
		
		byte[] arr3= {10,20,30,40,52};
		int sum=0;
		for(byte c: arr3) {
			sum+=c;
			
		}
		double mean=sum/(double)arr3.length;//평균
		System.out.println(sum);
		System.out.println(mean);
		
		
		
		
		
		
	}

}

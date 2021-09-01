package day02;

import java.util.Arrays;

public class ArrayEx {
	
	
	public static void main(String[] args) {

		int[] arr;
		//배열의 선언
		
		arr=new int[5];
		System.out.println(arr);// 배열의 주소값 (0번째 상자가 만들어진 위치)
		//배열의 생성
		
		arr[0]=13;
		arr[1]=1;
		arr[2]=5;
		arr[3]=6;
		arr[4]=7;

		//배열의 초기화
		System.out.println("배열의 첫번째값:"+arr[0]);
		System.out.println("배열의 마지막값:"+arr[4]);
		
		
		
		System.out.println(Arrays.toString(arr));
		//배열의 저장된값 문자열형태로 확인.
		
		
		System.out.println("배열의길이"+arr.length);
		System.out.println("배열의마지막"+arr[arr.length-1]);
		
		//마지막 배열 저장된값
		
		byte[] arr2=new byte[7];
		//배열의 초기값을 지정하지 않으면 기본값으로 자동초기화 0, ,0.0, null
		
		//배열 선언생성 초기화를 동시에하려면
		int [] arr3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("---------------------------------------------");
		//문자열 배열에 월화수목금 저장하고 출력
		
		String[] 요일= {"월요일", "화요일" ,"수요일"};
		
		//3개의 크기, int배열, 각각랜덤값저장하고 출력

		
		int [] 로또= new int[3];
		로또[0] = (int)(Math.random()*10);
		로또[1] = (int)(Math.random()*10);
		로또[2] = (int)(Math.random()*10);
		
		
		
		System.out.println(Arrays.toString(로또));
		System.out.println(Arrays.toString(요일));
		
		
		
		
		
		
		
	}

}

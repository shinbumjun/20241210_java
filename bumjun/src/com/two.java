package com;

public class two {

	
	/*
	 * continue는 바로 직전 반복문에서 실행을 건너뛰고 다음 반복으로 진행
	 * 깊은 복사 : 기본형 값을 꺼내서 복사
	 * 컬렉션 : List, Queue, Set, Map
	 * Queue 가 부모/ LinkedList 가 자식
	 */
	public static void main(String[] args) {
		
		int[] numbers = {3,6,9,12,15};
		for(int number: numbers) { // 향상된 for문
		    System.out.print(number + " "); 
		}
		
		System.out.println();
		
		// 얕은 복사
		int[] a = { 1, 2, 3, 4 };
		int[] b = a; // 얕은 복사

		b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

		System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다. 
		
		// 깊은 복사
		int[] a1 = { 1, 2, 3, 4 };
		int[] b1 = new int[a.length]; 

		for (int i = 0; i < a.length; i++) {
		    b1[i] = a1[i]; // 깊은 복사
		}

		b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

		System.out.println(a1[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.
	}

}
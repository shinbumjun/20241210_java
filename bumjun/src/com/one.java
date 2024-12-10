package com;

import java.util.Scanner;

/*
 	- 입력값
    - 내가 좋아하는 요리 제목을 먼저 입력합니다.
    - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 주세요. (ex. 3.5)
    - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 3문장을 입력합니다.
	- 출력값
    - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
    - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해 줍니다. (ex. 3)
    - 바로 뒤에 정수 별점을 5점 만점 퍼센트로 표현했을 때 값을 실수로 출력해 줍니다. (ex. 60.0%)
    - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력해 줍니다. 
 */
public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("내가 좋아하는 요리 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("요리 별점: ");
		double rating = sc.nextDouble();
		
		sc.nextLine(); // ***버퍼 비우기 : 줄바꿈 문자(\n) 제거
		
		System.out.println("요리 레시피를 한 문장씩 2문장 입력하세요: ");
		String [] recipeSteps = new String[3];
		int num = 0;
		for(int i = 0; i < 3; i++) {
			num++;
			System.out.print((i + 1) + "번째 문장: ");
			recipeSteps[i] = sc.nextLine();
		}
		
		System.out.println("ㅡㅡㅡㅡㅡ 출력 결과 ㅡㅡㅡㅡㅡ");
		System.out.println("(" + title + ")");
		int rating2 = (int)rating; // 큰 수에서 작은 수 (강제 형변환)
		double rating3 = (rating / 5) * 100;
		System.out.printf("별점: %d점 (%.1f%%)%n", rating2, rating3);
		
		System.out.println("요리 레시피: ");
		for(int i = 0; i < recipeSteps.length; i++) {
			System.out.println((i + 1) + ". " + recipeSteps[i]);
		}
		sc.close();
	}

}

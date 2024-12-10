package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class two2 {

	/*
	   <aside>
		💁‍♀️ 자료구조 요리 레시피 메모장 만들기
		
		- 입력값
		    - 저장할 자료구조명을 입력합니다. (List / Set / Map)
		    - 내가 좋아하는 요리 제목을 먼저 입력합니다.
		    - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다.
		    - 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
		- 출력값
		    - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
		    - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.
		</aside>
	 */
	public static void main(String[] args) {
		
		System.out.println("저장할 자료구조명을 입력합니다. (List / Set / Map)");
		Scanner sc = new Scanner(System.in);
		String read = sc.nextLine();
		
		int num;
		if(read.equals("List")) {
			System.out.println("List 선택");
			num = 1;
		} else if(read.equals("Set")) {
			System.out.println("Set 선택");
			num = 2;
		} else if(read.equals("Map")){
			System.out.println("Map 선택");
			num = 3;
		} else {
			System.out.println("잘못 입력하셨습니다");
			num = 0;
		}
		
		if(num == 1) {
			ArrayList<String> strList = new ArrayList<>();
			while(true) {
				String text = sc.nextLine();
				strList.add(text);
				if (text.equals("끝")) {
					break;
				}
				System.out.println();
			}
			System.out.println("끝났습니다");
		} else if(num == 2) {
			
			
		} else if(num == 3) {
			Map<Integer, String> strMap = new HashMap<>();
			int lineNumber = 1;
			while (true) {
				// 한줄씩 입력받아서 strList 에 저장
				String text = sc.nextLine();
				if (Objects.equals(text, "끝")) {
					break;
				}
				strMap.put(lineNumber++, text);
				System.out.println("끝났습니다");
			}
		} else {
			// System.out.println("끝");
		}
		

	}

}

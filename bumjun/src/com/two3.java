package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class two3 {

	/*
	   <aside>
		💁‍♀️ **자료구조 요리 레시피 메모장 만들기**
		
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
		Scanner sc = new Scanner(System.in);
		String CollectionName = sc.next();
		String title = sc.nextLine();
		
		switch (CollectionName) {
		case "List":
			ArrayList<String> strList = new ArrayList<>();
			while(true) {
				// 한 줄씩 입력 받아서 strList에 저장하게끔 !!
				String text = sc.nextLine();
				if(Objects.equals(text, "끝")) {
					break;
				}
				strList.add(text);
			}
			title = "[ List로 저장된 " + title + "]"; // 제목
			System.out.println(title);
			// strList 한줄씩 출력
			for(int i = 0; i < strList.size(); i++) {
				int number = i+1;
				System.out.println(number + "." + strList.get(i));
			}
			break;
			
		case "Set":
			LinkedHashSet<String> strSet = new LinkedHashSet<>();
			while(true) {
				// 한 줄씩 입력 받아서 strSet에 저장하게끔 !!
				String text = sc.nextLine();
				if(Objects.equals(text, "끝")) {
					break;
				}
				strSet.add(text);
			}
			title = "[ Set로 저장된 " + title + "]"; // 제목
			System.out.println(title);
			
			Iterator iterator = strSet.iterator(); // 순회
			
			// strSet 한줄씩 출력
			for(int i = 0; i < strSet.size(); i++) {
				int number = i+1;
				System.out.println(number + "." + iterator.next());
			}
			break;
			
		case "Map":
			Map<Integer, String> strMap = new HashMap<>();
			int lineNumber = 1;
			
			while(true) {
				// 한 줄씩 입력 받아서 strMap에 저장하게끔 !!
				String text = sc.nextLine();
				if(Objects.equals(text, "끝")) {
					break;
				}
				strMap.put(lineNumber++, text);
			}
			title = "[ Map로 저장된 " + title + "]"; // 제목
			System.out.println(title);
			// strMap 한줄씩 출력
			for(int i = 0; i < strMap.size(); i++) {
				int number = i+1;
				System.out.println(number + "." + strMap.get(i+1));
			}
			break;
		
		default:
			System.out.println("저장할 수 없는 자료구조입니다.");
			
		}
		

	}

}

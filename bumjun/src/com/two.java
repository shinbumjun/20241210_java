package com;

public class two {

	
	/*
	 * continue�� �ٷ� ���� �ݺ������� ������ �ǳʶٰ� ���� �ݺ����� ����
	 * ���� ���� : �⺻�� ���� ������ ����
	 * �÷��� : List, Queue, Set, Map
	 * Queue �� �θ�/ LinkedList �� �ڽ�
	 */
	public static void main(String[] args) {
		
		int[] numbers = {3,6,9,12,15};
		for(int number: numbers) { // ���� for��
		    System.out.print(number + " "); 
		}
		
		System.out.println();
		
		// ���� ����
		int[] a = { 1, 2, 3, 4 };
		int[] b = a; // ���� ����

		b[0] = 3; // b �迭�� 0��° �������� 3���� �����߽��ϴ�. (1 -> 3)

		System.out.println(a[0]); // ��� 3  <- a �迭�� 0��° �������� 3���� ��ȸ�˴ϴ�. 
		
		// ���� ����
		int[] a1 = { 1, 2, 3, 4 };
		int[] b1 = new int[a.length]; 

		for (int i = 0; i < a.length; i++) {
		    b1[i] = a1[i]; // ���� ����
		}

		b[0] = 3; // b �迭�� 0��° �������� 3���� �����߽��ϴ�. (1 -> 3)

		System.out.println(a1[0]); // ��� 1 <- ���� ���縦 �߱⶧���� a �迭�� �״�� �Դϴ�.
	}

}

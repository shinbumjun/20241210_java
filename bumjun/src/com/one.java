package com;

import java.util.Scanner;

/*
 	- �Է°�
    - ���� �����ϴ� �丮 ������ ���� �Է��մϴ�.
    - �丮 ������ 1~5 ������ �Ҽ����� �ִ� �Ǽ��� �Է��� �ּ���. (ex. 3.5)
    - �̾ ���� �����ϴ� �丮 �����Ǹ� �� ���徿 3������ �Է��մϴ�.
	- ��°�
    - �Է��� ����Ǹ� �丮 ������ ��ȣ�� ���μ� ���� ����� �ݴϴ�.
    - �̾, �丮 ������ �Ҽ����� ������ �����θ� ����� �ݴϴ�. (ex. 3)
    - �ٷ� �ڿ� ���� ������ 5�� ���� �ۼ�Ʈ�� ǥ������ �� ���� �Ǽ��� ����� �ݴϴ�. (ex. 60.0%)
    - �̾, �Է��� ��� ���� �տ� ��ȣ�� �ٿ��� ��� ����� �ݴϴ�. 
 */
public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �����ϴ� �丮 ���� : ");
		String title = sc.nextLine();
		
		System.out.print("�丮 ����: ");
		double rating = sc.nextDouble();
		
		sc.nextLine(); // ***���� ���� : �ٹٲ� ����(\n) ����
		
		System.out.println("�丮 �����Ǹ� �� ���徿 2���� �Է��ϼ���: ");
		String [] recipeSteps = new String[3];
		int num = 0;
		for(int i = 0; i < 3; i++) {
			num++;
			System.out.print((i + 1) + "��° ����: ");
			recipeSteps[i] = sc.nextLine();
		}
		
		System.out.println("�ѤѤѤѤ� ��� ��� �ѤѤѤѤ�");
		System.out.println("(" + title + ")");
		int rating2 = (int)rating; // ū ������ ���� �� (���� ����ȯ)
		double rating3 = (rating / 5) * 100;
		System.out.printf("����: %d�� (%.1f%%)%n", rating2, rating3);
		
		System.out.println("�丮 ������: ");
		for(int i = 0; i < recipeSteps.length; i++) {
			System.out.println((i + 1) + ". " + recipeSteps[i]);
		}
		sc.close();
	}

}

package com.jiho.practice;

import java.util.Scanner;

public class Practice1 {

@SuppressWarnings("resource")
public static void main(String[] args) {
		
//		������ �Է��� �ּ���: (0~100)
//		90�� �̻� A 
//		80�� �̻� B
//		70�� �̻� C
//		�������� D�Դϴ�. ( +, - ����) 
//		 		
//		100 �ʰ��� �߸� �Է��Ͽ����ϴ�.
//
//		���� �ڸ� ���� 7�� �̻��̸� +
//		���� �ڸ� ���� 3�� �����̸� -
//		 		
//		���� ���, 95��: A, 97��: A+, 83��: B-
		
		String grd = "";
		String grade = "";
		System.out.println("������ �Է����ּ���:  (0~100)");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		
		if(score%10 >=7) {
			grd = "+";
		}else if(score%10 <= 3) {
			grd = "-";
		}
		
		if(score<=100 && score>=90) {
			grade = "A";
		}else if(score<90 && score>=80) {
			grade = "B";
		}else if(score<80 && score>=70) {
			grade = "C";
		}else if(score<70 && score>=60){
			grade = "D";
		}else{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}
		
		System.out.printf("����� ����[%d]�� %s"+"%s�Դϴ�.",score, grade, grd);
		sc.close();
	}

}

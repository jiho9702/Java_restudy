package com.jiho.practice;

import java.util.Scanner;

public class Practice1 {

@SuppressWarnings("resource")
public static void main(String[] args) {
		
//		점수를 입력해 주세요: (0~100)
//		90점 이상 A 
//		80점 이상 B
//		70점 이상 C
//		나머지는 D입니다. ( +, - 없다) 
//		 		
//		100 초과면 잘못 입력하였습니다.
//
//		일의 자리 수가 7점 이상이면 +
//		일의 자리 수가 3점 이하이면 -
//		 		
//		예를 들어, 95점: A, 97점: A+, 83점: B-
		
		String grd = "";
		String grade = "";
		System.out.println("점수를 입력해주세요:  (0~100)");
		
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
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		System.out.printf("당신의 점수[%d]는 %s"+"%s입니다.",score, grade, grd);
		sc.close();
	}

}

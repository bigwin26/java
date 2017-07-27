package oop;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Exam() {
		this(1,1,1);
	}
	public Exam(int kor,int eng,int math) {
		this.kor = kor;
		this.eng = eng;
		this.math =math;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);


		System.out.println("┌──────────────────────────┐");
		System.out.println("│                                성적 입력                                    │");
		System.out.println("└──────────────────────────┘");
		//		System.out.print("국어:");


		
			do
			{
				if(kor<0||kor>100)
					System.out.println("유효하지 않은 값입니다.0~100사이 값을 입력해주세요.");
				System.out.print("국어:");
				kor = scan.nextInt();
			}    
			while(kor<0||kor>100);
			do
			{
				if(eng<0||eng>100)
					System.out.println("유효하지 않은 값입니다.0~100사이 값을 입력해주세요.");
				System.out.print("영어:");
				eng = scan.nextInt();
			}    
			while(eng<0||eng>100);
			do
			{
				if(math<0||math>100)
					System.out.println("유효하지 않은 값입니다.0~100사이 값을 입력해주세요.");
				System.out.print("수학:");
				math = scan.nextInt();
			}    
			while(math<0||math>100);
		}
	
	public void print() {
		System.out.println("┌──────────────────────────┐");
		System.out.println("│                                 성적 출력                                   │");
		System.out.println("└──────────────────────────┘");

			total = kor + eng + math;
			avg = total/3;

			System.out.println("\t국어:"+kor);
			System.out.println("\t영어:"+eng);
			System.out.println("\t수학:"+math);
			System.out.println("\t총점:"+total);
			System.out.println("\t평균:"+avg);
			System.out.println("------------------------------------------");
		
	}

}
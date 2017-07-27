package capsule;

import java.util.Scanner;

public class Exam {
	
	private int kor;
	private int eng;
	private int math;
	
	public static void printExam(Exam[] exams) {
		int kor;
		int eng;
		int math;
		int total;
		double avg;
		
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│                     성적 출력                                               │");
		System.out.println("└─────────────────────────────────────────────┘");
		
		for(int i=0; i<3; i++)
		{
			kor = exams[i].kor;
			eng = exams[i].eng;
			math = exams[i].math;
			
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

	public static void inputExam(Exam[] exams) {
		int kor=0;
		int eng=0;
		int math=0;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│                    성적 입력                                                      │");
		System.out.println("└─────────────────────────────────────────────┘");
//		System.out.print("국어:");
		
	
		for(int i=0;i<3;i++) {
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
			
			exams[i].kor = kor;
			exams[i].eng = eng;
			exams[i].math = math;
		
		}
		
}
}

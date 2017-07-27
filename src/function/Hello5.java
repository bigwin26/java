package function;

import java.util.Scanner;

public class Hello5 {

	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		
		for(int i =0; i<3; i++) {
		exams[i] = new Exam();
		}
		
		
		int menu;
		
		//1.메인메뉴선택
		EXIT:
		while(true)
		{
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputExam(exams);
				break;
			case 2:
				printExam(exams);
				break;
			case 3:
				break EXIT;
			}
		}
		//2.성적입력
		//3.성적출력
	}
	
	
	public static void printExam(Exam[] exams) {
		int total;
		double avg;
		
		total = exams[i].kor + exams[i].math + exams[i].eng;
		avg = total/3;
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│                    성적 출력                                                      │");
		System.out.println("└─────────────────────────────────────────────┘");
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %10d\n", eng);
		System.out.printf("수학 : %-10d\n", math);
		System.out.printf("총점 : %2$d %d %2$d\n", 1, 2); //2$는 2번째 숫자를 가져오고 싶다는뜻
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("───────────────────────────────────────────────");
		System.out.flush();
		
	}

	public static void inputExam(Exam[] exams) {
		int kor;
		int math;
		int eng;
		
		
		Scanner scan  = new Scanner(System.in);

		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│                    성적 입력                                                      │");
		System.out.println("└─────────────────────────────────────────────┘");
		System.out.print("국어 :");
		kor = scan.nextInt();
		System.out.print("영어 :");
		eng = scan.nextInt();
		System.out.print("수학 :");
		math = scan.nextInt();
		
	}

	public static int inputMenu() {
		int num;
		
		return 0;
	}

}

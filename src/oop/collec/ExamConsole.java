package oop.collec;

/*Has A
Composition
Association
Aggregation
*/

import java.util.Scanner;

public class ExamConsole {

	private Exam[] exams= new Exam[3];
	private int index;
	public ExamConsole(){
	for(int i =0; i<3; i++) {
		exams[i] = new Exam();
	}
	}
	/*public ExamConsole(Exam exam) {
		this.exam= exam;
	}
	 */
/*		public ExamConsole() {
		exam = new Exam();
	}
	 */

	/*public void setExam(Exam exam) {
		this.exam = exam;
	}
*/
	public void input() {
		
		int kor=0;
		int eng=0;
		int math=0;

		Scanner scan = new Scanner(System.in);

		System.out.println("┌──────────────────────────┐");
		System.out.println("│                                성적 입력                             │");
		System.out.println("└──────────────────────────┘");

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

		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		
		exams[index++]=exam;
		
		
	}

	public void print() {
		for(int i=0; i<index; i++)
		{
		Exam exam = exams[i];
			
		int kor = exam.getKor();
		int eng = exam.getEng() ;
		int math = exam.getMath();
		int total = exam.total();
		double avg = exam.avg();
		
		System.out.println("┌──────────────────────────┐");
		System.out.println("│                                 성적 출력                            │");
		System.out.println("└──────────────────────────┘");
		System.out.println("\t국어:"+kor);
		System.out.println("\t영어:"+eng);
		System.out.println("\t수학:"+math);
		System.out.println("\t총점:"+total);
		System.out.println("\t평균:"+avg);
		System.out.println("------------------------------------------");

	}
}
}
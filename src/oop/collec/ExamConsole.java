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

		System.out.println("��������������������������������������������������������");
		System.out.println("��                                ���� �Է�                             ��");
		System.out.println("��������������������������������������������������������");

		do
		{
			if(kor<0||kor>100)
				System.out.println("��ȿ���� ���� ���Դϴ�.0~100���� ���� �Է����ּ���.");
			System.out.print("����:");
			kor = scan.nextInt();
		}    
		while(kor<0||kor>100);
		do
		{
			if(eng<0||eng>100)
				System.out.println("��ȿ���� ���� ���Դϴ�.0~100���� ���� �Է����ּ���.");
			System.out.print("����:");
			eng = scan.nextInt();
		}    
		while(eng<0||eng>100);
		do
		{
			if(math<0||math>100)
				System.out.println("��ȿ���� ���� ���Դϴ�.0~100���� ���� �Է����ּ���.");
			System.out.print("����:");
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
		
		System.out.println("��������������������������������������������������������");
		System.out.println("��                                 ���� ���                            ��");
		System.out.println("��������������������������������������������������������");
		System.out.println("\t����:"+kor);
		System.out.println("\t����:"+eng);
		System.out.println("\t����:"+math);
		System.out.println("\t����:"+total);
		System.out.println("\t���:"+avg);
		System.out.println("------------------------------------------");

	}
}
}
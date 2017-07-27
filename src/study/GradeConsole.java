package study;

import java.util.Scanner;

public class GradeConsole {
	
	Grade grade = new Grade();

	public void input() {
		Scanner scan = new Scanner(System.in);
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		
	}

	public void output() {
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int total = grade.total();
		double avg = grade.avg();
		
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
		System.out.println(avg);
		
	}

}

package study;

import java.util.Scanner;

public class GradeConsole {
	
	static int menuCreate() {
		int num;
		
		System.out.println("┌─────────┐");
		System.out.println("│  ──메인메뉴──│");
		System.out.println("└─────────┘");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.print("선택>_");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		return num;
		
		
	}

	public void input() {
		
	}

	public void output() {
		
	}
}

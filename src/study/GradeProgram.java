package study;

import java.util.Scanner;

public class GradeProgram {

	public static void main(String[] args) {

		GradeConsole console = new GradeConsole();
		
		//성적입력
		//성적출력
		//종료
		int menu;
		
		EXIT:
		while(true) {
			menu = inputmenu();
			switch(menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.output();
				break;
			case 3:
				break EXIT;
			}
		}
	}

	private static int inputmenu() {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n1.성적입력 \n2.성적출력 \n3.종료");
		num = scan.nextInt();
		return num;
	}

}

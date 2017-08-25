package oop.collec.col;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

	//Exam exam = new Exam();
		
		ExamConsole console = new ExamConsole();
		
		//console.setExam(exam);
		
		
		int menu;

		//1.메인메뉴선택
		EXIT:
			while(true)
			{
				menu = inputMenu();

				switch(menu) {
				case 1:
					console.input();
					break;
				case 2:
					console.print();
					break;
				case 3:
					break EXIT;

				}
			}

	}

	public static int inputMenu() {
		int num;
		Scanner scan  = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│                           메인 메뉴                                     │");
		System.out.println("└───────────────────────────┘");

		System.out.print("\n1.성적입력\n2.성적 출력\n3.종료\n\n선택 >");
		num = scan.nextInt();
		return num;
	}
}

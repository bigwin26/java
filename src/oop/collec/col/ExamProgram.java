package oop.collec.col;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

	//Exam exam = new Exam();
		
		ExamConsole console = new ExamConsole();
		
		//console.setExam(exam);
		
		
		int menu;

		//1.���θ޴�����
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

		System.out.println("����������������������������������������������������������");
		System.out.println("��                           ���� �޴�                                     ��");
		System.out.println("����������������������������������������������������������");

		System.out.print("\n1.�����Է�\n2.���� ���\n3.����\n\n���� >");
		num = scan.nextInt();
		return num;
	}
}

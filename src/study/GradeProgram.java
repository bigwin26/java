package study;

import java.util.Scanner;

public class GradeProgram {

	public static void main(String[] args) {

		GradeConsole grade = new GradeConsole();
			
		int menu;
		
		EXIT:
		while(true) {
			
			menu = grade.menuCreate();
			
			switch(menu) {
			case 1:
				grade.input();
			case 2:
				grade.output();
			case 3:
				break EXIT;
			default:
				System.out.println("�޴��� �ִ� ��ȣ�� �Է����ּ���.");
					
		}
			
		
		
		//1.�����Է�
		//2.�������
			//3.����
}
}

	
}
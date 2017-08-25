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
				System.out.println("메뉴에 있는 번호를 입력해주세요.");
					
		}
			
		
		
		//1.성적입력
		//2.성적출력
			//3.종료
}
}

	
}
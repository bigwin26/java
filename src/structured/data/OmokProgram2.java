package structured.data;

import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {

		
		Omok[] omoks = new Omok[10];
		//int ox=0, oy=0;
		//Omok omok=null; 값을 입력하면 오류나잖아
		Omok omok = new Omok(); //개체형식은 반드시 new를 입력해서 만듬
		printBoard();
		input(omok);
		printBoard(omok);
		
	}

	private static void printBoard(Omok omok) {
		int oy=omok.y;
		int ox=omok.x;
		
		for(int y=0; y<15; y++)
		{
			for(int x =0; x<20 ;x++)
				if(x==ox&&y==oy)
					System.out.print("●");
				else
					System.out.print("┼");
			System.out.println();
	}
	}
	private static void input(Omok omok) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x sp y:");
		omok.x=scan.nextInt();
		omok.y=scan.nextInt();
		scan.close();
	}

	private static void printBoard() {
		for(int y=0; y<15; y++) {
			for(int x=0; x<20; x++)
				System.out.print("┼");
			System.out.println();
	}
	}
}
	
	
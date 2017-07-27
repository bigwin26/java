package study;

import java.util.Scanner;

public class OmokConsole {

	private Omok omok = new Omok();
	
	int x, y;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		y=scan.nextInt();
	}

	public void print() {
		for(int xo=0; xo<20; xo++) {
			for(int yo=0; yo<20; yo++)
				if(x==xo&&y==yo)
					System.out.print("●");
				else
					System.out.print("┼");
			System.out.println();

		}
		System.out.print("좌표를 입력해주세요(x , y):");

	}
}

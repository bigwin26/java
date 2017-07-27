package oop.omokgame;

import java.util.Scanner;

public class Omok {
	private int x;
	private int y;
	private int num;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int num = 0;
	
		x=scan.nextInt();
		y=scan.nextInt();
		
		num++;
		this.setX(x);
		this.setY(y);
		this.setNum(num);
		}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
}

package oop.omokgame;

public class Board {
	

	private int x;
	private int y;
	private int num;
	
	public void create() {
		for(int x=0; x<20; x++) {
			for(int y=0; y<20; y++)
				System.out.print("¦«");
			System.out.println();
		}
	}

	public void print() {
		if(num==1) {
		for(int xo=0; xo<20; xo++) {
			for(int yo=0; yo<20; yo++)
				if(x==xo&&y==yo)
					System.out.print("¡Ü");
				else
					System.out.print("¦«");
			System.out.println();				
		}
	}
	}
	public void put(Omok omok) {

		this.x = omok.getX();
		this.y = omok.getY();
		this.num = omok.getNum();
		
	}

}

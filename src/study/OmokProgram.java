package study;

public class OmokProgram {

	public static void main(String[] args) {
		
		OmokConsole console = new OmokConsole();
		
		//판만들기
		create();
		//돌입력
		console.input();
		//돌입력된 판출력
		console.print();
}

	public static void create() {
		for(int x=0; x<20; x++) {
			for(int y=0; y<20; y++)
				System.out.print("┼");
			System.out.println();

		}
		System.out.print("좌표를 입력해주세요(x , y):");
	}
}
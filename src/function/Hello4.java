package function;

public class Hello4 {

	public static void main(String[] args) {

		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int menu;
		
		//1.메인메뉴선택
		EXIT:
		while(true)
		{
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputExam(kors,engs,maths);
				break;
			case 2:
				printEcam(kors,engs,maths);
				break;
			case 3:
				break EXIT;
			}
		}
		//2.성적입력
		//3.성적출력
	}
	
	
	private static void printEcam(int[] kors, int[] engs, int[] maths) {
		
	}

	private static void inputExam(int[] kors, int[] engs, int[] maths) {
		
	}

	private static int inputMenu() {
		return 0;
	}

}

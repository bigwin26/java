import java.util.Scanner;

public class HelloStudy {

	public static void main(String[] args)
	{
		int kor=0, eng=0, math=0;
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int total;
		double avg ;
		int menu;

		Scanner scan = new Scanner(System.in);

		IMOUT:
		while(true)
		{
			System.out.println("┌─────────────────────────────────────────────┐");
			System.out.println("│                    메인 메뉴                                                      │");
			System.out.println("└─────────────────────────────────────────────┘");
			System.out.println("\t1.성적 입력");
			System.out.println("\t2.성적 출력");
			System.out.println("\t3.종료");
			System.out.print("\t선택 > ");
			menu = scan.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("┌─────────────────────────────────────────────┐");
				System.out.println("│                    성적 입력                                                      │");
				System.out.println("└─────────────────────────────────────────────┘");
//				System.out.print("국어:");
//				kor = scan.nextInt();
				
				for(int i=0;i<3;i++) {
					do
					{
						if(kor<0||kor>100)
							System.out.println("유효하지 않은 값입니다.0~100사이 값을 입력해주세요.");
						System.out.print("국어:");
						kor = scan.nextInt();
					}    
					while(kor<0||kor>100);
					do
					{
						if(eng<0||eng>100)
					    System.out.println("유효하지 않은 값입니다.0~100사이 값을 입력해주세요.");
						System.out.print("영어:");
					    eng = scan.nextInt();
					}    
					while(eng<0||eng>100);
					do
					{
						if(math<0||math>100)
					    System.out.println("유효하지 않은 값입니다.0~100사이 값을 입력해주세요.");
						System.out.print("수학:");
					    math = scan.nextInt();
					}    
					while(math<0||math>100);
					
					kors[i] = kor;
					engs[i] = eng;
					maths[i] = math;
					         
				}
				
				
			case 2:
				
				System.out.println("┌─────────────────────────────────────────────┐");
				System.out.println("│                     성적 출력                                               │");
				System.out.println("└─────────────────────────────────────────────┘");
				
				for(int i=0; i<3; i++)
				{
					kor = kors[i];
					eng = engs[i];
					math = maths[i];
					
					total = kor + eng + math;
					avg = total/3;
					
					System.out.println("\t국어:"+kor);
					System.out.println("\t영어:"+eng);
					System.out.println("\t수학:"+math);
					System.out.println("\t총점:"+total);
					System.out.println("\t평균:"+avg);
					System.out.println("------------------------------------------");
				}
				break;
			//ctrl+i 들여쓰기
			case 3:
				break IMOUT;
			default:
				System.out.println("\t숫자1,2,3중 하나만 입력해주세요.");
			}
		}		
	}
}
package function;
import java.io.IOException;
import java.util.Scanner;

	class Hello
		{
		 public static void main(String[] args) throws IOException
	    {
			int kor;
			int math;
			int eng;
			int total;
			double avg;
			
			Scanner scan  = new Scanner(System.in);

//			kor = 89;
//			math = 84;
//			eng = 92;
			//ctrl+shift+f = 자동 정렬
			//alt+위아래 = 줄이동
			//tap, shift+tap = 들여쓰기, 내어쓰기
			System.out.println("┌─────────────────────────────────────────────┐");
			System.out.println("│                    성적 입력                                                      │");
			System.out.println("└─────────────────────────────────────────────┘");
			System.out.print("국어 :");
			kor = scan.nextInt();
			System.out.print("영어 :");
			eng = scan.nextInt();
			System.out.print("수학 :");
			math = scan.nextInt();
			
			total = kor + math + eng;
			avg = total/3;
			System.out.println("┌─────────────────────────────────────────────┐");
			System.out.println("│                    성적 출력                                                      │");
			System.out.println("└─────────────────────────────────────────────┘");
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %10d\n", eng);
			System.out.printf("수학 : %-10d\n", math);
			System.out.printf("총점 : %2$d %d %2$d\n", 1, 2); //2$는 2번째 숫자를 가져오고 싶다는뜻
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("───────────────────────────────────────────────");
			System.out.flush();
	    }	
		}

package function;
import java.util.Scanner;

public class DaeSeung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 0;
		int yes = 1;
		int cnt = 0;
		int total = 0;
		double avg = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│                    성적 입력                                                      │");
		System.out.println("└─────────────────────────────────────────────┘");

		while(true)
		{
			System.out.println("\t당신의 성적을 입력하세요.");
			do 
			{
				System.out.print("성적:");
				grade = scan.nextInt();
				if(grade<0||grade>100)
					System.out.print("유효하지 않은 값입니다.0-100사이의 값만 입력해주세요.");
			}
			while(grade<0||grade>100);
			System.out.print("당신의 점수는"+grade+"점 입니다.");
			total += grade;
			cnt++;
			do
			{
				if(yes>2||yes<=0)
					System.out.println("유효하지 않은 값입니다.1,2 값만 입력해주세요.");
				System.out.println("성적을 계속 입력하시겠습니까? 예:1 아니오:2");
				yes = scan.nextInt();
			}
			while(yes>2||yes<=0);
			if(yes == 2)
				break;
			
		}
		avg = total / (double)cnt;
		System.out.println("\t당신의 총점은"+total+"점 입니다.");
		System.out.println("\t당신의 평균은"+avg+"점 입니다.");
	}
}

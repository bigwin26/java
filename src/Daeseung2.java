import java.util.Scanner;

public class Daeseung2 {

	public static void main(String[] args) {
		int grade = 0;
		int total = 0;
		int yes = 0;
		int cnt = 0;
		double avg = 0;
		int menu;
		
		Scanner scan = new Scanner(System.in);
		IMOUT:
		
		while(true)
		{
			System.out.println("\t┌─────────────┐");
			System.out.println("\t│     메인메뉴        │");
			System.out.println("\t└─────────────┘");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.총점 및 평균");
			System.out.println("\t3.종료");
			System.out.print("\t선택:");
			menu = scan.nextInt();
			
			IMPORT2:
				IMPORT3:
			switch(menu)
			{
			case 1:
				System.out.println("\t┌─────────────┐");
				System.out.println("\t│     성적입력        │");
				System.out.println("\t└─────────────┘");
				while(true)
				{
				do
				{
				if(grade<0||grade>100)	
				System.out.println("\t입력범위를 벗어났습니다. 0-100사이값만 입력해주세요.");
				System.out.print("\t성적을 입력해주세요.");
				grade = scan.nextInt();
				}
				while(grade<0||grade>100);
				System.out.println("\t당신의 점수는"+grade+"점 입니다.");
				total += grade;
				cnt++;
				do
				{
				System.out.print("\t계속 입력하시겠습니까? (1.네 2.아니오)");
				yes = scan.nextInt();
				if(yes>2||yes<=0)
				System.out.println("\t입력범위를 벗어났습니다. 1,2값만 입력해주세요.");
				switch(yes) {
				case 1:
					break;
					
				case 2:
					break IMPORT2;
				}
				
				}while(yes<=0||yes>2);
				
				}
				
			case 2:
				avg = total/cnt;
				System.out.println("\t┌─────────────┐");
				System.out.println("\t│   총점 및 평균        │");
				System.out.println("\t└─────────────┘");
				System.out.println("\t당신의 총점은"+total+"점 입니다.");
				System.out.println("\t당신의 평균은"+avg+"점 입니다.");
				
				do
				{
				System.out.print("\t메인화면으로 나가시겠습니까? (1.네 2.아니오)");
				yes = scan.nextInt();
				if(yes>2||yes<=0)
				System.out.println("\t입력범위를 벗어났습니다. 1,2값만 입력해주세요.");
				switch(yes) {
				case 1:
					break  IMPORT3;
					
				case 2:
					break;
				}
				
				}while(yes<=0||yes>2);
				
				
			
			case 3:
				break IMOUT;
			default :
				System.out.println("\t1,2,3중에서만 선택해주세요.");
	
			}	
		}
	}
}

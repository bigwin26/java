package structured.data;
import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) 
	{
		Lotto[] lottos = new Lotto[6];
		//int[] lotto = new int[6];
		//Lotto lotto = new Lotto();

		//1. 로또 번호 생성
		gen(lottos);
		//2. 로또 번호 출력
		print(lottos);
		//3.정렬
		sort(lottos);
		//4. 로또 번호 출력
		print(lottos);
	}

	private static void gen(Lotto[] lottos) {
		Random rand = new Random();
		for(int i =0; i<6; i++) {
			lottos[i] = new Lotto();
			lottos[i].num = rand.nextInt(45)+1;
			for(int j = 0; j<i; j++)
				if(lottos[i].num==lottos[j].num) {
					i--;
					break;
				}
		}
	}
	private static void sort(Lotto[] lottos) {
		for(int j = 0; j<5; j++) {
			for(int i = 0; i<5-j; i++)
			{
				int temp = 0;
				if(lottos[i].num>lottos[i+1].num)
				{
					temp = lottos[i].num;
					lottos[i].num=lottos[i+1].num;
					lottos[i+1].num=temp;
				}
			}
		}
	}
	private static void print(Lotto[] lottos) {
		for(int i =0; i<6; i++) 
			System.out.printf("%d ",lottos[i].num);
		System.out.println();
	}

}

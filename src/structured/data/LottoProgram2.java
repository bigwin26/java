package structured.data;

import java.util.Random;

public class LottoProgram2 {

	public static void main(String[] args) {

		Lotto2[] lottos = new Lotto2[6];
		
		gen(lottos);
		print(lottos);
		sort(lottos);
		print(lottos);
	}

	private static void sort(Lotto2[] lottos) {
		
	}

	private static void print(Lotto2[] lottos) {
		
	}

	private static void gen(Lotto2[] lottos) {
		Random rand = new Random();
		for(int i=0; i<6; i++){
			lottos[i] = new Lotto2();
			lottos[i].num = rand.nextInt(45)+1;
			System.out.printf("%d ",lottos[i].num);
		}
			
		
	}

}

package function;
import java.util.Random;

public class lotto {

	public static void main(String[] args) 
	{
		int[] nums = new int[6];
		Random rand = new Random();

		//1. 로또 번호 생성
		genLotto(nums);
		//2. 로또 번호 출력
		printLotto(nums);
		//3.정렬
		sortLotto(nums);
		//4. 로또 번호 출력
		printLotto(nums);
	}

	private static void genLotto(int[] nums) {
		Random rand = new Random();
		for(int i =0; i<6; i++) {
			nums[i] = rand.nextInt(45)+1;
			for(int j = 0; j<i; j++)
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
		}
	}
	private static void sortLotto(int[] nums) {
		for(int j = 0; j<5; j++) {
			for(int i = 0; i<5-j; i++)
			{
				int temp = 0;
				if(nums[i]>nums[i+1])
				{
					temp = nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
				}
			}
		}
	}
	private static void printLotto(int[] nums) {
		for(int i =0; i<6; i++) 
			System.out.printf("%d ",nums[i]);
		System.out.println();
	}

}

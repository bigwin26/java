import java.util.Random;

public class lotto {

	public static void main(String[] args) 
	{
		int[] nums = new int[6];

		Random rand = new Random();
		for(int i =0; i<6; i++) {
			nums[i] = rand.nextInt(45)+1;
		    for(int j = 0; j<i; j++)
		    	if(nums[i]==nums[j]) {
		    		i--;
		    		break;
		    	}
		}
		    	
		for(int i =0; i<6; i++) //초기상태 로또
			System.out.printf("%d ",nums[i]);
		System.out.println();

		//nums[0]<->nums[1]

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
		for(int i =0; i<6; i++) //최종상태의 로또
			System.out.printf("%d " , nums[i]);
		System.out.println();

	}
}


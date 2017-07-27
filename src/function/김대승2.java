package function;

public class ±è´ë½Â2 {

	public static void main(String[] args) {
		int i = 0;
		
		IMOUT:
		while(true) {
		for(char b = 'A'; b<='Z'; b++) 
		{
			System.out.println(b);
			i++;
			if(i==50)
				break IMOUT;
		}
		}
	}

}
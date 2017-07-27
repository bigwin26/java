package function;

public class omok
{

	public static void main(String[] args)
	{

		for(int y=0; y<15; y++)
		{
			for(int x =0; x<20 ;x++)
				if(y>=x&&y<=-x+14)
					System.out.print("¡Ü");
				else
					System.out.print("¦«");
			System.out.println();
		}
	}
}
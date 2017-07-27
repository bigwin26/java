package structured.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamWork2 {

	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(in);
		
		int cnt = 0;
		double sum=0;
		double num=0;;
		double avg;
		
		while(scan.hasNext()){
		num=scan.nextDouble();

		sum +=num;
		cnt++;
		}
		avg = sum/cnt;
		System.out.printf("sum : %f",sum);
		System.out.println();
		System.out.printf("avg : %6.2f",avg);
		
		scan.close();
		in.close();
	}

}

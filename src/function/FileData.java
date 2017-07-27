package function;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileData {

	public static void main(String[] args) throws IOException {
	int[] nums = new int[] {23,34,65,-1,23,2,34,4};

	/*FileOutputStream Dragon = new FileOutputStream("E:\\workspace\\data.txt");*/
	FileInputStream 형주 = new FileInputStream("res/data.txt");
	
	/*PrintStream Goku = new PrintStream(Dragon);*/
	Scanner 명건 = new Scanner(형주); //문자단위로 데이터 읽어들일때 Scanner사용

	/*for(int i= 0; i<nums.length; i++) {
		int num;
		num=형주.read();
		System.out.println(num);
	}
	*/
	int num = 0;
	while((num=형주.read())!=-1) 
		System.out.println(num);
	
	명건.close();
	형주.close();
	
/*	for(int i = 0; i<7; i++)
		Goku.write(nums[i]);
	 //Goku.printf("%d ", nums[i]);

	 Goku.close();
	 Dragon.close();*/
	 
	 System.out.println("Complete");
	}

}

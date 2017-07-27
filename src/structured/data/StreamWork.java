package structured.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamWork {

	public static void main(String[] args) throws IOException {


		double i=0, ar[] = new double[20];        
		double total = 0;
		double avg = 0;

		FileInputStream in = new FileInputStream("res/data.txt");//파일스트림 생성.(파일 연결함.) 
		Scanner sc = new Scanner(in); //Scanner 생성.(파일에서 값을 읽기위함) 
		while (sc.hasNext()) { //읽을 값이 있으면 계속 반복 
			ar[(int) i] = sc.nextDouble(); //값을 읽어서 ar 배열에 저장함. 
			i++; 
		} 
		in.close();  // 파일스트림 닫음.
		sc.close();
		for(i=0; i<ar.length; i++){  //배열에 저장된값 출력 
			total +=ar[(int)i];       
			System.out.println(ar[(int) i]+" ");} 
			System.out.println(total);
		avg = total/ar.length;
		System.out.printf("평균 : %6.2f\n", avg);



	}
}

package wrapping;

public class Program {
	public static void main(String[] args) {

		Integer s = "hello".length();	
		System.out.println(s);

		String s1="hello";
		String s2="okay";

		String s3=s1+s2;
		System.out.println(s3);

		//문자열 더할때 +써도됨.ㅇ

		int n = 3;
		String s4 = Integer.toString(n);
		System.out.println(s4);
		String s5 = String.valueOf(n);
		System.out.println(s5);

		double d = 3.4;
		String sd = Double.toString(d);
		System.out.println(sd);

		double b = Double.parseDouble(sd);
		//문자열을 숫자로 출력

		String name1 = "아이유";
		String name2 = new String("아이유");
		System.out.println(name1==name2); //주소가 같은지 비교(같은객체냐?)
		System.out.println(name1.equals(name2)); //값비교(객체는 다르지만 값은같냐?)

		String str = "photo.jpg";
		System.out.println(str.length());
		System.out.println(str.indexOf("."));
		int end = str.indexOf(".");
		System.out.println(str.substring(0, end));
		
		String str2 = "강호동,유재석,신동엽,김성주";
		
		String[] names= str2.split(",");
		System.out.println(names[1]);
		
}
}

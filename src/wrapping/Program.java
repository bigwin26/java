package wrapping;

public class Program {
	public static void main(String[] args) {

		Integer s = "hello".length();	
		System.out.println(s);

		String s1="hello";
		String s2="okay";

		String s3=s1+s2;
		System.out.println(s3);

		//���ڿ� ���Ҷ� +�ᵵ��.��

		int n = 3;
		String s4 = Integer.toString(n);
		System.out.println(s4);
		String s5 = String.valueOf(n);
		System.out.println(s5);

		double d = 3.4;
		String sd = Double.toString(d);
		System.out.println(sd);

		double b = Double.parseDouble(sd);
		//���ڿ��� ���ڷ� ���

		String name1 = "������";
		String name2 = new String("������");
		System.out.println(name1==name2); //�ּҰ� ������ ��(������ü��?)
		System.out.println(name1.equals(name2)); //����(��ü�� �ٸ����� ��������?)

		String str = "photo.jpg";
		System.out.println(str.length());
		System.out.println(str.indexOf("."));
		int end = str.indexOf(".");
		System.out.println(str.substring(0, end));
		
		String str2 = "��ȣ��,���缮,�ŵ���,�輺��";
		
		String[] names= str2.split(",");
		System.out.println(names[1]);
		
}
}

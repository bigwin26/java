package study;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Parent() call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Parent(String nation) call");
}

}

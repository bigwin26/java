package oop.collec.col;


import java.util.HashMap;
import java.util.Map;

public class TestProgram {

	public static void main(String[] args) {
		
		//List<Integer> list = new ArrayList();
		Map<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이", "26");
		map.put("전화번호", "010-5555-5555");
		System.out.println(map.get("이름"));
		
		for(String key : map.keySet())
			System.out.printf("key:%s, value: %s\n", key, map.get(key));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Set set = new LinkedHashSet();
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(4);
		set.add(11);
		set.add(13);
		set.add(9);
		set.add(5);
		set.add(17);
		set.add(33);
		set.add(1);
		set.add(99);
		
		for(Object o : set)
			System.out.println(o);
		
		*/
			
		
	/*	//GenericList<Integer> list = new GenericList<integer>();
		GenericList<Integer> list = new GenericList<Integer>();

		list.add(3);
		//list.add("hello");
		//list.add(4.5f);
		//list.add(new Exam());


			for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i));

		while(list.hasNext())
			System.out.println(list.next());

		Iterator it = list.iterator();*/

	}
}


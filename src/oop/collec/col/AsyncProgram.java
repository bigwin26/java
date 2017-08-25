package oop.collec.col;

import oop.collec.col.GenericList.Giterator;

public class AsyncProgram {


	private static void download(GenericList<Integer>list, int num) {
		/*	for(int i=0; i<100; i++)
			System.out.printf("%d:%d%%\n",num,list.get(i));*/

		Giterator iter = list.iterator();
		/*while(iter.hasNext())
			System.out.printf("%d:%d%%\n", num, iter.next());			
*/
		for(Integer n : list)
			System.out.printf("%d:%d%%\n", num, n);	
	}
	public static void main(String[] args) {
		GenericList<Integer> list = new GenericList<>();

		for(int i = 1; i<=100; i++)
			list.add(i);

		/*	Thread th1 = new Thread(new Runnable() {

			public void run() {
				download(list,1);
			}
		});
		 */
		/*Thread th1 = new Thread(()->{download(list,1);}); //스레드는 새로운 흐름이다.

		th1.start();*/

		new Thread(()->{download(list,1);}).start();

		download(list,2);
		System.out.println("프로그램 종료");


	}

}

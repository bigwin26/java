package oop.collec.col;

import java.util.Iterator;

public class GenericList<����> implements Iterable<����> {

	private ����[] list;
	private int index;
	private int capacity;
	private int current;

	public GenericList() {
		list = (����[])new Object[3];
		index = 0;
		capacity = 3;
		current=-1;
	}

	public void add(���� object) {
		if(index>=capacity) {
			����[] temp = (����[]) new Object[capacity+2];
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
			capacity = capacity+2;
		}
		list[index++]=object;
	}

	public ���� get(int i) {
		return list[i];
	}

	public int size() {
		return index;
	}

	//--��������ȸ����--
	class Giterator implements Iterator<����>{
		private int current;

		public Giterator() {
			current=-1;
		}	
		public boolean hasNext() {

			++current;

			return index>current;

		}

		public ���� next() {

			return list[current];
		}

	}

	public Giterator iterator() {
		return new Giterator();
	}
}
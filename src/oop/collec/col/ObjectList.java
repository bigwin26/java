package oop.collec.col;

public class ObjectList {

	private Object[] list;
	private int index;
	private int capacity;
	
	public ObjectList() {
		list = new Object[3];
		index = 0;
		capacity = 3;
	}

	public void add(Object object) {
		if(index>=capacity) {
			Object[] temp = new Object[capacity+2];
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
			capacity = capacity+2;
		}
		list[index++]=list;
	}

	public Object get(int i) {
		return list[i];
	}

	public int size() {
		return index;
	}
	
}

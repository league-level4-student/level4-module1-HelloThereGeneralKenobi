package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] tArray = (T[])new Object[0];
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return tArray[loc];
	}
	
	public void add(T val) {
		T[] newArray = (T[]) new Object[tArray.length + 1];
		for(int i = 0; i < tArray.length; i++) {
			newArray[i] = tArray[i];
		}
		newArray[tArray.length] = val;
		
		tArray = newArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[tArray.length + 1];
		for(int i = 0; i < loc; i++) {
			newArray[i] = tArray[i];
		}
		newArray[loc] = val;
		for(int i = loc + 1; i < tArray.length + 1; i++) {
			newArray[i] = tArray[i - 1];
		}
		
		tArray = newArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		tArray[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[tArray.length - 1];
		for(int i = 0; i < loc; i++) {
			newArray[i] = tArray[i];
		}
		for(int i = loc + 1; i < tArray.length; i++) {
			newArray[i - 1] = tArray[i];
		}
		
		tArray = newArray;
	}
	
	public boolean contains(T val) {
		boolean contains = false;	
		for(int i = 0; i < tArray.length; i++) {
			if(tArray[i].equals(val)) {
				contains = true;
			}
		}
		return contains;
	}

	public int size() {
		// TODO Auto-generated method stub
		return tArray.length;
	}
}
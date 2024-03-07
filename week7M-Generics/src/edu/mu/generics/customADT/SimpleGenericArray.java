package edu.mu.generics.customADT;

import java.util.Arrays;
import java.util.HashMap;

public class SimpleGenericArray <T> {

	private T[] array;
	private int size = 0;

	private static final int DEFAULT_CAPACITY = 5;


	public SimpleGenericArray() {
		array = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
	public int getSize() {
		return size;
	}

	public boolean addItem(T item) {
		//		if(size < array.length) {
		//			array[size++] = item;
		//			return true;
		//		}
//		if(size >= array.length) {
//			expandArray();
//		}
//		array[size++] = item;
//		return true;
		return addItemTo(item, size);
	}
	
//	size = 6
//	index = 3
//	6-3 = 3
//	 0 1 2 3 4 5 6 7 8
//	[1,2,3,4,5,6, , , ]
	public boolean addItemTo(T item, int index) {
		if(size >= array.length) {
			expandArray();
		}
		if(index >= 0 && index <= size) {
			System.arraycopy(array, index, array, index + 1, size - index);
			array[index] = item;
			size++;
			return true;
		}
		return false;
	}

	private void expandArray() {
		int newArraySize = array.length * 2;
		T newArray[] = (T[]) new Object[newArraySize];
		System.arraycopy(array, 0, newArray, 0, size);
		array = newArray;
	}

	/**
	 * @param index
	 * @return
	 */
	public boolean removeItemByIndex(int index) {
		if(index >= 0 && index < size) {
			System.arraycopy(array, index + 1, array, index, array.length - index - 1);
			array[--size] = null;
			return true;
		}
		return false;
	}

	public void printArray() {
		System.out.println("Size: " + size);
		for(int i=0; i<size; i++) {
			if(array[i] != null) {
				System.out.print(array[i] + " ");
			}
			else {
				break;
			}
		}
		System.out.println();
	}
}

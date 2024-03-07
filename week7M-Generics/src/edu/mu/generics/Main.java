package edu.mu.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import edu.mu.generics.customADT.BoundedTypeParametersGenerics;
import edu.mu.generics.customADT.CustomMap;
import edu.mu.generics.customADT.GenericData;
import edu.mu.generics.customADT.GenericInterface;
import edu.mu.generics.customADT.ProductA;
import edu.mu.generics.customADT.ProductB;
import edu.mu.generics.customADT.SimpleGenericArray;
import edu.mu.generics.customADT.WildcardMethodGenericExample;

public class Main {

	public static void main(String[] args) {

//		GenericData<Integer> gInt = new GenericData<Integer>();
//		gInt.setData(5);
//		System.out.println("Generic Data Integer: " + gInt.getData());
//		
//		GenericData<String> gStr = new GenericData<String>();
//		gStr.setData("Hello!");
//		System.out.println("Generic Data String: " + gStr.getData());
		
		SimpleGenericArray<Integer> genericObj = new SimpleGenericArray<Integer>();
		genericObj.addItem(5);
		genericObj.addItem(2);
		genericObj.addItem(3);
		genericObj.addItem(8);
		genericObj.addItem(10);
		System.out.println(genericObj.addItem(2));
		genericObj.printArray();
		genericObj.removeItemByIndex(4);
		genericObj.printArray();
		genericObj.addItemTo(-1, 2);
		genericObj.addItemTo(-5, genericObj.getSize());
		genericObj.addItemTo(-7, 0);
		System.out.println(genericObj.addItemTo(-9, genericObj.getSize()+100));
		genericObj.printArray();
		
		BoundedTypeParametersGenerics<Double> obj = new BoundedTypeParametersGenerics<>();
		List<Double> intList = new ArrayList<>();
		intList.add(1.0);
		intList.add(2.0);
		intList.add(3.0);
		System.out.println("Sum: " + obj.sumOfAllData(intList));
		
		
		WildcardMethodGenericExample wildcardExample = new WildcardMethodGenericExample();
		System.out.println("Average: " + wildcardExample.average(intList));

		
		ProductA pa = new ProductA();
		ProductB pb = new ProductB();
		
		List<GenericInterface<?>> list = new ArrayList<>();
		list.add(pa);
		list.add(pb);
		
//		HashMap<String,Integer> map = new HashMap<>();
		
		CustomMap<Integer, String> map = new CustomMap<Integer, String>();
		map.addKeyValue(0, "Ekin");
		map.addKeyValue(1, "John");
		map.addKeyValue(2, "Jane");
		
		map.printKeyList();
		map.printValueList();
		map.printKeyValueList();
		
//		for(GenericInterface<?> product : list) {
//			System.out.println(product.getClass().getInterfaces()[0].);
//		}
		

//		
//		Integer array[] = {1,2,3,4,5};
//		Integer indexRemove = 1;
//		System.out.println("Print array: ");
//		Arrays.stream(array).forEach(System.out::println);
//		System.arraycopy(array, indexRemove + 1, array, indexRemove, array.length - indexRemove - 1);
//		array[array.length-1] = null;
//		System.out.println("Print array: ");
//		Arrays.stream(array).forEach(System.out::println);
	}
}

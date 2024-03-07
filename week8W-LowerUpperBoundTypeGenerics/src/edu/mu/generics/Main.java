package edu.mu.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Apple> appleBasket = new ArrayList<>();
		appleBasket.add(new Apple());
		appleBasket.add(new Apple());
		
		List<Banana> bananaBasket = new ArrayList<>();
		bananaBasket.add(new Banana());
		
		List<Fruit> fruitBasket = new ArrayList<>();
		fruitBasket.add(new Apple());
		fruitBasket.add(new Banana());
		
		LowerBoundedTypeParameterGenerics obj = new LowerBoundedTypeParameterGenerics();
		obj.copy(appleBasket, fruitBasket);
		
		System.out.println("Fruit basket size: " + fruitBasket.size());
		for(Fruit f : fruitBasket) {
			System.out.println(f);
		}

	}

}

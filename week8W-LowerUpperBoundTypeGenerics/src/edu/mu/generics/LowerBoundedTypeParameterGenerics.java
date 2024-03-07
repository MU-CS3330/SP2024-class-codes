package edu.mu.generics;

import java.util.List;

public class LowerBoundedTypeParameterGenerics {
	
	public <T> void copy(List<T> src, List<? super T> dst) {
		for(T data : src) {
			dst.add(data);
		}
	}
	
	public <T> void copy2(List<? extends T> src, List<T> dst) {
		for(T data : src) {
			dst.add(data);
		}
	}

}

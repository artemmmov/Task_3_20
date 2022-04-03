package ru.vsu.cs.ovsyannikov.util;

public interface DataStructure<T> {
	
	T pop();
	
	void push(T t);
	
	boolean isEmpty();
}

package com.dornel.java8update.interfacefuncional;

@FunctionalInterface
public interface Validador<T> {
	public boolean validar(T t);
	
	default String removeMask(T t){
		return t.toString().replaceAll("[-.]","");
	}
}

package com.dornel.java8update.interfacefuncional;

public class CEPValiddor implements Validador<String>{

	@Override
	public boolean validar(String t) {		
		return t.matches("[0-9]{5}-[0-9]{3}");
	}

	
	
}

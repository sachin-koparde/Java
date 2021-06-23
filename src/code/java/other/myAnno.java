package code.java.other;

import java.lang.reflect.Method;

public class myAnno {
	
	@Greet(welcome = "Developer")
	public void greetings()
	{
		System.out.print("Welcome ");
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException{
		myAnno ma = new myAnno();
		//ma.greetings();
		Method m = ma.getClass().getMethod("greetings") ;
		Greet g = m.getAnnotation(Greet.class);
		System.out.print(g.welcome());				
		
	}

}

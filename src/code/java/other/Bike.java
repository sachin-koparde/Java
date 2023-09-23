package code.java.other;

public class Bike implements Comparable<Bike>{
	String name; 
	Integer milage, price;
	public Bike(String a, int b, int c) {
		name = a;
		milage = b;
		price = c;
	}
	
	public String toString() {
		return name+" "+milage+" "+price+"\n";
	}

	@Override
	public int compareTo(Bike o) {
		// 
		return this.name.compareTo(o.name);
	}

}

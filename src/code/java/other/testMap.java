package code.java.other;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class testMap {
	public static void main(String[] args) {
		Hashtable<String, Double> kart = new Hashtable<String, Double>();
		kart.put("Dell", 35000.0);
		kart.put("HP", 42000.0);
		kart.put("Acer", 35000.0);
		kart.put("MacBookAir", 98000.5);
		System.out.println(kart);
		TreeMap<String, Double> wish = new TreeMap<String, Double>();
		wish.putAll(kart);
		System.out.println(wish);
		System.out.println(wish.get("Dell"));
		kart.remove("HP");
		System.out.println(kart);
		System.out.println(wish.containsKey("MacBookAir"));
		System.out.println(wish.containsValue(35000.0));
		Set<String> st = wish.keySet();
		System.out.println(st);
		System.out.println(wish.values());
		
	}
}

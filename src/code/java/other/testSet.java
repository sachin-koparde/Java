package code.java.other;

import java.util.HashSet;
import java.util.TreeSet;

public class testSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> setOne = new HashSet<Double>();
		setOne.add(4.5);
		setOne.add(78.1);
		setOne.add(45.3);
		setOne.add(12.6);
		System.out.println(setOne);
		TreeSet<Double> setTwo = new TreeSet<Double>();
		setTwo.addAll(setOne);
		System.out.println(setTwo);
		setOne.remove(78.1);
		System.out.println(setOne);
	}

}

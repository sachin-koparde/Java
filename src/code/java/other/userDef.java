package code.java.other;

import java.util.Iterator;
import java.util.TreeSet;

public class userDef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Bike> tree = new TreeSet<Bike>();
		tree.add(new Bike("Pulsar",45,75000));
		Bike b1 = new Bike("Yamaha",30,82000);
		Bike b2 = new Bike("Hero",45,90000);
		Bike b3 = new Bike("Honda",30,80000);
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		Iterator<Bike> i = tree.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
	}

}

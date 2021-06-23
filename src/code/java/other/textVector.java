package code.java.other;

import java.util.Collections;
import java.util.Vector;

public class textVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> team = new Vector<String>();
		Vector<String> teamDev = new Vector<String>();
		Vector<String> teamTest = new Vector<String>();
		teamDev.add("Sharan");
		teamDev.add("Shivan");
		teamDev.add("Prem");
		teamDev.add("Murali");
		teamTest.add("Ramya");
		teamTest.add("Divya");
		teamTest.add("Radhika");
		teamTest.add("Ranjan");
		team.addAll(teamDev);
		team.addAll(teamTest);
		System.out.println("The team members are: "+team);
		Collections.replaceAll(teamTest, "Ramya", "Maneka");
		System.out.println(teamTest);
		teamDev.set(2, "Sudeep");
		System.out.println(teamDev);
		team.retainAll(teamDev);
		System.out.println(team);
		team.removeAll(teamDev);
		System.out.println(team);
		team.addAll(teamDev);
		team.addAll(teamTest);
		System.out.println(team);
	}

}

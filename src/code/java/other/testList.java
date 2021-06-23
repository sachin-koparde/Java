package code.java.other;

import java.util.Stack;

public class testList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ins = new Stack();
		ins.push("Angular");
		ins.push(4500);
		ins.push(true);
		ins.push("R");
		System.out.println(ins);
		System.out.println(ins.search(true));
		System.out.println(ins.peek());
		ins.pop();
		System.out.println(ins.peek());
		System.out.println(ins);
		ins.clear();
		System.out.println(ins);

	}

}

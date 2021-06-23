package code.java.other;


interface quick
{
	public void heal();
}

public class Simple 
{
	public static void main(String[] args) 
	{
		quick q=()->
		{
			System.out.println("Heal bad thoughts!");
		};
		q.heal();
	}
}

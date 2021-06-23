package code.java.other;

import java.util.InputMismatchException;
import java.util.Scanner;

public class job {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String[] career = {"java","spring","react","r","python","swift"};
		System.out.println("Enter the skillset: ");
		String skillSet = scan.nextLine();
		try
		{
		for(int i=0; i<career.length;i++)
		{
			if(career[i].equals(skillSet))
			{
				System.out.println("The entered skill set is avilable: "+skillSet);
				count =1;
				break;
			}
		}
		   
		if(count==0)
		{
			throw new SkillNotFoundException();
		}
		}
		catch(SkillNotFoundException e)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(e);
			System.out.println("Enter the skillset: ");
			String skillSet2 = sc.nextLine();
			
			for(int i=0; i<career.length;i++)
			{
				if(career[i].equals(skillSet2))
				{
					System.out.println("The entered skill set is avilable: "+skillSet2);
					break;
				}
			}
		}
		finally
		{
			System.out.println("Process is successfully Completed.");
		}
	}
}
	


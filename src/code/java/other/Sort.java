package code.java.other;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {10, 40, 20, 500, 30};
		int[] B = {15, 25, 35, 45, 55};
		int[] C = new int[A.length];
		for(int i=0;i<A.length;i++)
		{
			C[i] = A[i];
		}
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]<A[i])
				{
					int temp = A[i];
					A[i] = A[j];
					A[j] =temp;
				}
			}
		}	
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<C.length;j++)
			if(C[j]==A[i])
			{
			System.out.print(A[i]+""+B[j]+" ");
		    }
	    }
	}

}

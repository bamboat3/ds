

public class CountingSort {

	static int[] C;
	static int[] B;
	
	public static int findMax(int[] A)
	{
		int max = Integer.MIN_VALUE;
		
		for (int i=0;i<A.length;i++) 
		{
			if(A[i]>max)
				max = A[i];			
		}//end for
		
		return max;
	}//end findMax
	
	public static void createRanking(int[] A)
	{
		//array size = maximum element in the array A
		C = new int[findMax(A)+1];
		
		//initialize the array with zeros
		for(int i=0;i<C.length;i++)
			C[i] = 0;
		
		//start ranking 
		for(int j=0;j<A.length;j++)
			C[A[j]]++;
	
		System.out.print("ranking -> ");
		for(int k=0;k<C.length;k++)
			System.out.print(C[k]+",");
		
		System.out.println();		
		System.out.print("extra spaces -> ");
		
		//create extra spaces as C.length < A.length
		for(int i=2;i<C.length;i++)
			C[i] = C[i] + C[i-1];
		
		for(int k=0;k<C.length;k++)
			System.out.print(C[k]+",");
	}//end 
	
	public static int[] sortedArray(int[] A)
	{
		B = new int[A.length];
		
		for(int i=0;i<A.length;i++) 
		{
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}
		return B;
	}
	
	public static void main(String[] args) {
		
			int[] A = {7,1,3,1,2,4,5,7,2,4,3};
			
			createRanking(A);
			
			int[] B = sortedArray(A);
			
			System.out.println();
			System.out.print("Original Array 'A' -> ");
			for(int i=0;i<A.length;i++)
				System.out.print(A[i]+",");
			
			System.out.println();
			System.out.print("Sorted Array 'B' -> ");
			for(int i=0;i<B.length;i++)
				System.out.print(B[i]+",");
	}//end main

}//end class

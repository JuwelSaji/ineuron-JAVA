package com.demo.Patterns;




class IneuronWithPattern{
	
	int n=10;
	
	public void printIneuronInPattern() {
	
	System.out.println();
	System.out.println();
	System.out.println("Question 1:");
	System.out.println();
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			if(j==(n-1)/2 && i!=1)
			System.out.print("* ");
		else
			System.out.print(" ");
		}
		
		System.out.println();

	}
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			if(j==0 || i==j || j==(n-1))
				System.out.print("* ");
			else
				System.out.print(" ");
		}
		System.out.println();

	}
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			if(j==0 || i==0 || i==(n-1)/2 || i==(n-1))
				System.out.print("* ");
			else
				System.out.print(" ");
		}
		System.out.println();

	}
	
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			if(j==0 || i==(n-1) || j==(n-1))
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();

	}
	
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			if(j==0 || i==0 || j==(n-1) && i<(n-1)/2 || i-j==(n-3)/2 || i==(n-1)/2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();

	}
	
	System.out.println();
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
//			System.out.print("* ");
			
			if(j==0 && i!=0 && i!=(n-1) || i==0 && j!=0 && j!=(n-1)|| i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!=0 && i!=(n-1))
//			if(i==0 || j==0 || i==n-1 || j==n-1)

				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			if(j==0 || i==j || j==(n-1))
				System.out.print("* ");
			else
				System.out.print(" ");
		}
		System.out.println();

	}
	
}
}

//======================================================================================================




class NumbrPattern{
	int n=5;
	 
	public void printNumberPattern() {
		
	System.out.println();
	System.out.println();
	System.out.println("Question 2:");
	System.out.println();
	
	for(int i=1;i<n;i++) {
		for(int j=1;j<n;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

}




//=================================================================================================================




class Pattern{
	
	int n=10;
	
	public void starPatterns() {
	
	/*Question 3*/
	System.out.println();
	System.out.println();
	System.out.println("Question 3:");
	System.out.println();
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || j==0 || i==(n-1) || j==(n-1) || i+j<=(n-1)/2 || j-i>=(n-1)/2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
	System.out.println();
	System.out.println("Question 4:");
	System.out.println();
	
	/*Question 4*/
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if( j==0 && i>=(n-1) || i==(n-1) || j==(n-1) && i>=(n-1) || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
	
	System.out.println();
	System.out.println("Question 5:");
	System.out.println();
	
	/*Question 5*/
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || j==0 || i==(n-1) || i+j<=(n-1)/2 || i-j>=(n-1)/2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}

	}
}








public class Patterns {

	public static void main(String[] args) {
		
		IneuronWithPattern ineuronWithPattern = new IneuronWithPattern();
		ineuronWithPattern.printIneuronInPattern();
		
		NumbrPattern numbrPattern = new NumbrPattern();
		numbrPattern.printNumberPattern();
		
		Pattern pattern = new Pattern();
		pattern.starPatterns();
	}

}

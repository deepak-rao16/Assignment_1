//Que13: Implement a JAVA program to find the max and min of given two numbers.
class Max_min{
	public static void main(String[] args){
			double n1=8;
			double n2=3;
			
			if(n1>n2)  // max of two numbers
				System.out.println("The Max numbers between "+n1+" and "+n2+" is: "+n1);
			else	
				System.out.println("The Max numbers between "+n1+" and "+n2+" is: "+n2);
			
			
			if(n1<n2)  // min of two numbers
				System.out.println("The Minimum numbers between "+n1+" and "+n2+" is: "+n1);
			else	
				System.out.println("The Minimum numbers between "+n1+" and "+n2+" is: "+n2);
	}	
}
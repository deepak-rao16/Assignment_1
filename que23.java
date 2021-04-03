//Que23: Implement a Java program to check whether a number is a Harshad Number or not.

class Harshad{
	
	public static void main(String[] args){
		int n=171;
		int original=n;
		int rem,sum=0;
		
		while(n!=0){
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		
		if(original%sum==0)
			System.out.println("The given number: "+original+" is a Harshad number");
		
		else
			System.out.println("The given number: "+original+" is Not a Harshad number");
	}
}
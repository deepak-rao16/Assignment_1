//Que19: Implement a Java program to calculate the Binomial Coefficient of two positive numbers

class Binomial_coefficient{
	static int factorial(int x){
		int fact=1;
		for(int i=1;i<=x;i++){
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args){
		int n=10;
		int r=3;
		
		long coeffi=(factorial(n)/(factorial(r)*factorial(n-r)));
		
		System.out.println("Binomial Coefficient of n:"+n+" and r: "+r+" is: "+coeffi);
	}
}
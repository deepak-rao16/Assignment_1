//Que7: Implement a JAVA program to find the GCF  and LCM of given numbers. // does not work
class GCF_LCM{
	public static void main(String[] args){
		int n1=40;
		int	n2=30; 
		int gcd, lcm, rem, numerator, denominator;
		
		if(n1>n2){
			numerator=n1;
			denominator=n2;
		}
		
		else {
			numerator=n2;
			denominator=n1;
		}
			
		rem=numerator%denominator;
		
		while(rem!=0){
			numerator=denominator;
			denominator=rem;
			rem=numerator%denominator;
		}

		gcd=denominator;
		lcm=(n1*n2)/gcd;
		
		System.out.println("For n1: "+n1+" and n2: "+n2+"\nThe GCD: "+gcd+" and LCM: "+lcm);
	}
}	
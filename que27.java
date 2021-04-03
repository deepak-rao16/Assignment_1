//Que27: Implement a Java program to check two numbers are Amicable numbers or not.

class Amicable{
	public static void main(String[] args){
		int n1=220, n2=284;
		int sum1=0, sum2=0;
		int i;
		
		
		for(i=1;i<=n1;i++){
			if((n1%i)==0)
				sum1+=i;
		}

		for(i=1;i<=n2;i++){
			if((n2%i)==0)
				sum2+=i;
		}

		if(sum1==sum2)
			System.out.println("For given numbers: "+n1+" and "+n2+", These numbers are Amicable");
		
		else
			System.out.println("For given numbers: "+n1+" and "+n2+", These numbers are Not Amicable");
	}
}
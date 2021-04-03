//Que44: Implement a java program to count the repeated occurrence of a digit in a n-digit number.

class Count_occourance{
	public static void main(String[] args){
		/*int n=5, x, count=0, i=0;
		int a[]=new int[n];*/
		
		int n=3587773;
		int check=7;
		int count=0;
		int rem;
		
		while(n>0){
			rem=n%10;
			if(check==rem)
				count++;
			
			n/=10;
		}
		System.out.println("Number of count of: "+check+", is : "+count);
	}
}
		
		
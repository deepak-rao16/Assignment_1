//Que14: Implement a JAVA program to find the Mean of given 5 numbers

class Mean_five{
	public static void main(String[] args){
		
		int a[]={2,4,6,7,10};
		int sum=0, n=5,i;
		float ave=0;
		
		for( i=0;i<n;i++)
			sum+=a[i];
		
		System.out.println("The value of 5 numbers: "+sum);
		
		ave=sum/(float)n;
		
		System.out.println("\nAverage of 5 numbers are: "+ave);
	}
}
		
		
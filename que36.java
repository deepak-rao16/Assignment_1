//Que36: Implement a Program in Java to check whether a number is a Keith Number or not

class Keith_number{
	public static void main(String[] args){
		int n=14; // 197
		int original=n;
		String s=Integer.toString(n);
		int d=s.length();
		int n1=n;
		
		int a[]=new int[n];
		int i,j,sum=0;
		
		for(i=d-1;i>=0;i--){
			a[i]=n1%10;
			n1/=10;
		}
		i=d;
		
		while(sum<n){
			sum=0;
			for(j=1;j<=d;j++)
				sum=sum+a[i-j];
			
			a[i]=sum;
			i++;
		}
		if(sum==n)
			System.out.println(original+" : Given number is a Keith number");
		
		else
			System.out.println(original+" : Given number is Not a Keith number");
	}
}
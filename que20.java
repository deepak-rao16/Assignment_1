//Que20: Implement a Java program to print all prime factors of a given number

class Prime_factors{
	public static void main(String[] args){
		int n=50;
		System.out.println("Prime Factors of :"+n+" is :");
		
		for(int i=2;i<n;i++){
			while(n%i==0){
				System.out.println(i+" ");
				n/=i;
			}
		}
		
		if(n>2)
			System.out.println(n);
	}
}	
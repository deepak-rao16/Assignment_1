//Que25: Implement a Java program check whether a number is an Automorphic number or not.

class Automorphic_Number{
	static boolean automorphic(int n){
		int sq=n*n;
		
		while(n>0){
			if(n%10!=sq%10)
				return false;
			
			n/=10;
			sq/=10;
		}
		return true;
	}
	
	public static void main(String[] args){
		int n=5;
		
		System.out.println(automorphic(n) ? +n+" :is a Automorphic number " : +n+" :is Not a Automorphic number ");
	}
}
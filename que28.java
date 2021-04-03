//Que28: Implement a Java program to check if a given number is circular prime or not.

class Circular_Prime{
	static boolean prime(int n){
		int i;
		
		for(i=2;i<n;i++){
			if((n%i)==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		int n=131,i;
		int l=String.valueOf(n).length();
		int test=1, digit;
		int original=n;
		
		for(i=0;i<n-1;i++)
			test=test*10;
		
		for(i=0;i<l-1;i++){
			digit=n%10;
			n/=10;
			n=(digit*test)+n;
				
			if(prime(n)){
				System.out.println("The given number is Circular Prime: "+original);
				System.exit(0);
			}
			else {
				System.out.println("The given number is Not Circular Prime: "+original);
				System.exit(0);
			}
		}
	}
}

			
			
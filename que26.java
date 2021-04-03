//Que26: Implement a Java program to check whether a number is a Duck Number or not

class Duck_number{
	public static void main(String[] args){
		int n=1024;
		int original=n;
		System.out.println("Given number : "+original);
		
		while(n!=0){
			if((n%10)==0){
				System.out.println("Given number is duck number");
				System.exit(0);
				//break;
			}
				
			else
				n/=10;
		}
		System.out.println("Given number is Not a duck number");
	}
}
			
					
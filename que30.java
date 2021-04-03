//Que30: Implement a Java program to check a number is a cyclic or not.

class Cyclic_number{
	
	public static void main(String[] args){
		int n=142857;
		int original=n;
		int count=0;
		int l=String.valueOf(n).length();
		int test=1;
		int i,j,digit;
	
		for(i=0;i<l-1;i++)
			test=test*10;
	
		for(i=0;i<l;i++){
			digit=n%10;
			n/=10;
			n=(digit*test)+n;
		
			for(j=1;j<=l;j++){
				if(n==(original*j))
					count++;
			}
		}	
	
		if(count==l)
			System.out.println("Given number is Cyclic");
	
		else
			System.out.println("Given number is Not Cyclic");
	}
}

		
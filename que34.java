//Que34: Implement a Java program to find all the narcissistic numbers between 1 and 1000.

class Narcissistic_number{
	
	static boolean narcissistic(int n){
		int l=String.valueOf(n).length();
		int i,sum=0,digit;
		int original=n;
		
		while(n>0){
			digit=n%10;
			n/=10;
			sum+=(int)Math.pow(digit,l);
		}
		
		if(sum==original)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		for(int i=1;i<=1000;i++){
			if(narcissistic(i))
				System.out.println(i);
		}
	}
}
